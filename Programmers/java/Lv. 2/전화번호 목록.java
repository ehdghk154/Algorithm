/**
 * 전화번호 목록(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42577
 */

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 사전 순 정렬 (ex. "12","1243","123","1245","12345"
        //				  => "12","123","12345","1243","1245")
        Arrays.sort(phone_book);
        
        // 반복문을 돌며 앞 번호가 뒷 번호의 접두어인 경우를 찾기
        for(int i = 0; i < phone_book.length-1; i++) {
            String number1 = phone_book[i];
            String number2 = phone_book[i+1];
            // 앞 번호의 길이가 뒷 번호보다 길면 접두어X
            if(number1.length() > number2.length())
                continue;
            
            // 사전 순 정렬이므로 근접해있는 번호만 비교
            if(number1.equals(number2.substring(0, number1.length())))
                return false;
        }
        
        return answer;
    }
}