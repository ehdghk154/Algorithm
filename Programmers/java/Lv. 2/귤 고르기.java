/**
 * 귤 고르기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/138476
 */

import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int max = 0;
        // 가장 큰 크기 고르기(num의 배열 크기)
        for(int i = 0; i < tangerine.length; i++) {
            if(tangerine[i] > max) max = tangerine[i];
        }
        
        // 가장 큰 크기까지 배열 크기를 정하고
        // num배열에 귤 크기별로 정리
        int[] num = new int[max+1];
        for(int i = 0; i < tangerine.length; i++) {
            num[tangerine[i]]++;
        }
        
        // 크기순으로 정렬(오름차순)
        Arrays.sort(num);
        
        // 귤의 크기의 종류가 최소가 되도록 해야하므로
        // 가장 많은 귤의 크기부터 상자에 담음
        int idx = num.length-1;
        while(k > 0) {
            k -= num[idx--];
            answer++;
        }
        
        return answer;
    }
}