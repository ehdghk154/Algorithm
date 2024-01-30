/**
 * 다리를 지나는 트럭(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42583
 */

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 시간
        int limit = 0; // 현재 다리 위의 무게
        Queue<Integer> waitTruck = new LinkedList<>(); // 대기 트럭
        Queue<Integer> enterTime = new LinkedList<>(); // 트럭이 다리에 들어간 시간
        Queue<Integer> moveTruck = new LinkedList<>(); // 다리를 건너는 트럭
        
        // 대기 트럭 큐에 입력
        for(int truck : truck_weights) {
            waitTruck.add(truck);
        }
        
        // 대기 트럭과 다리를 건너는 트럭이 없을 때까지 반복
        while(!waitTruck.isEmpty() || !moveTruck.isEmpty()) {
            answer++;
            
            // 트럭이 다리를 건너갔다면 큐(시간, 다리 위 트럭)에서 제거
            if(!enterTime.isEmpty() && answer - enterTime.peek() == bridge_length) {
                enterTime.poll(); // 건너간 트럭 시간 제거
                limit -= moveTruck.poll(); // 무게 제한에 현제 트럭 무게 제거
            }
            
            // 다리에 현재 트럭이 올라갈 수 있다면 다리 위로 트럭 입장
            if(!waitTruck.isEmpty() && moveTruck.size() < bridge_length && limit+waitTruck.peek() <= weight) {
                enterTime.add(answer); // 현재 트럭이 다리에 들어간 시간 저장
                moveTruck.add(waitTruck.peek()); // 현재 트럭 다리로 옮기기
                limit += waitTruck.poll(); // 무게 제한에 현재 트럭 무게 추가
            }
        }
        
        return answer;
    }
}