/**
 * 나누어 떨어지는 숫자 배열(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
        	// list에 원소가 1개라도 있고 arr배열의 이전 원소와 현재 원소가 같을 경우
        	if(list.size() != 0 && arr[i-1] == arr[i]) {
        		continue;
        	}
        	// list에 원소가 없거나 arr배열의 이전 원소와 현재 원소가 다를 경우
            list.add(arr[i]);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}