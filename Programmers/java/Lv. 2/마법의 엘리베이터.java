/**
 * 마법의 엘리베이터(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/148653
 */

class Solution {
	static int[] nums;
    public int solution(int storey) {
        int answer = 0;
        // 올림으로 인한 다음 자릿수까지 길이 설정
        nums = new int[(int)Math.log10(storey)+2];
        
        // storey의 자릿수 분리
        for(int i = 0; i < nums.length-1; i++) {
        	nums[i] += storey % 10;
        	storey /= 10;
        }
        
        for(int i = 0; i < nums.length; i++) {
        	// 올림(현재 자릿수 값이 5보다 크거나, 값이 5인데 다음 자릿수의 값이 5보다 크거나 같다면)
        	if(nums[i] > 5 || nums[i] == 5 && nums[i+1] >= 5) {
        		answer += 10-nums[i];
        		nums[i] = 0;
        		nums[i+1]++;
        	// 내림(현재 자릿수 값이 5보다 작거나, 값이 5인데 다음 자릿수의 값이 5보다 작다면)
        	}else { 
        		answer += nums[i];
        		nums[i] = 0;
        	}
        }
        
        return answer;
    }
}