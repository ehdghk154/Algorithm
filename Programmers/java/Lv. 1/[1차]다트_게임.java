/**
 * [1차]다트 게임 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/17682
 */

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        // S = 1제곱(그대로), D = 2제곱, T = 3제곱
        // 스타상(*) = 해당 점수 및 바로 전 점수를 2배로
        // (첫번째에서도 나올 수 있음 = 첫번째 점수만 2배)
        // (다른 스타상과 중첩될 수 있음 = 2배 더 = 4배)
        // (아차상과도 중첩될 수 있음 = -2배)
        // 아차상(#) = 해당 점수를 마이너스로
        int[] chance = new int[3];
        int j = 0;
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            switch(c) {
            case '1':
                if(dartResult.charAt(i+1) == '0') {
                    chance[j] = 10;
                    i++;
                }else {
                    chance[j] = 1;
                }
                j++;
                break;
            case '*':
                if(j == 1) chance[j-1] *= 2;
                else {
                    chance[j-2] *= 2;
                    chance[j-1] *= 2;
                }
                break;
            case '#':
                chance[j-1] *= -1;
                break;
            case 'S':
                break;
            case 'D':
                chance[j-1] *= chance[j-1];
                break;
            case 'T':
                chance[j-1] *= chance[j-1]*chance[j-1];
                break;
            default:
                chance[j] = Character.getNumericValue(c);
                j++;
                break;
            }
        }

        for(int i = 0; i < chance.length; i++) {
            answer += chance[i];
        }

        return answer;
    }
}