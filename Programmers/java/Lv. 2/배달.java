/**
 * 배달(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12978
 */

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    static int[][] map;
    public int solution(int N, int[][] road, int K) {
        int answer = 1; // 1번 마을 포함 배달 가능 마을 수
        map = new int[N+1][N+1];
        
        for(int[] r : road) {
            if(map[r[0]][r[1]] == 0 || map[r[0]][r[1]] > r[2]) {
                map[r[0]][r[1]] = r[2];
                map[r[1]][r[0]] = r[2];
            }
        }
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1, 0});
        while(!q.isEmpty()) {
            int[] n = q.poll();
            int town = n[0]; // 마을
            int cost = n[1]; // 총 배달 시간
            for(int i = 1; i <= N; i++) {
                // 현재 마을 패스
                if(town == i) continue;
                // 갈 수 없는 마을 패스
                if(map[town][i] == 0) continue;
                // 배달 가능 시간을 넘어서면 패스
                if(cost+map[town][i] > K) continue;
                // 현재 최단 시간보다 길어지면 패스
                if(map[1][i] != 0 && map[1][i] < cost+map[town][i]) continue;
                
                // 큐에 (마을 번호, 총 배달 시간) 입력
                q.add(new int[]{i, cost + map[town][i]});
                map[1][i] = cost + map[town][i];
            }
        }
        
        // 배달 할 수 있는 마을 체크
        for(int i = 2; i <= N; i++) {
            if(map[1][i] > K || map[1][i] == 0) continue;
            
            answer++;
        }
        
        return answer;
    }
}