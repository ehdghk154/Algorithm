/**
 * 문자열 내림차순으로 배치하기(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12917
 */

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray(); // String을 char배열로 변경
        
        Arrays.sort(c); // 오름차순 정렬
        
        // 오름차순 정렬된 문자열을 역순으로 저장
        for(int i = c.length-1; i >= 0; i--) {
        	sb.append(c[i]);
        }
        // 정렬된 문자열을 다시 String으로 변경
        String answer = sb.toString();
        
        return answer;
    }
}