class Solution {
  public int[] solution(String s) {
    int[] answer = new int[s.length()];

    for(int i = 0; i < s.length(); i++) {
      for(int j = i-1, k = 1; j >= 0; j--, k++) {
        if(s.charAt(i) == s.charAt(j)) {
          answer[i] = k;
          break;
        }
      }
      if(answer[i] == 0) answer[i] = -1;
    }

    return answer;
  }
}