/**
 * 택배상자(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/131704
 */

import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> subCon = new Stack<>(); // 보조 컨테이너
        int curBox = 1; // 컨테이너 벨트 위에 있는 현재 상자
        for(int i = 0; i < order.length; i++) {
        	int box = order[i]; // 실어야하는 택배 상자
        	
        	// 보조 컨테이너에 보관된 상자가 있다면
        	if(!subCon.isEmpty()) {
        		// 실어야하는 상자보다 택배 번호가 크면 종료
        		if(subCon.peek().intValue() > box) {
        			break;
        		}
        		// 실어야하는 택배 상자가 보조 컨테이너에 있으면 트럭으로 이동
        		if(subCon.peek().intValue() == box) {
        			answer++;
        			subCon.pop();
        			continue;
        		}
        	// 컨테이너의 택배 번호가 실어야하는 택배 번호보다 크면 종료
        	}else if(curBox > box) {
        		break;
        	}
        	// 실어야 하는 택배 번호가 나올 때까지 or 컨테이너에 택배가 빌 때까지 반복
        	while(curBox <= order.length) {
        		// 실어야 하는 택배라면 트럭으로 이동 및 반복 종료
        		if(curBox == box) {
        			answer++;
        			curBox++;
        			break;
        		// 아니라면 보조 컨테이너로 옮기기
        		}else {
        			subCon.push(curBox);
        			curBox++;
        		}
        	}
        }
        
        return answer;
    }
}