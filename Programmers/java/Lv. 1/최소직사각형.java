/**
 * 최소직사각형 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 */

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_W = 0;
        int max_H = 0;


        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            max_W = Math.max(max_W, sizes[i][0]);
            max_H = Math.max(max_H, sizes[i][1]);
        }

        answer = max_W * max_H;
        return answer;
    }
}