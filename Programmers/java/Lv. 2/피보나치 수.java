/**
 * 피보나치 수(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12945
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] F = new int[n+1];
        F[0] = 0;
        F[1] = 1;
        F[2] = 1;
        
        // n까지의 피보나치 수 계산 반복문
        for(int i = 3; i <= n; i++) {
        	// F 배열이 int형이기 때문에(범위문제)
        	// 계산할 때 1234567로 나눈 나머지를 F[i]에 입력
            F[i] = (F[i-2] + F[i-1])%1234567;
        }
        // 계산한 n번째 피보나치 수 answer에 입력
        answer = F[n];
        
        return answer;
    }
}