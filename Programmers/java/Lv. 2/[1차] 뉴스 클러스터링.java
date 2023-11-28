/**
 * [1차] 뉴스 클러스터링(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/17677
 */

import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        float sum = 0; // 합집합
        float equal = 0; // 교집합
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        // 비교를 위해 str1을 나눠 저장
        ArrayList<String> list1 = new ArrayList<>();
        for(int i = 0; i < str1.length()-1; i++) {
        	// 알파벳이 아닌 글자일 경우 저장하지 않음
        	if(65 > str1.charAt(i) || str1.charAt(i) > 90)
        		continue;
        	if(65 > str1.charAt(i+1) || str1.charAt(i+1) > 90)
        		continue;
        	list1.add(str1.substring(i, i+2));
        }
        
        // list1에 있는 str1과 두 글자씩 나눈 str2를 비교
        for(int i = 0; i < str2.length()-1; i++) {
        	// 알파벳이 아닌 경우 비교하지 않음
        	if(65 > str2.charAt(i) || str2.charAt(i) > 90)
        		continue;
        	if(65 > str2.charAt(i+1) || str2.charAt(i+1) > 90)
        		continue;
        	
        	// list1에서 두 글자로 나눈 str2이 제거되면 true, 제거되지 않으면 false
        	if(list1.remove(str2.substring(i, i+2))) {
        		sum++; // 합집합에 1 추가
        		equal++; // 교집합에 1 추가
        	}else {
        		sum++; // false면 합집합에만 1 추가
        	}
        }
        // 합집합이 0이면 두 str 전부
        // 알파벳만 있는 경우가 없다는 것으로 유사도는 1
        if(sum == 0) answer = 65536;
        else {
        	// 제거되지 않은 문자 개수만큼 합집합에 추가
        	sum += list1.size();
            answer = (int)((equal/sum)*65536);
        }
        
        return answer;
    }
}