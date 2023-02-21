/*
 * 14889 스타트와 링크
 */
import java.io.*;
import java.util.*;

public class Main {
  static int T, min = 100;
  static int[][] S;
  static boolean[] visited;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    T = Integer.parseInt(br.readLine());
    S = new int[T][T];
    visited = new boolean[T];
    StringTokenizer st;
    for(int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < T; j++) {
        S[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    ability(0, 0);
    
    System.out.println(min);
  }
  
  public static void ability(int depth, int c) {
    if(c == T/2) {
      diff();
      
      return;
    }
    
    for(int i = depth; i < T; i++) {
      if(!visited[i]) {
        visited[i] = true;
        ability(i+1, c+1);
        visited[i] = false;
      }
    }
  }
  
  public static void diff() {
    int a=0, b=0;
    for(int i = 0; i < T-1; i++) {
      for(int j = i+1; j < T; j++) {
        // 서로 겹치는 선수가 없도록 하기 위함
        if(visited[i] && visited[j])
          a += S[i][j] + S[j][i];
        else if(!visited[i] && !visited[j])
          b += S[i][j] + S[j][i];
      }
    }
    
    int dif = Math.abs(a - b);
    
    if(dif == 0) { // 0일 경우 최소
      System.out.println(dif);
      System.exit(0);
    }
    
    min = Math.min(min, dif);
  }
}
