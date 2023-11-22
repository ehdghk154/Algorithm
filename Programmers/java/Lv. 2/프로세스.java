/**
 * 프로세스(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42587
 */

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int idx = 0;
        // 우선순위 큐로 프로세스를 중요도 순으로 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < priorities.length; i++) {
        	pq.offer(priorities[i]);
        }
        
        while(!pq.isEmpty()) {
        	// 현재 실행하려하는 프로세스가 가장 중요도가 높은 프로세스라면
        	if(priorities[idx] == pq.peek()) {
        		// 실행되었다 판단하고 pq에서 제거
        		pq.poll();
        		// 실행 대기 큐에서도 제거(0으로 만듬)
        		priorities[idx] = 0;
        		// 실행한 횟수 1 추가
        		answer++;
        		// 만약 현재 실행한 프로세스가 
        		// 알고싶은 프로세스(location)였다면 반복 중단
        		if(idx == location) break;
        	}
        	// 현재 실행하려는 프로세스가 우선순위가 아니라면
        	idx++;
        	// idx가 큐의 크기를 넘어가면 idx = 0
        	if(idx == priorities.length) {
        		idx = 0;
        	}
        }
        
        return answer;
    }
}