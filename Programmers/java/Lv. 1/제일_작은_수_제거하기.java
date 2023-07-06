/**
 * 제일 작은 수 제거하기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */

class Solution {
    public int[] solution(int[] arr) {  
        if(arr.length == 1) { // 길이가 1일 경우 -1 리턴
        	int[] answer = new int[1];
            answer[0] = -1;
        }else {
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < arr.length; i++) {
                if(min > arr[i]) {
                    min = arr[i]; // 가장 작은 수 저장
                }
            }
            int[] answer = new int[arr.length-1];
            int i = 0;
            for(int a : arr) {
                if(a != min) { // 가장 작은 수를 제외한 수 answer에 입력
                    answer[i] = a;
                    i++;
                }
            }
        }
        
        return answer;
    }
}