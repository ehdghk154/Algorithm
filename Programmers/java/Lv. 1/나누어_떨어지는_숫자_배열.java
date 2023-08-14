/**
 * 나누어 떨어지는 숫자 배열(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0, idx = 0; i < arr.length; i++) {
        	// divisor로 나누어 떨어지는 숫자 list에 추가
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        // list의 크기가 0이면 answer의 크기는 1, 
        // 0이 아니면 answer의 크기 = list의 크기
        int[] answer = new int[list.size() == 0 ? 1 : list.size()];
        
        // divisor로 나누어 떨어지는 숫자가 없으면 -1
        if(list.size() == 0) {
            answer[0] = -1;
        }else {
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            // 오름차순 정렬
            Arrays.sort(answer);
        }
        
        return answer;
    }
}