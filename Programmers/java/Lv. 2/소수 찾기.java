/**
 * 소수 찾기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42839
 */

class Solution {
    static char[] nums; // 종이 조각들
    static boolean[] isChecked = new boolean[10000000]; // 중복 숫자 체크
    static int answer = 0; // 소수 개수
    
    // 소수 판별
    public static boolean isPrime(int num){
    	if(num <= 1) return false;
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    
    public static void dfs(boolean[] visited, String num) {
        for(int i = 0; i < nums.length; i++) {
            String sNum = num + String.valueOf(nums[i]);
            int n = Integer.parseInt(sNum);
            if(n == 0) // 첫 숫자가 0인 경우
                continue;
            if(visited[i]) // 이전에 사용된 숫자인 경우
            	continue;
            
            // 소수인지, 이미 나온 숫자인지 판별
            if(isPrime(n) && !isChecked[n]) {
                isChecked[n] = true;
                answer++;
            }
            
            // 현재 입력된 숫자로 다음 숫자 탐색
            visited[i] = true;
            dfs(visited, sNum);
            visited[i] = false;
        }
    }
    
    public int solution(String numbers) {
    	int len = numbers.length();
        nums = new char[len];
        for(int i = 0; i < len; i++) {
            nums[i] = numbers.charAt(i);
        }
        
        dfs(new boolean[len+1], "");
        
        return answer;
    }
}