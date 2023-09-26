/**
 * 카펫(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42842
 */

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 최소 y값인 3을 기준으로 시작 (가로 x, 세로 y)
        int x = brown/2 - 1, y = 3;
        
        // x가 y보다 크거나 같을 때만 반복
        while(x >= y) {
        	// 테두리 1줄만 갈색 격자이므로 가운데 크기는 (가로-2)*(세로-2)
            if((x-2)*(y-2) == yellow) {
                answer[0] = x;
                answer[1] = y;
                break;
            // 같지 않다면 x-=1, y+=1
            }else {
                x -= 1;
                y += 1;
            }
        }
        
        return answer;
    }
}