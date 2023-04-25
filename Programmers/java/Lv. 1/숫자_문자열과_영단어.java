/**
 * 숫자 문자열과 영단어 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        for(int i = 0; i <= 9; i++) {
            if(s.contains(word[i])) {
                s = s.replace(word[i], num[i]);
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}