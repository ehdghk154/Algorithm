/**
 * 두 개 뽑아서 더하기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/68644
 */

import java.util.TreeSet;

class Solution {
    public TreeSet<Integer> solution(int[] numbers) {
        TreeSet<Integer> answer = new TreeSet<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }
        
        return answer;
    }
}