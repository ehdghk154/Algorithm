import java.util.Map;
import java.util.HashMap;

/**
 * 성격 유형 검사하기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/118666
 */

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = {3, 2, 1, 0, 1, 2, 3};
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < 8; i++) {
            map.put(type[i], 0);
        }

        for(int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            if(choice <= 4) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0))+score[choice-1]);
            }else {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1))+score[choice-1]);
            }
        }
        for(int i = 0; i < 4; i++) {
            if(map.get(type[i*2]) >= map.get(type[i*2+1]))
                answer += String.valueOf(type[i*2]);
            else
                answer += String.valueOf(type[i*2+1]);
        }
        return answer;
    }
}