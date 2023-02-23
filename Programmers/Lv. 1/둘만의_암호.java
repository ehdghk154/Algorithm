class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String atz = "abcdefghijklmnopqrstuvwxyz";
        for(char c : skip.toCharArray()) {
          atz = atz.replace(String.valueOf(c), "");
        }
        for(char c : s.toCharArray()) {
          if(atz.indexOf(c)+index < atz.length())
            answer += atz.charAt(atz.indexOf(c)+index);
          else {
            int idx = atz.indexOf(c)+index;
            while(idx >= atz.length()) {
              idx -= atz.length();
            }
            answer += atz.charAt(idx);
          }
        }
        return answer;
    }
}