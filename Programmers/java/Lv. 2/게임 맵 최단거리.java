/**
 * 게임 맵 최단거리(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/1844
 */

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[] dx = {0, 0, -1, 1}; // 상하좌우
    static int[] dy = {-1, 1, 0, 0};
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        answer = bfs(maps);
        
        return answer;
    }
    
    static int bfs(int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        maps[0][0] = 0;
        q.offer(new int[] {0, 0, 1}); // 행, 열, 진행거리
        
        while(!q.isEmpty()) {
        	int[] pos = q.poll(); // 현재 위치
        	
        	if(pos[0] == maps.length-1 && pos[1] == maps[0].length-1) {
        		return pos[2]; // 목적지 도달 시 최단거리 반환
        	}
        	
        	// 현재 위치에서 인근 위치(상하좌우) 방문
        	for(int i = 0; i < 4; i++) {
        		int ny = pos[0] + dy[i];
        		int nx = pos[1] + dx[i];
        		if(nx < maps[0].length && nx >= 0 && ny < maps.length && ny >= 0) {
        			// 막히거나 이미 방문했다면 가지 않음
        			if(maps[ny][nx] == 0) continue;
        			
        			maps[ny][nx] = 0; // 방문하지 않은 곳을 방문했다면 방문 표시
        			
        			// 큐에 방문한 위치 및 진행거리 저장
        			q.offer(new int[] {ny, nx, pos[2]+1});
        		}
        	}
        }
        
        // 목적지에 도달하지 못하면 -1 반환
        return -1;
    }
}