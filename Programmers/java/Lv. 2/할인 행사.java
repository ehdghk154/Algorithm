/**
 * 할인 행사(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/131127
 */

import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        // 첫 날부터 10일 간 할인하는 품목 입력
        for(int i = 0; i < 10; i++) {
            if(map.get(discount[i]) == null) {
                map.put(discount[i], 1);
            }else {
                map.replace(discount[i], map.get(discount[i])+1);
            }
        }
        // 1번째 날 가입하면 원하는 모든 품목이 할인되는지 판단
        for(int j = 0; j < want.length; j++) {
            if(map.get(want[j]) == null || map.get(want[j]) < number[j]) {
                break;
            }else if(j == want.length-1) {
                answer++;
            }
        }
        
        // 첫 날 이후부터 할인 끝나기 10일 전까지 품목 입력 및 판단
        for(int i = 1; i < discount.length-9; i++) {
        	// 10일 중 첫 날 할인하는 품목 제외
            map.replace(discount[i-1], map.get(discount[i-1])-1);
            // 다음 날 할인하는 품목 추가
            if(map.get(discount[i+9]) == null) {
                map.put(discount[i+9], 1);
            }else {
                map.replace(discount[i+9], map.get(discount[i+9])+1);
            }
            
            // 해당 일(i+1번째 날)에 가입하면 원하는 모든 품목이 할인되는지 판단
            for(int j = 0; j < want.length; j++) {
                if(map.get(want[j]) == null || map.get(want[j]) < number[j]) {
                    break;
                }else if(j == want.length-1) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}