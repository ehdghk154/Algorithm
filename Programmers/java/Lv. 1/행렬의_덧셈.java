/**
 * 행렬의 덧셈 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12950
 */

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1; //answer에 arr1 저장
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < answer[0].length; j++) {
            	// 행렬의 같은 위치에 있는 값을 더함
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}