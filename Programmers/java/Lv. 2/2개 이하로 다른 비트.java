/**
 * 2개 이하로 다른 비트(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/77885
 */

/** 비트가 1~2개 다른 수들 중에서 제일 작은 수
 * 10 -> 11
 * 110 -> 111
 * 1010 -> 1011
 * 위와 같이 첫자리가 0이면 1을 더한다.
 * 
 * 그 외에는 
 * 01 -> 10
 * 101 -> 110
 * 1101 -> 1110
 * 
 * 011 -> 101
 * 10011 -> 10101
 * 1011011 -> 1011101
 * 
 * 0111 -> 1011
 * 110111 -> 111011
 * 1010111 -> 1011011
 * 0을 만나는 바로 앞의 1을 한 칸 왼쪽으로 이동하는 것과 같다
 * 이동하기 위해서는 해당 1이 위치한 비트의 값을 더하면 한 칸 올릴 수 있다.
 * (ex. 10'1'1 -> 11(1011)에 2(10)를 더함, '1'11 -> 7(111)에 4(100)를 더함)
 * 0을 만나는 1의 위치는 (연속된 1의 개수)-1 이므로
 * 2의 [(연속된 1의 개수)-1] 승을 더한다.
 */
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
        	// 비트가 0이 나올 때 계산해야 하므로 첫 자리에 0 추가
            String bit = "0"+Long.toBinaryString(numbers[i]);
            int count = 0; // 연속된 1의 개수
            for(int j = bit.length()-1; j >= 0; j--) {
            	if(bit.charAt(j) == '0') {
            		if(count == 0) // 첫자리가 0일 경우 현재 정수에 1 더하기
                        answer[i] = numbers[i]+1;
                    else { // 현재 정수에 2의 count-1 승 더하기
                        answer[i] = numbers[i]+(long)Math.pow(2, count-1);
                    }
            		break;
            	}else count++;
            }
            
        }
        
        return answer;
    }
}