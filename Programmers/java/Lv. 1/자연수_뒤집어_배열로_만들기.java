/**
 * 자연수 뒤집어 배열로 만들기(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */

class Solution {
    public int[] solution(long n) {
    	// n을 String으로 변환
		String sn = String.valueOf(n);
        int[] answer = new int[sn.length()];
        
        // n을 뒤집어야 하므로 뒤에서부터 answer에 추가
        for(int i = sn.length()-1; i >= 0; i--) {
            answer[sn.length()-i-1] = sn.charAt(i) -'0';
        }
        return answer;
    }
}