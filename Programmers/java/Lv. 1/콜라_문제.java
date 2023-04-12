/**
 * 콜라 문제 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */


class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int cola = 0;
        while(n > a-1) {
        	cola = n/a*b;
        	answer += cola;
        	n = n%a + cola;
        }
        return answer;
    }
}