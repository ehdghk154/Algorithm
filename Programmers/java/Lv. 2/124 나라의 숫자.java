/**
 * 124 나라의 숫자(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12899
 */

class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        /**
         * 10진법		3진법		124나라
			1		1		1
			2		2		2
			3		10		4 <-
			4		11		11
			5		12		12
			6		20		14 <-
			7		21		21
			8		22		22
			9		100		24 <-
			
			위와 같이 표시된 3의 배수들 외에는 모두 3진법과 동일
			3의 배수 관련 로직을 작성하면
			n값을 3으로 나눈 나머지가 0이면 4로 처리 후
			몫에 -1을 하고 계산하면 해당 값이 나옴
         */
        while(n > 0) {
        	int t = n % 3;
        	if(t == 0)
        		sb.append(4);
        	else
        		sb.append(t);
        	n = (n-1) / 3;
        }
        
        answer = sb.reverse().toString();
        
        return answer;
    }
}