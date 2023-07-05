/**
 * 짝수와 홀수 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12937
 */

class Solution {
    public String solution(int num) {
        String answer = "";
        // num이 짝수일 경우
        if(num%2 == 0) answer = "Even";
        // num이 홀수일 경우
        else answer = "Odd";
        return answer;
    }
}