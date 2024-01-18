/**
 * 2xn 타일링(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12900
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] dp = new int[n];
        // 가로 길이에 따라 방법이 1,2,3,5,8,... 식으로 증가하는 피보나치 수열
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < dp.length; i++) {
            dp[i] = (dp[i-2] + dp[i-1])%1000000007;
        }
        
        answer = dp[n-1];
        
        return answer;
    }
}