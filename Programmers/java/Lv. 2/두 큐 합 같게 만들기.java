/**
 * 두 큐 합 같게 만들기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/118667
 */

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long sum1 = 0, sum2 = 0; // 각 큐의 합
        
        for(int num : queue1) {
        	q1.offer(num);
        	sum1 += num;
        }
        for(int num : queue2) {
        	q2.offer(num);
        	sum2 += num;
        }
        
        answer = isSame(q1, q2, sum1, sum2);
        
        return answer;
    }
    
    static int isSame(Queue<Integer> q1, Queue<Integer> q2, long sum1, long sum2) {
        int count = 0; // 추출과 추가 작업의 횟수
        int limit = q1.size()*2 + 1; // 최대 작업 횟수
        /**
         * 최대 작업 횟수 2n+1
         * 아래 예시를 보면
         * 원소 합 : 32
         * 절반 : 16
         * 
		 * 1 4 5
		 * 2 3 17
		 * 
		 * 1.
		 * 1 4 5 2
		 * 2 3 17
		 * 
		 * 2.
		 * 1 4 5 2 3
		 * 17
		 * 
		 * 3.
		 * 1 4 5 2 3 17
		 * 
		 * 4.
		 * 4 5 2 3 17
		 * 1
		 * 
		 * 5.
		 * 5 2 3 17
		 * 1 4
		 * 
		 * 6.
		 * 2 3 17
		 * 1 4 5
         * 위와 같이 두 큐가 swap되면 다음 swap은 같은 작업이므로
         * 2n인 것 같지만 두 큐의 합보다는 커야되는지 2n+1까지 해야 정답
         * 따라서, 최대 작업 횟수는 2n+1
         */
        long half = (sum1+sum2)/2; // 모든 원소의 합의 절반
        long min = Math.min(sum1, sum2);
        
        // 모든 원소의 합이 홀수라면 -1 반환
        if((sum1 + sum2) % 2 != 0) return -1;
        
        if(sum1 == sum2) return 0;
        
        // 두 큐의 합이 다르면 반복
        while(sum1 != sum2) {
        	// 최대 작업 횟수보다 커지면 -1 반환
            if(count > limit) return -1;
            
            // 절반보다 크면 추출 및 추가
        	if(sum1 > half) {
        		int num = q1.poll();
        		q2.offer(num);
        		sum1 -= num;
        		sum2 += num;
        	}else {
        		int num = q2.poll();
        		q1.offer(num);
        		sum1 += num;
        		sum2 -= num;
        	}
        	
        	count++;
        }
        
        return count;
    }
}