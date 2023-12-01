/**
 * 타겟 넘버(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/43165
 */

class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, 0, 0, target);
        
        return answer;
    }
    
    static void dfs(int[] numbers, int idx, int calc, int target) {
        // 마지막 숫자까지 계산했다면
    	if(idx == numbers.length) {
    		// 계산한 값이 target과 같다면 answer 1 추가;
            if(calc == target) answer++;
        }else {
        	// 숫자를 더한 경우
            dfs(numbers, idx+1, calc+numbers[idx], target);
            // 숫자를 뺀 경우
            dfs(numbers, idx+1, calc-numbers[idx], target);
        }
    }
}