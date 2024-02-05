/**
 * 두 큐 합 같게 만들기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/118667
 */

class Solution {
	static int[][] tri; // 삼각형
	static int limit = 0; // 삼각형 칸 개수(최대 숫자)
    public int[] solution(int n) {
    	tri = new int[n][];
    	// 최대 숫자, 삼각형 형태 2차원 배열
    	for(int i = 1; i <= n; i++) {
    		limit += i;
    		tri[i-1] = new int[i];
    	}
        int[] answer = new int[limit];
        
        // n이 1 또는 2일 경우
        if(n <= 2) {
        	for(int i = 1; i <= answer.length; i++) {
        		answer[i-1] = i;
        	}
        }else {
        	TriSnail(0, 0, 1); // 삼각 달팽이 채우기
        	
	        int idx = 0;
	        for(int i = 0; i < tri.length; i++) {
	        	for(int j = 0; j < tri[i].length; j++) {
	        		answer[idx++] = tri[i][j];
	        	}
	        }
        }
        
        return answer;
    }
    
    // 삼각 달팽이 채우기
    static void TriSnail(int y, int x, int num) {
    	while(num <= limit) { // 칸을 모두 채우면 종료
    		// 남서쪽 방향으로 내려가며 채우기
    		for(int i = y; i < tri.length; i++) {
				if(tri[i][x] != 0) break; // 이미 채운 칸이면 종료(끝에 도착)
	    		tri[i][x] = num++;
	    		y = i;
			}
    		
    		// 오른쪽으로 이동하며 채우기
			for(int i = x+1; i < tri[y].length; i++) {
				if(tri[y][i] != 0) break; // 이미 채운 칸이면 종료(끝에 도착)
	    		tri[y][i] = num++;
	    		x = i;
			}
			
			// 북서쪽 방향으로 올라가며 채우기
			while(tri[y-1][x-1] == 0) {
				tri[y-1][x-1] = num++;
				y--;
				x--;
			}
			y++; // 다음 입력 칸으로 내리기
    	}
    }
}