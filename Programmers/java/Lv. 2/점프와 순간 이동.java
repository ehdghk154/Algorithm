/**
 * 점프와 순간 이동(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12980
 */

class Solution {
    public int solution(int n) {
    	int ans = 0;
    	// 건전지 사용량이 가장 적은 방법을 알기 위해 역으로 계산
    	// n이 0이 될 때까지 반복
        while(n != 0) {
        	if(n%2 == 0) { // n을 2로 나눈 나머지가 0이면 2로 나눔(순간이동)
        		n /= 2;
        	
        	}else { // 나머지가 0이 아니면 한 칸 뒤로 이동(점프)
        		n--;
        		ans++; // 점프 칸 수만큼 건전지 사용(1 사용)
        	}
        }
        return ans;
    }
}