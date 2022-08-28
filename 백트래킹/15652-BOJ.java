/*
 * 15652 N과 M (4)
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
      
      for(int num : arr)
        sb.append(num).append(" ");
      sb.append("\n");
      
      return;
    }
    for(int i=0; i<N; i++) {
      // c=이전값 / 이전 값보다 크거나 같으면 배열에 입력
      if(!visited[i] && c <= i) { 
        arr[depth] = i+1;
        bt(depth+1, i);
      }
    }
  }
}
