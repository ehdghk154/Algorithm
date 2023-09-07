/**
 * JadenCase 문자열 만들기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12951
 */

class Solution {
    public String solution(String s) {
        String answer = "";
        // 문자열 s를 소문자로 변환하여 char 단위로 나눔
        String[] sSplit = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        boolean flag = true; // 단어의 첫 문자 판단(시작은 대문자이므로 true)
        
        for(String word : sSplit) {
        	// flag가 true 이면 대문자로, 아니면 소문자로 입력
            sb.append(flag ? word.toUpperCase() : word);
            // 공백 뒤는 새로운 단어이므로 true(대문자), 공백이 아니면 false(소문자)
            flag = word.equals(" ") ? true : false;
            
        }
        
        answer = sb.toString();
        return answer;
    }
}