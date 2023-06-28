/**
 * 하샤드 수 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int _x = x;
        // int를 String으로 변환 후 길이 저장
        int length = String.valueOf(x).length();
        
        // x의 자릿 수를 sum에 더함
        for(int i = 0; i < length; i++) {
            sum += _x%10;
            _x /= 10;
        }
        
        // 나누어 떨어지지 않을 경우 false
        if(x % sum != 0) answer = false;
        
        return answer;
    }
}