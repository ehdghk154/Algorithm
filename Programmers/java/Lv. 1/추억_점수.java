import java.util.HashMap;

/**
 * 추억 점수 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/176963
 */

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++) {
            int score = 0;
            for(int j = 0; j < photo[i].length; j++) {
                Integer n = map.get(photo[i][j]);
                if(n != null)
                    score += n;
            }
            answer[i] = score;
        }

        return answer;
    }
}