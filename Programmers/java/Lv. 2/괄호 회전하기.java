/**
 * 괄호 회전하기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/76502
 */

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        // HashMap을 이용하여 미리 각 괄호를 매칭
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        // x칸만큼 회전했을 때 올바른 괄호 문자열의 개수를 확인하기 위해 
        // s의 길이만큼 반복
        for(int i = 0; i < s.length(); i++) { 
        	// i만큼 회전한 괄호 문자열이 올바른지 판단하기 위해 
        	// s의 길이만큼 반복
            for(int j = 0; j < s.length(); j++) {
            	// i만큼의 회전을 주기 위해 
            	// j에 i를 더한 값을 s의 길이로 나눈 나머지에 있는 칸을 선택
                char c = s.charAt((i+j)%s.length());
                // stack이 비어있다면 c 입력
                if(stack.isEmpty()) {
                    stack.push(c);
                    // 만약 c가 "),],}" 3개 중에 있다면 
                    // 올바르지 않으므로 break
                	if(map.get(c) != null) {
                    	break;
                    }
                }else {
                	// 입력된 괄호와 입력할 괄호가 매칭된다면 stack에서 꺼내기
                	if(stack.peek() == map.get(c)) {
                		stack.pop();
                	// 매칭되지 않지만 c가 "(,[,{" 중에 하나라면
                	// stack에 넣기
                	}else if(map.get(c) == null) {
                    	stack.push(c);
                    // 매칭되지 않고 c가 "),],}" 중에 하나라면 
                    // 올바르지 않으므로 break
                    }else {
                        break;
                    }
                }
            }
            
            // stack이 비어있다면 올바른 괄호 문자열이므로 answer 1 추가
            if(stack.isEmpty()) answer++;
            // stack이 비어있지 않다면
            else stack.clear(); // 다음 판정을 위해 stack 초기화
            
        }
        return answer;
    }
}