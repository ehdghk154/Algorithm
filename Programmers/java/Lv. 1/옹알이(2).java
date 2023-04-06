/**
 * 옹알이(2) (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/133499
 */

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String str : babbling) {
            answer += count(str);
        }
        return answer;
    }

    private int count(String str) {
        if(str.contains("ayaaya") || str.contains("yeye") || str.contains("woowoo") || str.contains("mama"))
            return 0;
        str = str.replace("aya", " ");
        str = str.replace("ye", " ");
        str = str.replace("woo", " ");
        str = str.replace("ma", " ");
        str = str.replace(" ", "");
        
        if(str == "") return 1;
        else return 0;
    }
}