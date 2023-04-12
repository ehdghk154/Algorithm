import java.util.HashMap;
import java.util.Map;

/**
 * 달리기 경주 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/178871
 */

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for(int i = 0; i < callings.length; i++) {
            players[map.get(callings[i])] = players[map.get(callings[i])-1]; // 앞에 있던 선수 뒤로(순위 +1)
            players[map.get(callings[i])-1] = callings[i]; // 불린 선수 앞으로(순위 -1)
            map.put(players[map.get(callings[i])], map.get(players[map.get(callings[i])])+1);
            map.put(players[map.get(callings[i])-1], map.get(players[map.get(callings[i])-1])-1);
        }

        return players;
    }
}