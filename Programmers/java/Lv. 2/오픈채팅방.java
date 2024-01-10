/**
 * 오픈채팅방(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42888
 */

import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
    	// 아이디별 닉네임 저장
        HashMap<String, String> map = new HashMap<>();
        // 접속 메시지 저장
        ArrayList<String[]> list = new ArrayList<>();
        
        for(int i = 0; i < record.length; i++) {
        	// 명령, 아이디, 닉네임 나누기
            String[] rec = record[i].split(" ");
            String userId = rec[1];
            String nickName = null;
            
            switch(rec[0]) {
                case "Enter": // 입장
                	nickName = rec[2];
                	// 아이디별 닉네임 저장
                	map.put(userId, nickName);
                	// 입장 메시지 저장
                    list.add(new String[]{userId, "님이 들어왔습니다."});
                    break;
                case "Leave": // 퇴장
                	// 퇴장 메시지 저장
                    list.add(new String[]{userId, "님이 나갔습니다."});
                    break;
                case "Change":
                	// 닉네임 변경
                	nickName = rec[2];
                	map.replace(userId, nickName);
                	break;
            }
        }
        // 메시지 출력
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String[] message = list.get(i);
            //message[0] = 아이디, message[1] = 입장 or 퇴장 메시지
            answer[i] = map.get(message[0]) + message[1];
        }
        
        return answer;
    }
}