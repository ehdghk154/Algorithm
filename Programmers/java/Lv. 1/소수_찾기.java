/**
 * 소수 찾기(Lv. 1) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12921
 */
class Solution {
	int prime(int n) {
		int answer = 0; // 소수 개수
		for (int i = 2; i <= n; i++) {
			boolean check = false; // 소수여부 판별
			// 제곱근까지만 반복문하는 이유 = 에라토스테네스의 체
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) { // 약수가 있다면
					check = true; // 소수X
					break;
				}
			}
			// false가 소수이므로 소수라면 answer에 1 추가
			if (!check)
				answer++;
		}
		return answer;
	}

	public int solution(int n) {
		return prime(n);
	}
}