class Solution {
    public int solution(String s) {
        int answer = 0;
        int x = 0;
        int notX = 0;
        char _x = ' ';
        int i = 0;
        while(i < s.length()) {
          if(i == 0) {
            _x = s.charAt(0);
            i++;
            x++;
            continue;
          }
          if(_x == s.charAt(i)) {
            x++;
          }else {
            notX++;
          }

          i++;

          if(x == notX) {
            s = s.substring(x+notX, s.length());
            answer++;
            i = 0;
            x = 0;
            notX = 0;
          }
        }
        
        // 글자가 남을 경우
        if(x != 0) answer++;
        
        // 글자가 모두 같을 경우
        if(answer == 0) answer = 1;

        return answer;
    }
}