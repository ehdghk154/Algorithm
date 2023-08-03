/**
 * 문자열 내 마음대로 정렬하기(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 */

import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings, (s1, s2) -> {
        	// 인덱스 n에 해당하는 알파벳이 같을 경우 사전순 정렬
            if(s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2);
            }
            // 인덱스 n에 해당하는 알파벳이 s1보다 s2가 사전순으로 앞이라면 교환
            return s1.charAt(n) - s2.charAt(n);
        });
        
        answer = strings;
        
        return answer;
    }
}