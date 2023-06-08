/**
 * 소수 만들기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12977
 */

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 3개의 값을 더하기 위해 삼중으로 반복문 사용
        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean flag = false; // 소수일 경우 false, 아닐 경우 true
                    // sum의 루트값만큼 반복하여 소수인지 판별
                    for(int l=2; l*l<=sum; l++){
                        if(sum % l == 0) {
                            flag = true;
                            break;
                        }
                    }
                    // 소수일 경우 answer 1 증가
                    if(!flag) answer++;
                }
            }
        }

        return answer;
    }
}