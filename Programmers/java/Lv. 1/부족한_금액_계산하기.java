/**
 * 부족한 금액 계산하기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/82612
 */

class Solution {
    public long solution(long price, int money, int count) {
        long answer = 0;
        //p*1 + p*2 + p*3 +...p*n = p(1+2+3+...+n) = p(n(n+1)/2)
        
        answer = Math.max(price*count*(count+1)/2 - money, 0);
        
        return answer;
    }
}