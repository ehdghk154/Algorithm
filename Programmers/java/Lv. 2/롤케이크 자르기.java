/**
 * 롤케이크 자르기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/132265
 */

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        int answer = 0; // 롤케이크를 공평하게 자르는 방법의 수
        /**
         * 토핑의 종류 개수와 해당 토핑의 개수를 알기 위해 HashMap 사용
         * (Key = 토핑의 종류, Value = 토핑 개수)
         * 중복을 방지하는 HashSet을 이용하여 토핑을 하나씩 추가하며
         * 롤케이크가 공평하게 잘리는지 파악하여 방법의 수 찾기
         */
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // map에 토핑 전체 입력
        for(int i = 0; i < topping.length; i++) {
        	if(map.get(topping[i]) == null) {
        		map.put(topping[i], 1);
        	}else {
        		map.put(topping[i], map.get(topping[i])+1);
        	}
        }
        
        /**
         * set에 토핑을 추가하면서 map에서 해당 토핑 제거
         * 제거 후 set과 map의 크기가 같다면 answer 1 증가
         */
        for(int i = 0; i < topping.length; i++) {
        	set.add(topping[i]);
        	map.put(topping[i], map.get(topping[i])-1);
        	if(map.get(topping[i]) == 0)
        		map.remove(topping[i]);
        	
        	if(set.size() == map.size()) {
        		answer++;
        	}
        }
        
        return answer;
    }
}