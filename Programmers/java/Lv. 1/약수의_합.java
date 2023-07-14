/**
 * 약수의 합(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        int div = 1; // (예비)약수
        // n의 루트값까지 체크
        while(div <= Math.sqrt(n)) {
        	// div가 n의 약수이면
            if(n % div == 0) {
            	// 만약 div*div가 n이 아니라면
                if(div != Math.sqrt(n)) {
                    answer += div;
                    answer += n/div;
                // 만약 div*div가 n이라면
                }else {
                    answer += div;
                }
            }
            div++;
        }
        return answer;
    }
}