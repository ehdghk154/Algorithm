/**
 * 최솟값 만들기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12941
 */
import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        // A, B 오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        int length = A.length;
        
        // A배열의 첫 번째 값부터 마지막 값으로,
        // B배열의 마지막 값부터 첫 번째 값으로 가며
        // 두 값을 곱하여 answer에 더하기
        for(int i = 0; i < length; i++) {
            answer += A[i] * B[length-i-1];
        }
        
        return answer;
    }
}