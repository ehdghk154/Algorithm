/**
 * H-Index(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42747
 */

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        // 많이 인용된 논문부터 계산하기 위해 정렬
        Arrays.sort(citations);
        
        // 가장 큰 citations의 마지막 원소를 기준으로 역순으로 반복문 진행
        for(int i = citations[citations.length-1]; i > 0; i--) {
        	int count = 0;
        	// i번 이상 인용된 논문 카운트
        	for(int j = citations.length-1; j >= 0; j--) {
        		if(citations[j] >= i) count++;
                else break;
        	}
        	// i번 이상 인용된 논문이 i개 이상이라면 H-Index 는 i 
        	if(i <= count) {
        		answer = i;
        		break;
        	}
        }
        
        return answer;
    }
}