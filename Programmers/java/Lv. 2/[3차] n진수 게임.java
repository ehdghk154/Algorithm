/**
 * [3차] n진수 게임(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/17687
 */

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        HashMap<Integer, String> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int limit = t*m+p; // 튜브가 말할 마지막 숫자가 있는 번호
        int[] nums = new int[limit]; // m명이 말하는 숫자 모음
        int idx = n;
        // 10~15 => A~F 매칭
        for(int i = 10; i < 16; i++) {
            map.put(i, String.valueOf((char)('A'+i-10)));
        }
        // n진수이므로 n 미만 입력
        for(int i = 0; i < n; i++) {
        	nums[i] = i;
        }
        
        for(int i = n; i < limit ; i++) {
    		int num = i;
    		// 진법 변환
    		while(num != 0) {
    			stack.add(num%n);
    			num /= n;
    		}
    		// 변환한 숫자 nums에 입력
            while(!stack.isEmpty()) {
            	nums[idx++] = stack.pop();
            	// 튜브가 말할 마지막 숫자까지 도달했으면 while문 중지
            	if(idx == limit) break;
            }
            
            // t개의 숫자를 튜브의 순서에 맞춰 answer에 입력
            if(idx == limit) {
        		for(int j = 0; j < t; j++) {
        			int sequence = p-1+(m*j); // 튜브 순서
        			if(nums[sequence] < 10) {
        				answer += nums[sequence];
        			}else {
        				// 10 이상이면 map에서 A~F 가져와 입력
        				answer += map.get(nums[sequence]);
        			}
        		}
        		break;
        	}
        }
        
        return answer;
    }
}