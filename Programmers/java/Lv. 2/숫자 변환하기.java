/**
 * 숫자 변환하기(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/154538
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = -1;
        // 먼저 나온 숫자 재연산 방지
        HashSet<Integer> set = new HashSet<>();
        // 숫자와 연산 횟수 저장
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x, 0});
        
        while(!q.isEmpty()) {
        	int[] temp = q.poll();
        	int num = temp[0];
        	int count = temp[1];
        	
        	// 숫자가 y보다 크거나 이미 나온 숫자라면 연산X
        	if(num > y) continue;
        	if(set.contains(num)) continue;
        	set.add(num); // 처음 나온 숫자 입력
        	
        	// 숫자가 y와 같아지면 중지
        	if(num == y) {
        		answer = count;
        		break;
        	}
        	
        	// 3가지 연산 큐에 입력
        	q.add(new int[] {num+n, count+1});
        	q.add(new int[] {num*2, count+1});
        	q.add(new int[] {num*3, count+1});
        }
        
        return answer;
    }
}