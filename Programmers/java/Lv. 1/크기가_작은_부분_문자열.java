class Solution {
  public int solution(String t, String p) {
    int answer = 0;
    int max = t.length() - (p.length() - 1); // t에서 길이가 같은 부분 문자열 총 개수
    
    for(int i = 0; i < max; i++) {
      if(t.substring(i, i+p.length()).compareTo(p) <= 0) {
        answer++;
      }
    }
    return answer;
  }
}