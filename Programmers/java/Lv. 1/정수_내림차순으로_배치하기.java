/**
 * 정수 내림차순으로 배치하기(Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        // n을 String 변환 후 Integer배열에 추가
        String temp = Long.toString(n);
        Integer[] digits = new Integer[temp.length()];
        for (int i = 0; i < temp.length(); i++)
            digits[i] = temp.charAt(i) - '0';
        
        // Arrays.sort를 이용하여 내림차순 정렬
        // Collections는 객체에서만 사용 가능하므로 int가 아닌 Integer 사용
        Arrays.sort(digits, Collections.reverseOrder());
        
        // answer에 정렬된 숫자 입력
        // toString(), String.valueof()를 사용하면 
        // "[", ",", "]", " "이 사용되므로 replaceAll을 이용하여 제거
        answer = Long.parseLong(Arrays.toString(digits).replaceAll("[^0-9]",""));
        return answer;
    }
}