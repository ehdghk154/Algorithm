/**
 * 다음 큰 숫자(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12911
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        int next = n+1; // 다음 큰 숫자(예정)
        // n을 2진수로 변환 후 1의 개수
        int nBinary = Integer.toBinaryString(n).replace("0", "").length();
        
        // n보다 크고 2진수로 변환했을 때 1의 개수가 같은 수를 찾을 때까지 반복
        while(true) {
        	// next를 2진수로 변환 후 1의 개수
            int nextBinary = Integer.toBinaryString(next).replace("0", "").length();
            
            // n과 next의 2진수 변환 후의 1의 개수가 같을 경우 반복 중지
            if(nBinary == nextBinary) {
                answer = next;
                break;
            }
            
            // 해당하는 숫자가 아니면 1 증가시키고 반복
            next++;
        }
        
        return answer;
    }
}