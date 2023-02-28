public class Solution {
  public int[] solution(String[] keymap, String[] targets) {
      int[] answer = new int[targets.length];
      
      for(int i = 0; i < targets.length; i++) {
        int sum = 0;
        
        for(char c : targets[i].toCharArray()) {
          int min = Integer.MAX_VALUE;
          int checked = 0;
          
          for(int j = 0; j < keymap.length; j++) {
            int n = keymap[j].indexOf(String.valueOf(c));
            if(n == -1) {
              checked++;
            } else {
              min = n+1 < min ? n+1 : min;
            }
          }
          
          if(checked == keymap.length) {
            sum = -1;
            break;
          } else {
            sum += min;
          }
        }
        
        answer[i] = sum;
      }
      return answer;
  }
}