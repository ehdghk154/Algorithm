/**
 * 과일 장수 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */

import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = score.length/m; i > 0; i--) {
            answer += score[i*m+(score.length%m-m)]*m;
        }
        return answer;
    }
}