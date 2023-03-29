/**
 * 공원 산책 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/172928
 */

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int w = park[0].length();
        int h = park.length;

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        for(int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            String op = route[0]; // 방향
            int n = Integer.parseInt(route[1]); // 이동거리
            point:
            switch(op) {
                case "N":
                    if(answer[0] - n >= 0) {
                    	for(int j = 1; j <= n; j++) {
                    		if(park[answer[0] - j].charAt(answer[1]) == 'X') { break point;}
                    	}
                    	answer[0] -= n;
                    }
                    break;
                case "S":
                    if(answer[0] + n < h) {
                    	for(int j = 1; j <= n; j++) {
                    		if(park[answer[0] + j].charAt(answer[1]) == 'X') { break point;}
                    	}
                    	answer[0] += n;
                    }
                    break;
                case "W":
                    if(answer[1] - n >= 0) {
                    	for(int j = 1; j <= n; j++) {
                    		if(park[answer[0]].charAt(answer[1] - j) == 'X') { break point;}
                    	}
                    	answer[1] -= n;
                    }   
                    break;
                case "E":
                    if(answer[1] + n < w) {
                    	for(int j = 1; j <= n; j++) {
                    		if(park[answer[0]].charAt(answer[1] + j) == 'X') { break point;}
                    	}
                    	answer[1] += n;
                    }
                    break;
            }
        }
        
        return answer;
    }
}