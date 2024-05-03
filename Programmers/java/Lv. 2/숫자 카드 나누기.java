/**
 * 숫자 카드 나누기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/135807
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        int aGCD = getGCD(arrayA, arrayA[0]);
        int bGCD = getGCD(arrayB, arrayB[0]);
        
        // 두 조건 중 가장 큰 양의 정수 answer에 입력
        answer = Math.max(getNum(arrayA, bGCD), getNum(arrayB, aGCD));
        
        return answer;
    }
    
    // 제곱근을 이용하여 약수 구하기
    public static ArrayList<Integer> getDivisor(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        double sqrt = Math.sqrt((double) n);
        for(int i = 1; i <= sqrt; i++) {
            if(n % i == 0) { // 약수 중 작은 수 저장
                arr.add(i);
                if(n / i != i) { // 약수 중 큰 수 저장, 중복 저장 방지
                    arr.add(n / i);
                }
            }
        }
        
        // 가장 큰 양의 정수를 구하는 것이므로 큰 수부터 체크하기 위해 내림차순 정렬
        arr.sort(Collections.reverseOrder()); 
        
        return arr;
    }
    
    // a(b)의 카드가 b(a)의 최대공약수로 나눠지는지 체크
    public int getNum(int[] array, int GCD) {
		for(int n : array) {
			// a(b)의 카드 중 하나라도 b(a)의 최대공약수로 나눠진다면 0 반환
			if(n % GCD == 0) return 0;
		}
		return GCD;
	}
    
    // 최대공약수 구하기
	public static int getGCD(int[] array, int min) {
    	int gcd = 1;
    	// 약수를 먼저 구해 for문 반복 횟수 줄이기
    	ArrayList<Integer> divisor = getDivisor(min);
    	for(int n : divisor) {
        	if(getArrayGCD(array, n)) {
        		gcd = n;
        		break;
        	}
        }
    	return gcd;
    }
    
	// 해당 공약수(d)가 보유한 모든 카드(array)의 공약수인지 체크
    public static boolean getArrayGCD(int[] array, int d) {
        for(int n : array) {
        	if(n % d != 0) return false;
        }
        return true;
    }
    
}