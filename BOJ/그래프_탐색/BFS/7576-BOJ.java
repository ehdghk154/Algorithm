import java.io.*;
import java.util.*;

/*
 * 7576 토마토
 */
class pos {
  int x;
  int y;
  pos(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class Main {
  private static int[][] tomatoBox;
  private static int M, N;
  private static Queue<pos> q;
  private static int[] dx = { -1, 1, 0, 0 }; //상하
  private static int[] dy = { 0, 0, -1, 1 }; //좌우
  
  private static int bfs() {
    while(!q.isEmpty()) {
      pos p = q.poll();
      
      int x = p.x; // 세로
      int y = p.y; // 가로
      for(int i=0; i<4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if(nx>=0 && ny>=0 && N>nx && M>ny) {
          if(tomatoBox[nx][ny] == 0) {
            q.add(new pos(nx, ny));
            tomatoBox[nx][ny] = tomatoBox[x][y] + 1;
          }
        }
      }
    }
    int result = 0;
    for(int i=0; i<N; i++) {
      for(int j=0; j<M; j++) {
        if(tomatoBox[i][j] == 0)
          return -1;
        result = Math.max(result, tomatoBox[i][j]);
      }
    }
    if(result == 1)
      return 0;
    return result-1;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    M = Integer.parseInt(st.nextToken()); // 가로
    N = Integer.parseInt(st.nextToken()); // 세로
    tomatoBox = new int[N][M];
    q = new LinkedList<pos>();
    
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      
      for(int j=0; j<M; j++) {
        tomatoBox[i][j] = Integer.parseInt(st.nextToken());
        
        if(tomatoBox[i][j] == 1)
          q.add(new pos(i, j));
      }
    }
    
    System.out.println(bfs());
  }
}
