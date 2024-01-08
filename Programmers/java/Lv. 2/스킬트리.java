/**
 * 스킬트리(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/49993
 */

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int[] sequence = new int[skill.length()];
        
        for(int i = 0; i < skill_trees.length; i++) {
        	// 스킬트리의 스킬 순서가 맞는지 확인하기 위해 스킬 순서대로 인덱스 저장
            for(int j = 0; j < skill.length(); j++) {
                sequence[j] = skill_trees[i].indexOf(skill.substring(j, j+1));
            }
            
            boolean flag = false; // 스킬 트리에 스킬이 있는지 판단
            boolean success = true; // 스킬 순서에 맞게 트리가 작성 되었는지 판단
            
            // 스킬 순서에 있는 스킬을 배우지 않았다면 -1로 저장되어 있음
            // 순서에 있는 스킬을 배우지 않았다면 그 이후의 스킬을 배우지 못함
            if(sequence[0] == -1) flag = true;
            for(int j = 1; j < sequence.length; j++) {
                if(sequence[j] == -1) {
                    flag = true;
                    continue;
                }
                // 선행 스킬을 배우지 않았는데 다음 스킬이 트리에 있거나
                // 스킬 트리에 선행 스킬보다 먼저 배우는 스킬이 있다면
                if(flag && sequence[j] >= 0 || sequence[j-1] > sequence[j]) {
                    success = false;
                    break;
                }
            }

            // 스킬 트리가 올바르다면(success = true) answer 1 증가
            if(success) answer++;
        }
        
        
        return answer;
    }
}