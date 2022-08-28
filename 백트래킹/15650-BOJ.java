/*
 * 15650 N과 M (2)
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
    
    bt(0, 0);
    
    System.out.println(sb);
  }
  private static void bt(int depth, int c) {
    if(depth == M) {
      // depth가 M 에 도달하면 출력
      for(int num : arr)
        sb.append(num).append(" ");
      sb.append("\n");
      
      return;
    }
    for(int i=0; i<N; i++) {
      // 수열이 오름차순이어야 하므로
      // c=이전값 / 이전값보다 크면 배열에 입력
      if(!visited[i] && c < i+1) { 
        visited[i] = true;
        arr[depth] = i+1;
        bt(depth+1, i+1);
        visited[i] = false;
      }
    }
  }
}
