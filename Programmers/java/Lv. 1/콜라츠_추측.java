/**
 * 콜라츠 추측 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12943
 */

class Solution {
    public int solution(int num) {
        int answer = 0;
        // int형의 범위를 벗어나는 경우가 있기에 long으로 변경
        long lNum = (long)num;
        while(lNum != 1) {
        	// 500회가 넘어갈 경우 answer의 값을 -1로 만들고 중지
            if(answer >= 500) {
                answer = -1;
                break;
            }
            // 짝수일 경우 2로 나눔
            if(lNum % 2 == 0) lNum /= 2;
            // 짝수가 아닐 경우 *3 +1
            else lNum = lNum*3 + 1;
            // 횟수 추가
            answer++;
        }
        return answer;
    }
}