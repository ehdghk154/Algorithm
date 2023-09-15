/**
 * 숫자의 표현(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12924
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 순서대로 반복문 시작
        for(int i = 1; i <= n; i++) {
            int sum = 0; // 연속된 수의 합
            
            // i부터 시작되는 연속된 수를 sum에 더함
            for(int j = i; j <= n; j++) {
                sum += j;
                // sum이 n과 같아지면 answer 1 증가
                if(sum == n) {
                    answer++;
                    break;
                // n보다 커지게 되면 반복문 종료
                }else if(sum > n) 
                    break;
            }
            
            /** 정수론 정리 중
             * 	주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 
             *  주어진 수의 홀수 약수의 개수와 같다
             *  for(int i = 1; i <= n; i += 2) {
             *		if(n % i == 0) answer++;
        	 * 	}
             */
        }
        
        return answer;
    }
}