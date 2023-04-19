import java.util.HashMap;
import java.util.HashSet;

/**
 * 신고 결과 받기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/92334
 */

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, HashSet<String>> repo = new HashMap<>();
        for(int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], i);
        }
        for(int i = 0; i < report.length; i++) {
            String[] name = report[i].split(" ");
            if(repo.get(name[1]) == null) {
            	repo.put(name[1], new HashSet<String>());
            }
            HashSet<String> set = repo.get(name[1]);
            set.add(name[0]);
            repo.put(name[1], set);
        }
        
        int[] answer = new int[id_list.length];
        
        for(String id : id_list) {
        	if(repo.get(id) != null && repo.get(id).size() >= k) {
        		for(String res : repo.get(id)) {
        			answer[map.get(res)]++;
        		}
        	}
        }
        
        return answer;
    }
}