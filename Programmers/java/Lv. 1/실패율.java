/**
 * 실패율 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/42889
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] challenger = new int[N+2];
        int passer = stages.length; // 도전자 + 통과자 (첫 스테이지는 모든 인원)
        
        // 스테이지별 도전중인 플레이어(challenger) 수 확인
        for(int stage : stages) {
            challenger[stage]++;
        }
        
        // 해당 스테이지를 통과자와 도전자를 합한 플레이어 수로 나누면 실패율(실패율 = 도전자/(도전자+통과자))
        double[] fail = new double[N+1];
        for(int i = 1; i <= N; i++) {
            fail[i] = (double)challenger[i]/passer;
            // 다음 스테이지로 넘어갈 때 현재 스테이지 도전자를 빼면, 다음 스테이지의 도전자 + 통과자가 됨
            passer -= challenger[i];
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i < fail.length; i++) {
            if(i == 1) // list에 처음 스테이지를 추가할 때
                list.add(i);
            else { // 실패율이 높은 스테이지를 앞으로 배치
            	int size = list.size();
            	for(int j = 0; j < size; j++) {
            		if(fail[list.get(j)] < fail[i]) {
            			list.add(j, i);
            			break;
            		}
            	}
            	// list에 추가된 스테이지들보다 실패율이 작으면 맨 뒤에 추가
            	if(size == list.size()) list.add(i);
            }
        }

        for(int i = 0; i < N; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}