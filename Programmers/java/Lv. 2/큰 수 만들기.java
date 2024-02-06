/**
 * 큰 수 만들기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42883
 */

import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        Stack<Integer> stack = new Stack<>();
        int count = 0; // 제거 횟수
        for(int i = 0; i < number.length(); i++) {
        	if(count == k) { // k개 숫자를 제거했다면 나머지 전부 저장
        		stack.push(Integer.parseInt(number.substring(i, i+1)));
        		continue;
        	}
        	if(stack.isEmpty()) { // stack이 비어있다면 숫자 저장(첫번째 숫자라면)
        		stack.push(Integer.parseInt(number.substring(i, i+1)));
        		continue;
        	}
        	while(true) {
        		// stack에 있는 숫자가 현재 숫자보다 작으면 제거
        		if(stack.peek() < Integer.parseInt(number.substring(i, i+1))) {
        			stack.pop();
        			count++;
        		}else { // 현재 숫자가 stack에 있는 숫자와 같거나 작으면 현재 숫자 저장
        			stack.push(Integer.parseInt(number.substring(i, i+1)));
        			break;
        		}
        		
        		// 더이상 제거할 숫자가 없다면 현재 숫자 저장
        		if(stack.isEmpty()) {
        			stack.push(Integer.parseInt(number.substring(i, i+1)));
        			break;
        		}
        		// k개 숫자만큼 제거했다면 현재 숫자 저장 후 반복문 종료
        		if(count == k) {
        			stack.push(Integer.parseInt(number.substring(i, i+1)));
        			break;
        		}
        	}
        }
        
        StringBuilder sb = new StringBuilder(); // 문자열 반전을 위해 StringBuilder 사용
        int check = stack.size() - (number.length()-k); // 구하는 숫자의 크기와 stack의 크기 비교(0~ )
        // stack에 있는 숫자가 구하는 숫자보다 길이가 길면 끝부분을 긴 개수만큼 제거
        for(int i = 0; i < check; i++) {
            stack.pop();
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        // 반전 후 answer에 입력
        answer = sb.reverse().toString();
        
        return answer;
    }
}