/**
 * 완주하지 못한 선수 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0; i < completion.length; i++) {
        	if(!participant[i].equals(completion[i])) {
        		answer = participant[i];
                break;
        	}
        }
        if(answer == "") answer = participant[participant.length-1];

        return answer;
    }
}