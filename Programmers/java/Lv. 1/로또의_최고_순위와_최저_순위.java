/**
 * 로또의 최고 순위와 최저 순위 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/77484
 */

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int maxRank = 0;
        int minRank = 0;
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                maxRank++;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    minRank++;
                    maxRank++;
                }
            }
        }
        answer[0] = rank[maxRank];
        answer[1] = rank[minRank];
        
        return answer;
    }
}