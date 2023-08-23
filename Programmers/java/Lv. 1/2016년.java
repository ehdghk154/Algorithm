/**
 * 2016년(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12901
 */

import java.time.LocalDate;

public class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 1월 1일이 금요일이므로 인덱스 1번을 "FRI"로 정하고 시작
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int totalDay = 0;
        for(int i = 1; i < a; i++) {
        	// 월별 일수 구하기
        	LocalDate newDate = LocalDate.of(2016, i, 1);
    		int lom = newDate.lengthOfMonth();
    		// 총 일수에 더하기
    		totalDay += lom;
        }
        // 이전 달까지의 일수를 합친 값에 나머지 일수인 b를 더하기
        totalDay += b;
        // 일주일인 7로 나눈 나머지를 저장
        totalDay %= 7;
        // 나머지 일수에 따라 요일 answer에 입력
        answer = week[totalDay];
        
        return answer;
    }
}