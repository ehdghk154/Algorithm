/**
 * n^2 배열 자르기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/87390
 */

class Solution {
    public int[] solution(int n, long left, long right) {
        int length = (int)(right-left+1); // 배열의 크기
        int[] answer = new int[length];
        int j = 0;
        for(long i = left; i <= right; i++) {
        	// 배열의 각 원소값은 
        	// 원소가 있는 배열의 세로 크기(i/n), 
        	// 배열의 가로 크기(i%n) 중 큰 값에
        	// +1을 한 값과 같음
            answer[j++] = (int)Math.max(i/n, i%n) + 1;
        }
        
        return answer;
    }
}