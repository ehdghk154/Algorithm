/**
 * 전력망을 둘로 나누기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/86971
 */

class Solution {
    static int[][] map; // 전력망
    static boolean[][] isVisited; // 송전탑 방문 여부
    static int count; // 연결된 송전탑 개수
    public int solution(int n, int[][] wires) {
        int answer = 100;
        map = new int[n+1][n+1];
        
        // 송전탑 연결 현황 map에 입력
        for(int i = 0; i < wires.length; i++) {
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            map[v1][v2] = map[v2][v1] = 1;
        }
        
        // 전선을 하나씩 끊어가며 확인
        for(int i = 0; i < wires.length; i++) {
            isVisited = new boolean[n+1][n+1];
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            map[v1][v2] = map[v2][v1] = 0; // 송전탑 v1번과 v2번의 전선 분리 
            int[] network = new int[2]; // 나눠진 전력망의 송전탑 개수
            int k = 0;
            for(int j = 1; j < map.length; j++) {
                count = 0;
                dfs(j); // j번부터 연결된 송전탑 개수 체크
                if(count != 0) { // 연결된 송전탑 network에 입력
                    network[k++] = count;
                }
            }
            // 두 네트워크의 송전탑 개수 차이가 가장 작으면 answer에 입력
            answer = Math.min(answer, Math.abs(network[0]-network[1]));
            map[v1][v2] = map[v2][v1] = 1; // 전선 연결
        }
        
        
        return answer;
    }
    
    // 깊이우선탐색(DFS) 방식 사용하여 송전탑 개수 체크
    static void dfs(int prev) {
        for(int j = 1; j < map[prev].length; j++) {
        	// 두 송전탑이 연결되어 있고, j번 송전탑을 방문한 적 없다면
            if(map[prev][j] == 1 && !isVisited[prev][j]) {
                isVisited[prev][j] = true;
                isVisited[j][prev] = true;
                count++;
                dfs(j);
            }
        }
    }
}