/**
 * 문자열 내 p와 y의 개수(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // p일 경우 count 1 추가
            if(c == 'p' || c == 'P') count++;
            // y일 경우 count 1 감소
            else if(c == 'y' || c == 'Y') count--;
        }
        // count가 0일 경우 p와 y 개수 동일
        answer = count == 0 ? true : false;
        
        return answer;
    }
}