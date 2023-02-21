/*
 * 7562 나이트의 이동
 */
import java.io.*;
import java.util.*;

class point {
  int x;
  int y;
  int count;
  point(int x, int y, int count){
    this.x = x;
    this.y = y;
    this.count = count;
  }
}

public class Main {
  static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1}; // 나이트 이동 가능한 경로
  static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2}; 
  static int L;
  static boolean[][] visited; // 칸의 방문 여부
  static point s, e;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수
    for(int i = 0; i < T; i++) {
      L = Integer.parseInt(br.readLine()); // 체스판의 크기 L x L
      
      st = new StringTokenizer(br.readLine());
      s = new point(Integer.parseInt(st.nextToken()), 
          Integer.parseInt(st.nextToken()), 0); // 시작점
      
      st = new StringTokenizer(br.readLine());
      e = new point(Integer.parseInt(st.nextToken()), 
          Integer.parseInt(st.nextToken()), 0); // 도착점
      
      visited = new boolean[L][L];
      
      bfs(s);
    }
  }
  private static void bfs(point s) {
    Queue<point> q = new LinkedList<>();
    q.add(s);
    visited[s.y][s.x] = true;

    while(!q.isEmpty()) {
      point p = q.poll();
      
      if(p.y == e.y && p.x == e.x) {
        System.out.println(p.count);
        return;
      }
      
      for(int i = 0; i < 8; i++) {
        int nx = p.x + dx[i]; // 나이트 이동 경로
        int ny = p.y + dy[i];
        if(nx >= 0 && ny >= 0 && nx < L && ny < L) {
          if(!visited[ny][nx]) { // 방문하지 않았으면
            q.add(new point(nx, ny, p.count+1)); // 큐에 추가하고 count + 1
            visited[ny][nx] = true; // 방문 체크
          }
        }
      }
    }
  }
}