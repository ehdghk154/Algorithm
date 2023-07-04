/**
 * 최대공약수와 최소공배수 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12940
 */

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = GCD(n, m); // 최대공약수
        answer[1] = n*m/answer[0]; // 최소공배수
        return answer;
    }
    
    // 최대공약수 - 유클리드 호제법
    public int GCD(int n, int m) {
        int remain = n%m;
        if(remain == 0) return m;
        else {
            n = m;
            m = remain;
            return GCD(n,m);
        }
    }
}