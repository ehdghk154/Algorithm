/**
 * 정수_제곱근_판별(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */

class Solution {
    public long solution(long n) {
        long answer = 0;
        double sq = Math.sqrt(n); // 제곱근
        //제곱근을 1로 나눈 나머지에 소숫점 아래 값이 없을 경우(n이 sq의 제곱일 경우)
        if(sq % 1 == 0.0) answer = (long)Math.pow(sq + 1, 2);
        //소숫점 아래 값이 있을 경우(n이 sq의 제곱이 아닐 경우)
        else answer = -1;
        return answer;
    }
}