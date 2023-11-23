/**
 * 피로도(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/87946
 */

class Solution {
	static int max = Integer.MIN_VALUE;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        // 던전이 a, b, c가 있을 때, 던전 순회를
        // abc, acb, bac, bca, cab, cba 같이 모든 경우를 확인해야 하므로
        // dfs(깊이 우선 탐색), 재귀 등과 같은 완전 탐색 알고리즘 사용
        adventure(k, dungeons, new boolean[dungeons.length], 0);
        answer = max;
        
        return answer;
    }
    
    // dfs 알고리즘 사용하여 가장 많이 던전 도는 경우의 수를 구하기
    static void adventure(int k, int[][] dungeons, boolean[] visited, int count) {
    	// 현재 던전을 돈 횟수가 이전에 비해 많다면 max = count
    	if(max < count) max = count;
    	
    	// visited를 이용하여 방문 여부를 확인하며 진행
    	for(int i = 0; i < dungeons.length; i++) {
    		if(!visited[i] && k >= dungeons[i][0]) {
    			visited[i] = true;
    			adventure(k-dungeons[i][1], dungeons, visited, count+1);
    			visited[i] = false;
    		}
    	}
    }
}