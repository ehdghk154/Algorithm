/**
 * 멀리 뛰기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12914
 */

class Solution {
    public long solution(int n) {
        long answer = 0;
        int[] num = new int[n+1];
        
        if(n <= 3) {
            answer = n;
        }else {
            num[1] = 1;
            num[2] = 2;
            num[3] = 3;
            for(int i = 4; i <= n; i++) {
                num[i] = (num[i-2] + num[i-1])%1234567;
            }
            answer = num[n];
        }
        
        
        return answer;
    }
}