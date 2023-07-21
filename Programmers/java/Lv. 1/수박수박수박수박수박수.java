/**
 * 수박수박수박수박수박수?(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */

class Solution {
    public String solution(int n) {
        String answer = "";
        // n이 최대 10000이므로 먼저 "수박수박수..."를 1만자까지 생성
        String word = "수박".repeat(5000);

        // n까지의 문자를 substring으로 자르기
        answer = word.substring(0, n);

        return answer;
    }
}