/**
 * 모의고사 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/42840
 */

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] people1 = {1, 2, 3, 4, 5};
        int[] people2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] people3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] check = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == people1[i%people1.length]) check[0]++;
            if(answers[i] == people2[i%people2.length]) check[1]++;
            if(answers[i] == people3[i%people3.length]) check[2]++;
        }
        
        int max = Math.max(check[0], Math.max(check[1], check[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(max == check[0]) {
            list.add(1);
        }
        if(max == check[1]) {
            list.add(2);
        }
        if(max == check[2]) {
            list.add(3);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}