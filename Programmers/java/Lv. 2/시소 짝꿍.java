/**
 * 시소 짝꿍(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/152996
 */

import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        HashMap<Double, Integer> map = new HashMap<>(); // <무게, 해당 무게 개수>
        Arrays.sort(weights); // 큰수에서 작은수 방향으로 비교하도록 정렬
        
        for(int w : weights) {
            double num = w*1.0; // 현재 무게
            // 시소 거리 케이스 (2, 3), (2, 4), (3, 4) 비교
            double num1 = (w*2.0)/3.0; //현재 2m , 이전 3m
            double num2 = (w*1.0)/2.0; //현재 2m , 이전 4m
            double num3 = (w*3.0)/4.0; //현재 3m , 이전 4m
            if(map.containsKey(num)) answer += map.get(num);
            if(map.containsKey(num1)) answer += map.get(num1);
            if(map.containsKey(num2)) answer += map.get(num2);
            if(map.containsKey(num3)) answer += map.get(num3);
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        return answer;
    }
}