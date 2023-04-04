/**
 * 햄버거 만들기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/133502
 */

class Solution {
	public int solution(int[] ingredient) {
        int answer = 0;
        int[] ingre = new int[ingredient.length];
        int idx = 0;
        for(int i : ingredient) {
            ingre[idx++] = i;
            if(idx > 3 && ingre[idx-1] == 1 && ingre[idx-2] == 3 && ingre[idx-3] == 2 && ingre[idx-4] == 1) {
                idx -= 4;
                answer++;
            }
        }

        return answer;
    }
}