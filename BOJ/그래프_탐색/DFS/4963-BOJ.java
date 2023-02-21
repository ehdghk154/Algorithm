/*
 * 4963 섬의 개수
 */
import java.io.*;
import java.util.*;

public class Main {
  static int[] dx = {0, 0, -1, 1, -1, 1, -1, 1}; // 상,하,좌,우,좌상,우하,좌하,우상
  static int[] dy = {-1, 1, 0, 0, -1, 1, 1, -1};
  static int w, h;
  static int[][] world;
  static boolean[][] checked;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    while(true) {
      st = new StringTokenizer(br.readLine());
      w = Integer.parseInt(st.nextToken());
      h = Integer.parseInt(st.nextToken());
      
      if(w == 0 && h == 0) break;
      
      world = new int[h][w];
      checked = new boolean[h][w];
      int count = 0;
      
      for(int i = 0; i < h; i++) {
        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < w; j++) {
          world[i][j] = Integer.parseInt(st.nextToken());
        }
      }
      
      for(int i = 0; i < h; i++) {
        for(int j = 0; j < w; j++) {
          if(!checked[i][j] && world[i][j] == 1){
            count++;
            dfs(i, j);
          }
        }
      }
      
      System.out.println(count);
    }
    
  }
  
  public static void dfs(int x, int y) {
    if(!checked[x][y]) {
      checked[x][y] = true;
      
      for(int i = 0; i < 8; i++) {
        int nx = x + dx[i];
        int ny=  y + dy[i];
        if(nx >= 0 && ny >= 0 && nx < h && ny < w) {
          if(world[nx][ny] == 1)
            dfs(nx, ny);
        }
      }
      
    }
  }
}
