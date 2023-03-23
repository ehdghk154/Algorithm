import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
  public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
      ArrayList<Integer> answer = new ArrayList<>();
      Map<String, Integer> tMap = new HashMap<>();
      int t = getDate(today);
      
      for(String s : terms) {
        String[] term = s.split(" ");
        tMap.put(term[0], Integer.parseInt(term[1]));
      }
      for(int i = 0; i < privacies.length; i++) {
        String[] privacy = privacies[i].split(" ");
        
        if(getDate(privacy[0]) + (tMap.get(privacy[1]) * 28) <= t) {
          answer.add(i+1);
        }
      }
      
      return answer;
  }

  private int getDate(String today) {
    String[] date = today.split("\\.");
    int y = Integer.parseInt(date[0]); // 년
    int m = Integer.parseInt(date[1]); // 월
    int d = Integer.parseInt(date[2]); // 일
    return (y*12*28)+(m*28)+d;
  }
}