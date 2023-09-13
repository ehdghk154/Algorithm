/**
 * 올바른 괄호(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0; // 괄호 판단
        
        /**
         * 양수 방향으로 증가 -> 0으로 끝나면 올바른 괄호
         * count가 음수로 내려가면 ")" 괄호가 올바르지 않게 있는 것으로 틀림
         */
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') count++;
            else count--;
            if(count < 0) break;
        }
        
        // count가 0이 아닐 시 올바르지 않은 괄호
        if(count != 0) answer = false;
        
        return answer;
    }
}