/**
 * 튜플(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/64065
 */

import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        String[] _s = s.split("}"); // 집합 나누기
        int[] answer = new int[_s.length];
        
        // 앞에 남은 {{와 ,{ 없애기
        for(int i = 0; i < _s.length; i++) {
        	_s[i] = _s[i].substring(2);
        }
        
        // 집합의 길이 별로 정렬(오름차순)
        // 집합의 길이가 짧은 순으로 해야 표현하는 튜플을 알 수 있다
        Arrays.sort(_s, (s1, s2) -> {
        	return s1.length() - s2.length();
        });
        
        // 튜플 판별
        for(int i = 0; i < _s.length; i++) {
        	// 집합을 원소 단위로 나누기
            String[] nums = _s[i].split(",");
            // nums 집합에서 튜플에 맞게 원소 판별
        	answer[i] = checked1(nums, answer);
        }
        return answer;
    }
    
    // nums 집합에서 튜플에 맞게 원소 판별
    static int checked1(String[] nums, int[] answer) {
    	for(int i = 0; i < nums.length; i++) {
    		int n = Integer.parseInt(nums[i]);
    		// nums 집합 중 아직 입력되지 않은 원소일 경우 n 리턴
    		if(checked2(n, answer)) {
    			return n;
    		}
    	}
    	return 0;
    }
    
    // 해당 n이 튜플에 포함되어 있는지 판별
    static boolean checked2(int n, int[] answer) {
    	for(int i = 0; i < answer.length; i++) {
    		// 포함되어 있다면 입력x(false 리턴)
			if(answer[i] == n) return false;
		}
    	// 포함되어 있지 않다면 입력(true 리턴)
    	return true;
    }
}

/**
 * indent depth(들여쓰기 깊이)를 2까지만 해서 코드를 작성해 보았다.
 * 프로그래머스 테스트 중 가장 오래걸린 부분에서(테스트10~14)
 * depth 생각 안하고 3중 for문에 if문으로 작성한 것보다
 * depth를 2로 제한하고 작성한 코드가 대략 2배정도 빠르다.
 * 
 * answer를 전역 변수로 옮겨서 할 수도 있었지만,
 * 기존에 제공된 변수는 그 자리에서 옮기지 않고 사용했다(전역 변수로 했을 때가 조금 더 빠르다)
 */