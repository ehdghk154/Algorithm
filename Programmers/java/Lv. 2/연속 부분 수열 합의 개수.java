/**
 * 연속 부분 수열 합의 개수(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/131701
 */

import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        // 중복된 수는 제거하기 위해 HashSet 사용
        HashSet<Integer> set = new HashSet<>();
        
        // 연속된 수를 1개부터 n개까지 반복하기 위해 시작 지점을 정하여 반복
        for(int i = 0; i < elements.length; i++) {
        	int sum = 0; // 연속된 수의 합
        	// i부터 1개, 2개, ..., n-1개의 합 구하기
        	for(int j = 0; j < elements.length-1; j++) {
        		sum += elements[(i+j)%elements.length];
            	set.add(sum);
        	}
        }
        
        // n개의 합은 모두 중복되므로 set의 크기에 1개 더함
        answer = set.size()+1;
        
        return answer;
    }
}