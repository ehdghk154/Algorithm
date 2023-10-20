/**
 * 예상 대진표(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12985
 */

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        
        // 1,2 = 1 / 3,4 = 2 / 5,6 = 3 / 7,8 = 4 / ...
        // 현재 번호에 1을 더한 후 2로 나눈 값이 다음 라운드의 번호가 됨
        while(a != b) {
            a = (a+1)/2;
            b = (b+1)/2;
            answer++;
        }

        return answer;
    }
}

/** 어떻게든 한번에 구하겠다고 한 노가다의 산물.. (사실 한번에 구한 것도 아님)
class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        int high = a > b ? a : b;
        int low = a > b ? b : a;
        while(true) {
	    	if(n/2 >= high) {
	    		n /= 2;
	    	}else if(n/2 < low){
	    		high -= n/2;
	    		low -= n/2;
	    		n /= 2;
	    	}else {
	    		a = high;
	    		b = low;
	    		break;
	    	}
        }
        if((n/2 >= a && n/2 >= b) || (n/2 < a && n/2 < b)) {
            answer = (int)(Math.log10(n/2)/Math.log10(2));
        }else {
        	answer = (int)(Math.log10(n)/Math.log10(2));
        }
        

        return answer;
    }
}
 */
