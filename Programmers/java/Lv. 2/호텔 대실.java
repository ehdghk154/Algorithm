/**
 * 호텔 대실(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/155651
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
	static int[][] time; // 예약 시작, 종료 시각(시간->분)
	static int n = 0; // 사용된 객실 수
    static HashMap<Integer, Integer> room = new HashMap<>();
    
    // 객실 체크
	static void roomCheck(int i) {
		boolean flag = false;
    	if(room.isEmpty()) { // 첫 손님 객실 배정
    		room.put(n++, time[i][1]);
    	}else {
    		// 예약 종료된 객실이 있는지 체크 후 있다면 객실 배정
    		for(int key : room.keySet()) {
    			if(room.get(key) <= time[i][0]) {
    				room.put(key, time[i][1]);
    				flag = true;
    				break;
    			}
    		}
    		// 예약 종료된 객실이 없다면 새로운 객실 배정
    		if(!flag) {
    			room.put(n++, time[i][1]);
    		}
    	}
	}
	
	// 시간 -> 분 전환
	static int hourToMinute(String time) {
		StringTokenizer st = new StringTokenizer(time, ":");
		int htm = Integer.parseInt(st.nextToken())*60;
		int min = Integer.parseInt(st.nextToken());
		return htm+min;
	}
	
    public int solution(String[][] book_time) {
        int answer = 0;
        time = new int[book_time.length][2];
        
        // 시작, 종료 시각 분으로 치환하여 입력
        for(int i = 0; i < book_time.length; i++) {
            time[i][0] = hourToMinute(book_time[i][0]);
            time[i][1] = hourToMinute(book_time[i][1])+10;
        }
        
        // 예약 시작 시각으로 오름차순 정렬
        Arrays.sort(time, (t1, t2) -> {
        	return t1[0] - t2[0];
        });
        
        // 예약 손님 객실 배정
        for(int i = 0; i < time.length; i++) {
        	roomCheck(i);
        }
        
        answer = n;
        
        return answer;
    }
}