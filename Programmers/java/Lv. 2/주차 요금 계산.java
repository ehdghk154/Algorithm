/**
 * 주차 요금 계산(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/92341
 */

import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> map = new HashMap<>(); // 자동차 별 총 입출시간 기록
        HashSet<String> set = new HashSet<>(); // 차 번호 저장
        
        // 자동차 번호순으로 정렬(오름차순)
        Arrays.sort(records, new Comparator<>() {
        	@Override
        	public int compare(String o1, String o2) {
        		String s1 = o1.substring(6, 10);
        		String s2 = o2.substring(6, 10);
        		return Integer.parseInt(s1)
        				- Integer.parseInt(s2);
        	};
        });
        int total = 0; // 입출 시간 계산
        boolean flag = false; // 입출 여부 판단
        String prevCar = ""; // 입차만 있을 경우를 위한 이전 차 번호 저장
        
        /**
         * records 길이만큼 반복하며 입/출차 내역에 따라 시간/비용 계산
         */
        for(int i = 0; i < records.length; i++) {
        	String history = records[i].substring(11); // 내역
        	String carNumber = records[i].substring(6, 10); // 차 번호
        	set.add(carNumber);
        	String[] HM = records[i].substring(0, 5).split(":");
        	int time = Integer.parseInt(HM[0])*60
        				+ Integer.parseInt(HM[1]);
        	
        	if(history.equals("IN")) { // 입차
        		// 이전 차가 입차 기록만 있을 경우
        		if(flag) {
            		total += 1439; // 23:59 출차로 기록
            		
        			if(map.get(prevCar) != null) // 이전 입출 기록이 있다면
            			total += map.get(prevCar);
        			
        			map.put(prevCar, total); // 시간 기록
        			total = 0;
            	}
        		total -= time; // -입차 시간 + 출차 시간 = 주차 시간
        		flag = true; // 입차 체크
        	}else { // 출차
        		total += time; // -입차 시간 + 출차 시간 = 주차 시간
        		if(map.get(carNumber) != null)
        			total += map.get(carNumber);
        		map.put(carNumber, total);
    			total = 0; // 차가 나갔으므로 주차 시간 초기화
    			flag = false; // 출차 체크
        	}
        	prevCar = carNumber; // 이전 차 번호 저장
        }
        
        // 마지막 기록이 입차 기록만 있을 경우 계산
        if(flag) {
        	String carNumber = records[records.length-1].substring(6, 10);
        	total += 1439;
        	
        	if(map.get(carNumber) != null)
    			total += map.get(carNumber);
        	
			map.put(carNumber, total);
        }
        
        // 차 번호 오름차순 정렬
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        // 총 주차 시간으로 주차 요금 계산
        for(int i = 0; i < list.size(); i++) {
        	int totalFee = 0;
        	int time = map.get(list.get(i));
        	
        	// 기본 시간/요금
        	time -= fees[0]; 
        	totalFee += fees[1];
        	
        	// 초과 시간이 있다면
        	if(time > 0) {
        		// 초과 시간이 단위 시간으로 나누어 떨어지지 않는 경우 올림
        		if(time%fees[2] != 0)
        			time = time/fees[2] + 1;
        		else
        			time = time/fees[2];
        		
        		// 초과 요금
        		totalFee += time * fees[3];
        	}
        	
        	answer[i] = totalFee;
        }
        
        return answer;
    }
}