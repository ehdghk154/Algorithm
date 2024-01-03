/**
 * 방문 길이(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/49994
 */

import java.util.HashMap;

class Solution {
    public int solution(String dirs) {
    	// 이동 거리 및 방향
        HashMap<Character, int[]> direction = new HashMap<>(){{
            put('U', new int[]{-1, 0, 0}); // y축, x축, 방향
            put('D', new int[]{1, 0, 1});
            put('R', new int[]{0, 1, 2});
            put('L', new int[]{0, -1, 3});
        }};
        // 이동 방향의 반대 방향
        HashMap<Integer, Integer> reverse = new HashMap<>() {{
            put(0, 1);
            put(1, 0);
            put(2, 3);
            put(3, 2);
        }};
        // 이동한 길 저장
        boolean[][][] visited = new boolean[11][11][4]; 
        int x = 5; // 첫 시작 위치
        int y = 5;
        int answer = 0;
        for(int i = 0; i < dirs.length(); i++) {
            int[] dir = direction.get(dirs.charAt(i));
            int ny = y+dir[0]; // 이동한 위치
            int nx = x+dir[1];
            int d = dir[2]; // 이동한 방향
            if(ny >= 0 && ny < 11 && nx >= 0 && nx < 11) {
            	// 지나간 길이 아닐 경우
                if(!visited[ny][nx][d]) {
                    answer++; // 이동 거리 증가
                    visited[ny][nx][d] = true; // 이동 방향 저장
                    visited[y][x][reverse.get(d)] = true; // 반대 방향 저장
                }
                // 현재 위치를 이동한 위치로 저장
                x = nx;
                y = ny;
            }
        }
        
        return answer;
    }
}