import java.io.*;
import java.util.StringTokenizer;
/*
 * 1012 유기농 배추
 */
public class Main {
  static int[] nx = {0, 0, -1, 1};//상하
  static int[] ny = {-1, 1, 0, 0};//좌우
  static int[][] location;
  static boolean[][] checked;
  static int M, N;
  
  private static void dfs(int x, int y) {
    checked[x][y] = true;
    
    for(int i=0; i<4; i++) {
      int dx = x + nx[i];
      int dy = y + ny[i];
      
      if(dx >= 0 && dy >= 0 && dx < M && dy < N) {
        if(location[dx][dy] == 1 && !checked[dx][dy]) {
          dfs(dx, dy);
        }
        
        checked[dx][dy] = true;
      }
    }
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    
    for(int i=0; i<T; i++) {
      int count = 0;
      st = new StringTokenizer(br.readLine());
      M = Integer.parseInt(st.nextToken());
      N = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());
      location = new int[M][N];
      checked = new boolean[M][N];
      
      for(int j=0; j<K; j++) {
        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        location[X][Y] = 1;
      }
      
      for(int j=0; j<M; j++) {
        
        for(int k=0; k<N; k++) {
          
          if(location[j][k]==1 && !checked[j][k]) {
            dfs(j, k);
            count++;
          }  
        }
      }
      
      sb.append(count).append("\n");
    }
    
    System.out.println(sb);
  }
}
