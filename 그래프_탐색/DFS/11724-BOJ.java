/*
 * 11724 연결 요소의 개수
 */
import java.io.*;
import java.util.*;

public class Main {
  static int[][] line;
  static boolean[] checked;
  static int N;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    line = new int[N+1][N+1];
    checked = new boolean[N+1];
    int count = 0;
    
    for(int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      line[u][v]++;
      line[v][u]++;
    }
    
    for(int i=1; i<=N; i++) {
      if(!checked[i]) {
        dfs(i);
        count++;
      }
      
    }
    
    System.out.println(count);
  }
  
  public static void dfs(int s) {
    checked[s] = true;
    for(int i = 1; i <= N; i++) {
      if(line[s][i] == 1 && !checked[i]) {
        dfs(i);
      }
    }
  }
}
