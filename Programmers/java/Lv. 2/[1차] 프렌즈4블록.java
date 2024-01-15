/**
 * [1차] 프렌즈4블록(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/17679
 */

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] board_ = new char[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                board_[i][j] = board[i].charAt(j);
            }
        }
        while(true) {
        	boolean[][] check = new boolean[m][n];
        	boolean flag = false;
            
        	// 터뜨릴 블록 체크
            for(int i = 0; i < m-1; i++) {
                for(int j = 0; j < n-1; j++) {
                    if(board_[i][j] != ' ' 
            		&& board_[i][j] == board_[i][j+1] 
    				&& board_[i][j] == board_[i+1][j] 
					&& board_[i][j] == board_[i+1][j+1]) {
                    	check[i][j] = true;
                    	check[i][j+1] = true;
                    	check[i+1][j] = true;
                    	check[i+1][j+1] = true;
                    	flag = true;
                    }
                }
            }
            
            // 터뜨린 블록이 없다면 종료
            if(!flag) {
            	break;
            }
            
            // 블록 터뜨리기(터진 블록은 공백으로 대체)
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(check[i][j]) {
                    	board_[i][j] = ' ';
                    }
                }
            }
            
            // 빈 공간에 블록 내리기
            for(int i = 0; i < n; i++) {
            	Queue<Character> q = new LinkedList<>();
            	for(int j = m-1; j >= 0; j--) {
            		if(board_[j][i] != ' ') {
            			q.offer(board_[j][i]);
            		}
            	}
            	
            	// 현재 높이가 처음 높이보다 낮다면 빈 공간에 공백 추가
            	if(q.size() < m) {
            		int blank = m - q.size();
            		for(int j = 0; j < blank; j++) {
            			q.offer(' ');
            		}
            	}
            	
            	// 내려진 블록들 판에 입력
            	for(int j = m-1; j >= 0; j--) {
            		board_[j][i] = q.poll();
            	}
            }
        }
        
        // 터진 블록 개수 체크
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		if(board_[i][j] == ' ')
        			answer++;
        	}
        }
        
        return answer;
    }
}