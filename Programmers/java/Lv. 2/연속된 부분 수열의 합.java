/**
 * 연속된 부분 수열의 합(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/178870
 */

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        // 인덱스 값 [prev, cur]
        int cur = sequence.length-1;
        int prev = sequence.length-1;
        int len = 1000000; // 최대 수열 길이
        int sum = 0; // 수열의 합
        while(true) {
        	if(prev < 0) break; // 수열 범위를 벗어나면 종료
        	sum += sequence[prev];
        	
        	if(sum == k) { // 수열의 합이 k인 경우
        		// 현재 부분 수열의 길이가 짧거나 같으면 인덱스와 길이 저장
        		if(cur-prev <= len) {
        			answer[0] = prev;
            		answer[1] = cur;
            		len = cur-prev;
        		}
        		// 다음 수열을 위해 마지막 값 제거
                sum -= sequence[cur];
                // 인덱스 이동
                cur--;
                prev--;
        	}else if(sum > k) { // 수열의 합이 k를 넘을 경우
        		sum -= sequence[cur]; // 마지막 값 제거
        		if(cur == prev) { // 두 인덱스가 같으면 prev 1 감소
        			prev--;
        		}else { // 반복문 처음에 prev에 해당하는 수열을 더하므로 제거(중복 값 제거)
                    sum -= sequence[prev];
                }
        		cur--; // 마지막 값을 제거했으므로 cur 1 감소
        	}else { // 수열의 합이 k보다 작은 경우
        		prev--;
        	}
        }
        
        return answer;
    }
}