/**
 * 영어 끝말잇기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12981
 */

import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        // 등장했던 단어 판별
        HashMap<String, Boolean> map = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            map.put(words[i], false);
        }
        // 이전 단어 끝문자 저장
        char prev = words[0].charAt(words[0].length()-1);
        map.replace(words[0], true);
        for(int i = 1; i < words.length; i++) {
        	// 이전에 등장했던 단어가 아니고 
        	// 이전 단어 끝문자와 현재 단어 첫문자가 같을 경우 계속 진행 (아래 생략)
        	if(!map.get(words[i]) && prev == words[i].charAt(0)) {  
        		map.replace(words[i], true); // 등장 단어 체크
        		prev = words[i].charAt(words[i].length()-1); // 현재 단어 끝문자 저장
        		continue;
        	}
        	answer[0] = (i % n) + 1; // 틀린 사람 번호
    		answer[1] = (i / n) + 1; // 틀린 사람 차례
    		break;
        }
        return answer;
    }
}