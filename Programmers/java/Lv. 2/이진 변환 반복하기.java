/**
 * 이진 변환 반복하기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/70129
 */

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        // StringBuilder sb;
        
        while(!s.equals("1")) {
            // 이진 변환 횟수 추가
        	answer[0]++;
        	// 1 개수
        	int num = s.replace("0", "").length();
        	// 0 개수
        	answer[1] += s.length() - num;
            // 1 개수를 이진수로 변환
            s = Integer.toBinaryString(num);
            
//            sb = new StringBuilder();
//            while(num != 1) {
//            	sb.append(num%2);
//            	num /= 2;
//            }
//            sb.append(num);
//            s = sb.toString();
        }
        
        return answer;
    }
}