/**
 * 짝지어 제거하기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12973
 */

import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
        	// stack이 비어있으면 c 추가
        	if(stack.isEmpty()) {
        		stack.push(c);
        	// stack이 비어있지 않다면
        	}else {
        		// stack의 마지막 값이 c와 같다면 마지막 값 제거
        		if(stack.peek() == c) {
        			stack.pop();
        		// 같지 않다면 c 추가
        		}else {
        			stack.push(c);
        		}
        	}
        }
        // stack이 비어있다면 모두 짝을 이룬 것으로 answer = 1
        if(stack.isEmpty()) answer = 1;
        // 비어있지 않다면 answer = 0
        else answer = 0;
        
        return answer;
    }
}