/**
 * 예산 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12982
 */

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 작은 예산부터 배정하기 위해 정렬
        Arrays.sort(d);
        
        // 구매할 물품 가격을 예산에서 빼면서 카운트
        for(int n : d) {
            if(budget >= n) {
                budget -= n;
                answer++;
            }else break;
        }
        return answer;
    }
}