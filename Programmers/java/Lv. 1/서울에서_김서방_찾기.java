/**
 * 서울에서 김서방 찾기(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12919
 */

class Solution {
    public String solution(String[] seoul) {
        int x = -1; // 김서방 위치 저장
        for(int i = 0; i < seoul.length; i++) {
        	// 김서방을 찾았다면
            if(seoul[i].equals("Kim")) {
                x = i; // x에 김서방 위치 저장
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ").append(x).append("에 있다");
        String answer = sb.toString();
        return answer;
    }
}