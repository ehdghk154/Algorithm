/**
 * 신규 아이디 추천 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/72410
 */

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^0-9a-z-_.]", "");
        answer = answer.replaceAll("\\.{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        answer = answer.equals("") ? "a" : answer;
        answer = answer.length() > 15 ? answer.substring(0, 15) : answer;
        answer = answer.replaceAll("[.]$", "");
        
        char lastChar = answer.charAt(answer.length() -1);
        if(answer.length() < 3) {
        	while(answer.length() < 3) {
        		answer += lastChar;
        	}
        }
        
        return answer;
    }
}