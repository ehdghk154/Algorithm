/**
 * 숫자 짝꿍 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/131128
 */

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] y = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        for(int i = 0; i < X.length(); i++) {
        	x[X.charAt(i) -'0']++;
        }
        
        for(int i = 0; i < Y.length(); i++) {
        	y[Y.charAt(i) -'0']++;
        }
        
        for(int i = 9; i >= 0; i--) {
        	if(x[i] != 0 && y[i] != 0) {
        		if(answer == "" && i == 0)
        			answer += "0";
        		else
        			answer += String.valueOf(i).repeat(x[i] > y[i] ? y[i] : x[i]);
        	}
        }
        if(answer == "")
        	answer = "-1";
        
        return answer;
    }
}