/**
 * x만큼 간격이 있는 n개의 숫자 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i++) {
        	// 계산 과정 중 x*(i+1)을 하면 범위를 벗어나는 경우가 있기에
        	// 1L을 더해 long 타입으로 변경
            answer[i] = x*(i+1L);
        }
        return answer;
    }
}