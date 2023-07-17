/**
 * 시저 암호(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12926
 */

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] word = s.toCharArray();
        
        for(int i = 0; i < word.length; i++) {
        	// 공백일 경우 answer에 공백 입력
            if(word[i] == ' ') answer += " ";
            // 알파벳이 소문자일 경우
        	else if(Character.isLowerCase(word[i])) {
        		// 알파벳에 n을 더할 때, 알파벳 총 개수인 26개를 넘어갈 경우 
        		// 처음으로 돌아올 수 있도록
        		// 26으로 나눈 나머지를 'a'나 'A'에 더한다.
        		// word[i]에서 'a'나 'A'를 빼면 (1~26)+n으로 계산할 수 있다.
        		answer += (char)((word[i]-'a'+n)%26 + 'a');
        	}else {
        		answer += (char)((word[i]-'A'+n)%26 + 'A');
        	}
        }
        return answer;
    }
}