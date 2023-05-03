/**
 * 3진법 뒤집기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */

class Solution {
    public int solution(int n) {
        int answer = 0;

        String reverse = "";

        while(n >= 3) {
            reverse += n%3;
            n /= 3;
        }
        reverse += n;

        answer = Integer.parseInt(reverse, 3);

        return answer;
    }
}