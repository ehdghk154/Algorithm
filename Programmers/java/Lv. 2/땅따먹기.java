/**
 * 땅따먹기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12913
 */

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dp = new int[land.length+1][land[0].length];
        
        /**
         * 현재 열과 동일한 열을 제외한, 이전 행의 다른 열들의 값을 더한 것 중 최댓값을 저장
         * [1] [2] [3] [5]
         * [5] [6] [7] [8]
         * [4] [3] [2] [1]
         * 이 땅을 예시로 하면
         * 각 현재 열마다 같은 열을 제외한 이전 열의 계산 값을 더하므로
         * [max(1+0, 1+0, 1+0)] [max(2+0, 2+0, 2+0)] [max(3+0, 3+0, 3+0)] [max(5+0, 5+0, 5+0)]
         * [max(5+2, 5+3, 5+5)] [max(6+1, 6+3, 6+5)] [max(7+1, 7+2, 7+5)] [max(8+1, 8+2, 8+3)]
         * [max(4+11, 4+12, 4+11)] [max(3+10, 3+12, 3+11)] [max(2+10, 2+11, 2+11)] [max(1+10, 1+11, 1+12)]
         * 형태가 된다.
         */
        for(int i = 1; i <= land.length; i++) {
            for(int j = 0; j < land[0].length; j++) {
                for(int k = 0; k < land[0].length; k++) {
                    if(j == k) continue;
                    
                    dp[i][j] = Math.max(dp[i][j], land[i-1][j] + dp[i-1][k]);
                }
            }
        }
        
        // 계산 후 마지막 행에 있는 값 중 가장 큰 값을 answer에 입력
        for(int i = 0; i < land[0].length; i++) {
            answer = Math.max(answer, dp[land.length][i]);
        }

        return answer;
    }
    
}