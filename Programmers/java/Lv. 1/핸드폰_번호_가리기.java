/**
 * 핸드폰 번호 가리기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        // 1. 뒷 4자리를 제외한 앞 자릿 수만큼 *을 answer 추가
        // 2. subString으로 뒷 4자리 answer에 추가
        answer = "*".repeat(phone_number.length()-4) 
                + phone_number.substring(phone_number.length()-4);
        return answer;
    }
}