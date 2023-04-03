/**
 * 푸드 파이트 대회 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */

class Solution {
    public String solution(int[] food) {
        String answer = "";

        for(int i = 1; i < food.length; i++) {
            int num = food[i]/2;
            answer += String.valueOf(i).repeat(num);
        }

        answer += "0";
        String temp = "";
        for(int i = answer.length()-2; i >= 0; i--) {
            temp += String.valueOf(answer.charAt(i));
        }
        answer += temp;

        return answer;
    }
}