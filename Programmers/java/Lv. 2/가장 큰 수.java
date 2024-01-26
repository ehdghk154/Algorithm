/**
 * 가장 큰 수(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42746
 */

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        // 사전식 정렬을 위해 String으로 리스트에 저장
        for(int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }
        /**
         * 1번 숫자와 2번 숫자가 있다면 
         * (1번+2번) 숫자와 (2번+1번) 숫자 중 큰 순서로 정렬
         * ex. [6, 10, 2]가 있다면 먼저,
         * 6과 10은
         * -610과 106 중 610이 크므로 6, 10 순서로 정렬
         * 10과 2는
         * -102와 210 중 210이 크므로 2, 10 순서로 정렬
         * 6과 2는
         * -62와 26 중 62가 크므로 6, 2 순서로 정렬
         * 
         * 위 결과를 종합하면
         * 6, 2, 10 순서로 정렬되어 정답은 6210이 된다
         */
        Collections.sort(list, (s1, s2) -> {
            return(s2+s1).compareTo(s1+s2);
        });
            
        for(String num : list) {
            answer += num;
        }
        // 만약 answer가 "00"이나 "000"같은 값이 나온다면 "0"으로 저장
        if(answer.charAt(0) == '0') answer = "0";
        
        return answer;
    }
}