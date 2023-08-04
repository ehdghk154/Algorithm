/**
 * 두 정수 사이의 합(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 */

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b) {
            answer = a;
        }
        /**
         * 등차수열의 합 공식 이용 
         * a < b 가정, 1~b까지의 합 - 1~(a-1)까지의 합 = a~b까지의 합
         * b*(b+1)/2-a*(a-1)/2
         * -> (b*(b+1)-a*(a-1))/2
         * -> (2b+b-2a+a)/2 -> (a+b-2a+2b)/2
         * -> (a+b)(1-a+b)/2
         */   
        else if(a < b) {
            answer = (long)(a+b)*(1-a+b)/2;
        }else {
            answer = (long)(a+b)*(1-b+a)/2;
        }
        
        return answer;
    }
}