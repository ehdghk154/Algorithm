/**
 * 문자열 다루기 기본(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 */

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        // 문자열의 길이가 4이거나 6이고
        if(len == 4 || len == 6) {
        	// 문자열이 정수로만 이루어져 있으면 true
        	try {
                Integer.parseInt(s);
            // 문자열에 알파벳이 있어 에러가 발생하면 false
            }catch(Exception e) {
                answer = false;
            }
        } else { // 문자열 길이가 4 or 6이 아니면 false
        	answer = false;
        }
        return answer;
    }
}