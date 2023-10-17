/**
 * 구명보트(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42885
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        // 역순 정렬을 위한 객체로 변환(int to Integer)
        Integer[] pple = new Integer[people.length];
        for(int i = 0; i < people.length; i++) {
            pple[i] = people[i];
        }
        // 정렬(내림차순)
        Arrays.sort(pple, Collections.reverseOrder());
        
        // 남은 무게 제한이 큰 보트부터 보내도록 역순 정렬(내림차순)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < pple.length; i++) {
        	// 보트가 없는 경우
            if(pq.isEmpty()) {
            	// 무게 제한에서 현재 사람 무게를 뺀 값이 40 이상이면 추가
            	// (남은 무게가 40 미만이면 더 이상 탈 수 없으므로 보트를 보냄)
            	if(limit - pple[i] >= 40) {
            		pq.offer(limit - pple[i]);
            	}
            	answer++; // 보트 1개 사용
            }else { // 보트가 있는 경우
            	// 남은 무게가 현재 사람 무게 이상인 경우
            	if(pq.peek() >= pple[i]) {
            		pq.poll(); // 보트가 꽉 찼으므로 보냄
            	}else { // 현재 사람 무게보다 작은 경우
            		pq.offer(limit - pple[i]); // 새로운 보트 추가
            		answer++; // 보트 1개 사용
            	}
            }
        }
        return answer;
    }
}