/**
 * 최댓값과 최솟값(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12939
 */

class Solution {
    public String solution(String s) {
        String answer = "";
        // 최솟값(min)과 최댓값(max)
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        // 문자열 s를 split을 이용해 배열로 변환
        String[] nums = s.split(" ");
        int n = 0; // nums의 각 숫자를 int형으로 변환하여 저장할 변수
        
        // nums의 크기만큼 순회하여 최솟값과 최댓값 저장
        for(int i = 0; i < nums.length; i++) {
        	n = Integer.parseInt(nums[i]);
        	min = Math.min(n, min);
        	max = Math.max(n, max);
        }
        
//        StringBuilder sb = new StringBuilder();
//        sb.append(min).append(" ").append(max);
//        answer = sb.toString();
        
        answer = min + " " + max;
        
        return answer;
    }
}