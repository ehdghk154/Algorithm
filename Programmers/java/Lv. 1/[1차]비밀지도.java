/**
 * [1차]비밀지도 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/17681
 */

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
        	// 비트연산(or)으로 2진수로 변환한 수가 둘 중 하나라도 1인 경우 1 입력
        	String line = Integer.toBinaryString(arr1[i] | arr2[i]);
            // 길이 n을 맞추기 위해 공백을 repeat으로 추가 후 line 입력
        	answer[i] = " ".repeat(n-line.length())+line;
        	// replace로 1을 #으로, 0을 공백으로 변환
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        }
        return answer;
    }
}

/*
import java.util.Stack;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        for(int i = 0; i < n; i++) {
        	String line = "";
            while(arr1[i] >= 2) {
            	stack1.add(arr1[i]%2);
            	arr1[i] /= 2;
            }
            stack1.add(arr1[i]);
            while(stack1.size() < n) {
            	stack1.add(0);
            }
            while(arr2[i] >= 2) {
            	stack2.add(arr2[i]%2);
            	arr2[i] /= 2;
            }
            stack2.add(arr2[i]);
            while(stack2.size() < n) {
            	stack2.add(0);
            }
            for(int j = 0; j < n; j++) {
            	if(stack1.peek() == 1 || stack2.peek() == 1) {
            		line += "#";
            	}else {
            		line += " ";
            	}
            	stack1.pop();
        		stack2.pop();
            }
            answer[i] = line;
        }
        return answer;
    }
}
*/