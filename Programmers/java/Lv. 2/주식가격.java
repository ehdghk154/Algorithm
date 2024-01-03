/**
 * 주식가격(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42584
 */

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++) {
            int curP = prices[i]; // 현재 시점 주식 가격
            for(int j = i+1; j < prices.length; j++) {
                int nextP = prices[j]; // 이후 시점 주식 가격
                answer[i]++; // 가격이 떨어지지 않은 기간
                if(curP > nextP) { // 이후 가격이 현재 가격보다 작으면 중단
                    break;
                }
            }
        }
        
        return answer;
    }
}