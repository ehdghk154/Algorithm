/**
 * 덧칠하기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/161989
 */

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
		int check = 0;

		for(int i = 0; i < section.length; i++) {
			if(check < section[i]) {
				check = section[i] + m - 1;
				answer++;
			}
		}

		return answer;
    }
}