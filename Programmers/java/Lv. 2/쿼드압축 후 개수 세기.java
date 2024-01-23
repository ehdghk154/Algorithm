/**
 * 쿼드압축 후 개수 세기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/68936
 */

/**
 * 1. 정사각형 영역 중 왼쪽 위 끝의 값을 기준으로 잡는다.(0 또는 1)
 * 2. 왼쪽 위 끝부터 오른쪽 아래 끝까지 순회하며 기준값과 같은지 확인한다.
 * 2-1. 순회가 끝날 때까지 기준값과 같다면 기준값 개수를 1 증가시킨다.
 * 2-2. 기준값과 다른 값이 나온다면 순회를 중단하고 정사각형 영역을 4개로 쪼개어 각각 순회한다.
 * 3. 행(열)의 길이가 1이 될 때까지 또는 각 영역이 같은 값으로 이루어질 때까지 1~2번 항목을 반복한다.
 * 4. 압축이 끝나면 0과 1의 개수를 출력한다.
 */
class Solution {
    static int[] answer = new int[2];
    
    // 정사각형 영역의 값들이 모두 같은지 판별
    static boolean check(int[][] arr, int x, int y, int len) {
        for(int i = y; i < y+len; i++) {
            for(int j = x; j < x+len; j++) {
                if(arr[i][j] != arr[y][x]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // 정사각형 영역 압축
    static void compress(int[][] arr, int x, int y, int len) {
        int base = arr[y][x]; // 기준값
        if(len == 1) { // 크기가 1x1이라면
            answer[base]++;
            return;
        }
        
        // 영역의 값이 모두 같다면 기준값 개수 1 증가
        if(check(arr, x, y, len))
            answer[base]++;
        else { // 다르면 영역 4등분 후 다시 압축
            len /= 2;
            compress(arr, x, y, len);
            compress(arr, x+len, y, len);
            compress(arr, x, y+len, len);
            compress(arr, x+len, y+len, len);
        }
    }
    
    public int[] solution(int[][] arr) {
        compress(arr, 0, 0, arr.length);
        
        return answer;
    }
}