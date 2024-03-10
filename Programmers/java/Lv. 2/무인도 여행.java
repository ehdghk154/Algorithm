/**
 * 무인도 탐색(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/154540
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Point {
	int y, x;
	Point(int y, int x) {
		this.y = y;
		this.x = x;
	}
}

class Solution {
	static int[] dx = {0, 0, -1, 1}; // 상하좌우
	static int[] dy = {-1, 1, 0, 0};
	static boolean[][] isVisited; // 방문여부
	static int[][] map; // 2차원 배열 지도
    public int[] solution(String[] maps) {
        List<Integer> list = new ArrayList<>();
        int y = maps.length;
        int x = maps[0].length();
        isVisited = new boolean[y][x];
        map = new int[y][x];
        
        // String 배열 형태의 지도 -> 2차원 int 배열 지도
        for(int i = 0; i < y; i++) {
        	for(int j = 0; j < x; j++) {
        		if(maps[i].charAt(j) == 'X') { // X는 방문 불가
        			isVisited[i][j] = true;
        		}else {
        			map[i][j] = maps[i].charAt(j) - '0';
        		}
        	}
        }
        
        // 땅 순회하며 무인도 별 머물 수 있는 일수 확인
        for(int i = 0; i < y; i++) {
        	for(int j = 0; j < x; j++) {
        		// 방문하지 않은 땅만 방문
        		if(!isVisited[i][j]) {
        			list.add(bfs(i, j));
        		}
        	}
        }
        
        // 머물 수 있는 무인도가 없다면 -1 반환
        if(list.isEmpty()) return new int[] {-1};
        
        // 오름차순 정렬 후 answer에 입력
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    // 너비우선탐색을 이용하여 무인도 탐색
    static int bfs(int y, int x) {
        int food = 0;
        isVisited[y][x] = true;
    	Queue<Point> q = new LinkedList<>();
    	q.offer(new Point(y, x));
    	
    	while(!q.isEmpty()) {
    		Point p = q.poll();
    		food += map[p.y][p.x]; // 식량 추가
    		
    		// 현재 땅에서 4방향 탐색 후 갈 수 있고 방문하지 않았다면 큐에 입력
    		for(int i = 0; i < 4; i++) {
    			int ny = p.y+dy[i];
        		int nx = p.x+dx[i];
        		if(ny >= 0 && ny < map.length && nx >= 0 && nx < map[0].length) {
        			if(!isVisited[ny][nx]) {
        				isVisited[ny][nx] = true;
        				q.offer(new Point(ny, nx));
        			}
        		}
    		}
    	}
    	return food;
    }
}