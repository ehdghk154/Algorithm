/**
 * 뒤에 있는 큰 수 찾기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/154539
 */

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        answer[numbers.length-1] = -1; // 맨 끝 수는 무조건 -1;
        for(int i = numbers.length-1; i >= 0; i--) {
        	int n = i-1;
        	/**
        	 * 현재 수보다 뒷 수가 작으면 answer에 현재 수 입력
        	 * 현재 수보다 큰 수가 나올 때까지 또는 n이 0이 될 때까지 반복
        	 */
            while(n >= 0 && numbers[i] > numbers[n]) {
            	answer[n] = numbers[i];
            	n -= 1;
            }
        }
        // 모든 수의 뒷 큰수를 찾았다면 뒷 큰수가 없는 수에 -1 입력
        for(int i = 0; i < answer.length; i++) {
            if(answer[i] == 0) answer[i] = -1;
        }
        
        return answer;
    }
}