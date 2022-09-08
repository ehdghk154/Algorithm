/*
 * 1992 ÄõµåÆ®¸®
 */
import java.io.*;

public class Main {
  static int[][] video;
  static StringBuilder sb = new StringBuilder();
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    video = new int[N][N];
    
    for(int i = 0; i < N; i++) {
      String s = br.readLine();
      for(int j = 0; j < N; j++) {
        video[i][j] = s.charAt(j) - '0';
      }
    }
    
    quadtree(N, 0, 0);
    
    System.out.print(sb);
  }

  public static void quadtree(int N, int depth, int idx) {
    int count = 0;
    for(int i = depth; i < N+depth; i++) {
      for(int j = idx; j < N+idx; j++) {
        count += video[i][j];
      }
    }
    
    if(count == N*N) {
      sb.append("1");
    }
    else if(count == 0) {
      sb.append("0");
    }
    else {
      sb.append("(");
      N /= 2;
      quadtree(N, depth, idx);
      quadtree(N, depth, idx+N);
      quadtree(N, depth+N, idx);
      quadtree(N, depth+N, idx+N);
      sb.append(")");
    }
  }
}