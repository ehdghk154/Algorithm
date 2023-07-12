/**
 * 자릿수 더하기(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        // n이 0이 될 때까지 반복
        while(n != 0) {
        	// n을 10으로 나눈 나머지(일의 자리 수)를 answer에 더함
            answer += n%10;
            // answer에 더한 일의 자리 수를 제거하기 위해 n을 10으로 나눔
            n /= 10;
        }
        return answer;
    }
}