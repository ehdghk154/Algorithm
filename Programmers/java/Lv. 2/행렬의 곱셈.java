/**
 * 행렬의 곱셈(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12949
 */

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        // arr1의 행과 arr2의 열을 곱해야 하므로
        // 첫 번째 행렬의 행의 개수
        for(int i = 0; i < arr1.length; i++) {
        	// 두 번째 행렬의 열의 개수
            for(int j = 0; j < arr2[0].length; j++) {
            	// 첫 번째 행렬의 열의 개수
                for(int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}