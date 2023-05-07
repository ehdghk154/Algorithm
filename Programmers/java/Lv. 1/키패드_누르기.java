/**
 * 키패드 누르기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/67256
 */

class Solution {
    public StringBuilder solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int L_pos = 10; // 왼손 시작점(*)
        int R_pos = 12; // 오른손 시작점(#)
        
        for(int i = 0; i < numbers.length; i++) {
        	// 0번 키패드는 11로 치환
            int number = numbers[i] == 0 ? 11 : numbers[i];
            switch(number) {
                case 1: case 4: case 7: L_pos = number; answer.append("L"); break;
                case 3: case 6: case 9: R_pos = number; answer.append("R"); break;
                default:
                	// 누를 번호와 현재 손가락 위치 간의 거리 측정
                    int L_dist = Math.abs(number - L_pos);
                    int R_dist = Math.abs(number - R_pos);
                    L_dist = (L_dist/3) + (L_dist%3);
                    R_dist = (R_dist/3) + (R_dist%3);
                    
                    if(L_dist < R_dist) {
                        L_pos = number;
                        answer.append("L");
                    }else if(L_dist > R_dist) {
                        R_pos = number;
                        answer.append("R");
                    }else {
                        if(hand.equals("left")) {
                            L_pos = number;
                            answer.append("L");
                        }else {
                            R_pos = number;
                            answer.append("R");
                        }
                    }
                    break;
            }
        }
        
        return answer;
    }
}