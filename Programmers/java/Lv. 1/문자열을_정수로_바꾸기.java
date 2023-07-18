/**
 * 문자열을 정수로 바꾸기(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12925
 */

class Solution {
    public int solution(String s) {
    	// Integer의 parseInt 함수는 부호 또한 변환해준다.
        int answer = Integer.parseInt(s);
        return answer;
    }
}