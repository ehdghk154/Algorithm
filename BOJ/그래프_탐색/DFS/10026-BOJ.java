/*
 * 10026 적록색약
 */
import java.io.*;
import java.util.*;

public class Main {
  static int[] dx = {0, 0, -1, 1};
  static int[] dy = {-1, 1, 0, 0};
  static boolean[][] visited;
  static char[][] map;
  static int N, noWeak, yesWeak;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    N = Integer.parseInt(br.readLine());
    noWeak = 0;
    visited = new boolean[N][N];
    map = new char[N][N];
    
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      map[i] = st.nextToken().toCharArray();
    }
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        if(!visited[i][j]) {
          noWeak++;
          CW(i, j);
        }
        if(map[i][j] == 'G')
          map[i][j] = 'R';
      }
    }
    
    visited = new boolean[N][N]; // 방문여부 초기화
    
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        if(!visited[i][j]) {
          yesWeak++;
          CW(i, j);
        }
      }
    }
    sb.append(noWeak).append(" ").append(yesWeak);
    System.out.print(sb);
  }

  private static void CW(int y, int x) {
    visited[y][x] = true;
    
    for(int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];
      if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
        if(!visited[ny][nx] && map[ny][nx] == map[y][x])
          CW(ny, nx);
      }
    }
  }
}