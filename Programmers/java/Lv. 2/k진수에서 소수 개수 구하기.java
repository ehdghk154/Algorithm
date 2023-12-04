/**
 * k진수에서 소수 개수 구하기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/92335
 */

import java.util.ArrayList;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        ArrayList<Integer> kNumber = new ArrayList<>();
        // k진수 변환
        while(n != 0) {
            kNumber.add(n%k);
            n /= k;
        }
        
        long mul = 1; // 자릿수
        long num = 0; // 0을 포함하지 않는 수
        for(int i = 0; i < kNumber.size(); i++) {
            long kn = kNumber.get(i);
            // 다음 자릿수가 0일 경우 저장된 수(num)가 소수인지 판별
            if(kn == 0) {
                answer += decimal(num);
                num = 0;
                mul = 1;
            // 다음 자릿수가 0이 아닌 수일 경우 num에 추가(kn*mul)
            }else {
                num += kn*mul;
                mul *= 10;
            }
        }
        // 마지막에 추가된 수의 소수 판별
        answer += decimal(num);
        
        return answer;
    }
    
    // 소수 판별
    static int decimal(long n) {
        if(n <= 1) return 0;
        
        for(long i = 2; i*i <= n; i++) {
            if(n%i == 0) return 0;
        }
        
        return 1;
    }
}