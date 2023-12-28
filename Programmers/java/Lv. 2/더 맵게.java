/**
 * 더 맵게(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42626
 */

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 스코빌 지수가 낮은 음식부터 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }
        
        // 가장 낮은 스코빌 지수가 K보다 낮다면 반복
        while(pq.peek() < K) {
        	// 음식이 1개 남을 때 까지 섞어도 K보다 낮다면 -1 반환
            if(pq.size() == 1) {
                return -1;
            }
            // 가장 안매운 음식 + 두번째로 안매운 음식*2
        	pq.offer(pq.poll()+pq.poll()*2);
        	answer++; // 섞는 횟수
        }
        
        return answer;
    }
}