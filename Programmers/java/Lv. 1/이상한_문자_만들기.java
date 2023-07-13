/**
 * 이상한 문자 만들기(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */

class Solution {
    public String solution(String s) {
        String answer = "";
        int j = 0; // 공백을 기준으로 잡기 위한 변수
        for(int i = 0; i < s.length(); i++) {
        	// 공백일 경우 answer에 공백 추가, j = 0으로 초기화
            if(s.charAt(i) == ' ') {
                answer += " ";
                j = 0;
            // 짝수일 경우 answer에 해당 문자를 대문자로 추가
            }else if(j % 2 == 0) {
                answer += String.valueOf(s.charAt(i)).toUpperCase();
                j++;
            // 홀수일 경우 answer에 해당 문자를 소문자로 추가
            }else {
                answer += String.valueOf(s.charAt(i)).toLowerCase();
                j++;
            }
        }
        return answer;
    }
}