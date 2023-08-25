/**
 * 폰켓몬(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0; // 폰켓몬 종류
        int choice = nums.length/2; // 선택할 폰켓몬 수
        int[] check = new int[200001]; // 폰켓몬 종류 체크
        
        for(int i = 0; i < nums.length; i++) {
        	// 해당하는 폰켓몬이 체크되지 않았을 때
            if(check[nums[i]] == 0) {
                check[nums[i]]++; // 폰켓몬 체크
                count++;// 폰켓몬 1마리 추가
            }
        }
        
        // 선택할 폰켓몬이 존재하는 폰켓몬 종류보다 많거나 같을 경우
        if(choice >= count) answer = count;
        // 선택할 폰켓몬이 존재하는 폰켓몬 종류보다 적을 경우
        else answer = choice;
        
        return answer;
    }
}