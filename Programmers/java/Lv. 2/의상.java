/**
 * 의상(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/42578
 */

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        // 옷 종류 별로 분류
        for(int i = 0; i < clothes.length; i++) {
            if(map.get(clothes[i][1]) == null) {
                map.put(clothes[i][1], 1);
            }else {
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }
        }
        
        // 종류가 1가지인 경우 (의상A가 a개 있을 경우) = a개 조합
        // 종류가 2가지인 경우 (의상A가 a개, 의상B가 b개) = a + b + ab
        // 종류가 3가지인 경우 (의상A가 a개, 의상B가 b개, 의상C가 c개)
        // = a + b + c + ab + ac + bc + abc
        // 정리하면,
        // 종류 1개 = (a+1)-1 = a+1-1
        // 종류 2개 = (a+1)(b+1)-1 = ab+a+b+1-1
        // 종류 3개 = (a+1)(b+1)(c+1)-1 = abc+ab+ac+bc+a+b+c+1-1
        // ... 
        // 따라서, 코드는 아래와 같음
        // 상세한 정리는 https://aram-su.tistory.com/22 블로그 참고
        int mul = 1;
        for(String key : map.keySet()) {
        	mul *= map.get(key) + 1;
        }
        answer = mul - 1;
        
        return answer;
    }
}