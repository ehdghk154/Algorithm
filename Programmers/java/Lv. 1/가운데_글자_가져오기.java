/**
 * 가운데 글자 가져오기(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        // 글자수가 짝수일 경우
        if(s.length() % 2 == 0) {
        	// 가운데 두 자리 글자 입력
            sb.append(s.charAt(s.length()/2-1)).append(s.charAt(s.length()/2));
        // 글자수가 홀수일 경우
        }else if(s.length() % 2 == 1) {
        	// 가운데 한 자리 글자 입력
            sb.append(s.charAt(s.length()/2));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}