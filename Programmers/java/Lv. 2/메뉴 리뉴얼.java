/**
 * 메뉴 리뉴얼(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/72411
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
	static HashMap<String, Integer> map; // 코스 별 주문량
	static int max; // 가장 많이 주문된 코스의 주문량
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        PriorityQueue<String> pq = new PriorityQueue<>();
        
        // 코스로 추가할만한 메뉴 파악
        for(int i = 0; i < course.length; i++) {
        	map = new HashMap<>();
        	max = 0;
        	
        	// course[i]가지 단품 메뉴로 조합된 코스 중 가장 많이 주문된 코스 찾기
        	for(int j = 0; j < orders.length; j++) {
        		menuCount(orders[j], "", 0, 0, course[i]);
        	}
        	
        	// 정렬을 위해 선별된 코스를 우선순위 큐에 입력
        	for(String menu : map.keySet()) {
        		if(max > 1 && map.get(menu) == max) {
        			pq.offer(menu);
        		}
        	}
        }
        
        // 정렬된 코스를 answer에 입력
        answer = new String[pq.size()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = pq.poll();
        }
        
        return answer;
    }
    
    // 가장 많이 주문된 메뉴 조합 찾기
    static void menuCount(String order, String course, int prev, int idx, int limit) {
    	if(idx == limit) { // 정해진 코스의 단품 개수가 채워지면 map에 해당 코스의 값 +1
    		// 주문한 단품 메뉴 순서가 다를 수 있으므로 정렬하여 입력
    		char[] c = course.toCharArray();
    		Arrays.sort(c);
    		String temp = String.valueOf(c);
    		map.put(temp, map.getOrDefault(temp, 0)+1);
    		
    		// 가장 많이 주문된 코스 체크
    		max = Math.max(max, map.get(temp));
    		return;
    	}
    	
    	for(int i = prev; i < order.length(); i++) {
    		menuCount(order, course+order.charAt(i), i+1, idx+1, limit);
    	}
    }
}