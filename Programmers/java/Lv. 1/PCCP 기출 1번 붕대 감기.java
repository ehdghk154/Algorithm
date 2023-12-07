/**
 * PCCP기출 1번 / 붕대 감기(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/19344/lessons/242258?language=java
 */

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int HP = health; // 현재 체력
        int combo = 0; // 연속으로 감은 횟수
        int idx = 0; // 공격 순서
        
        // 가장 늦은 공격 시간까지 반복
        for(int i = 1; i <= attacks[attacks.length-1][0]; i++) {
            // 공격 시간이면 HP 감소(-attacks[idx][0]), combo 초기화, idx+
        	// 만약, HP가 0이하로 내려가면 -1 return
        	if(i == attacks[idx][0]) {
                HP -= attacks[idx][1];
                combo = 0;
                idx++;
                if(HP <= 0) return -1;
            // 1초마다 HP에 붕대 감기(+bandage[1]), combo+
            // 만약 combo가 붕대 시전 시간과 같아지면 추가 회복(+bandage[2])
            // 현재 체력(HP)은 최대 체력(health)보다 커질 수 없음
            }else {
                HP += bandage[1];
                combo++;
                if(combo == bandage[0]) {
                    HP += bandage[2];
                    combo = 0;
                }
                if(HP > health)
                    HP = health;
            }
        }
        
        answer = HP;
        
        return answer;
    }
}