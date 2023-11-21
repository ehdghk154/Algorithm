/**
 * 기능개발(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586
 */

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        // 같이 배포되는 기능 개수 저장
        ArrayList<Integer> list = new ArrayList<>();
        int day = 1; // 작업 일수
        int count = 0; // 같이 배포되는 기능 개수
        for(int i = 0; i < progresses.length; i++) {
        	// 현재 기능이 개발되어야 다음 기능이 배포 가능하므로
        	// 현재 기능이 100% 개발 될 때까지 반복
            while(true) {
            	// 현재 기능이 100% 개발 되었다면 count 1 추가
                if(progresses[i]+(speeds[i]*day) >= 100) {
                    count++;
                    break;
                }
                // 개발된 기능(count)가 있는데
                // 현재 기능이 day번째 날에 개발 완료되지 않았다면
                // 현재까지 개발된 기능 먼저 배포
                if(count != 0) {
                    list.add(count);
                    count = 0;
                }
                // 개발된 기능이 없고, 
                // 현재 기능이 100%가 아니라면 day 1 추가
                day++;
            }
        }
        // 마지막에 개발된 기능 배포
        // (배포하는 if문이 while문 안에 있어서 마지막 배포는 따로 추가)
        list.add(count);
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}