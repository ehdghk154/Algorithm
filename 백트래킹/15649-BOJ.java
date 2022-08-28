/*
 * 15649 N과 M (1)
 */
import java.io.*;
import java.util.*;

public class Main {
  private static int[] arr;
  private static boolean[] visited;
  private static int N, M;
  static StringBuilder sb;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    
    arr = new int[M];
    visited = new boolean[N];
    
    bt(0);
    
    System.out.println(sb);
  }
  private static void bt(int depth) {
    if(depth == M) {
      
      for(int num : arr)
        sb.append(num).append(" ");
      sb.append("\n");
      return;
    }
    for(int i=0; i<N; i++) {
      
      if(!visited[i]) {
        visited[i] = true;
        arr[depth] = i+1;
        bt(depth+1);
        visited[i] = false;
      }
    }
  }
}
