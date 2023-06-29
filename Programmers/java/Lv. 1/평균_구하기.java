/**
 * 평균 구하기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        // arr의 모든 값 더하기
        for(int n : arr) {
            answer += n;
        }
        
        // arr의 개수로 나누기
        answer /= arr.length;
        
        return answer;
    }
}