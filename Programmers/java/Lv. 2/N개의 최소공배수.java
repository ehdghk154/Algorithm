/**
 * N개의 최소공배수(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12953
 */

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        // 각 arr의 원소와 answer의 최대공약수를 계산 후
        // 그 값으로 최소공배수를 구함
        for(int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int gc = gcd(x, answer); // 최대공약수
            answer = x * answer / gc; // 최소공배수
        }
        return answer;
    }
    
    // 최대공약수
    static int gcd(int x, int y) {
        if(y == 0) return x;
        return gcd(y, x%y);
    }
}
/** 각 숫자의 공약수와 서로소를 찾아 최소공배수를 구함
class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        int[] num = new int[100];
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            int div = 2;
            int count = 0;
            while(true) {
                if(arr[i] % div == 0) {
                    arr[i] /= div;
                    count++;
                }else {
                    num[div] = num[div] < count ? count : num[div];
                    div++;
                    count = 0;
                    if(arr[i] == 1) break;
                }
            }
            max = max < div ? div : max;
        }
        
        for(int i = 2; i <= max; i++) {
                if(num[i] != 0) {
                    answer *= Math.pow(i, num[i]);
                }
            }
        
        return answer;
    }
}
*/