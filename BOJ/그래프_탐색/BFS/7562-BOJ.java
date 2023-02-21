/*
 * 7562 ����Ʈ�� �̵�
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
  static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1}; // ����Ʈ �̵� ������ ���
  static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2}; 
  static int L;
  static boolean[][] visited; // ĭ�� �湮 ����
  static point s, e;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int T = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽� ����
    for(int i = 0; i < T; i++) {
      L = Integer.parseInt(br.readLine()); // ü������ ũ�� L x L
      
      st = new StringTokenizer(br.readLine());
      s = new point(Integer.parseInt(st.nextToken()), 
          Integer.parseInt(st.nextToken()), 0); // ������
      
      st = new StringTokenizer(br.readLine());
      e = new point(Integer.parseInt(st.nextToken()), 
          Integer.parseInt(st.nextToken()), 0); // ������
      
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
        int nx = p.x + dx[i]; // ����Ʈ �̵� ���
        int ny = p.y + dy[i];
        if(nx >= 0 && ny >= 0 && nx < L && ny < L) {
          if(!visited[ny][nx]) { // �湮���� �ʾ�����
            q.add(new point(nx, ny, p.count+1)); // ť�� �߰��ϰ� count + 1
            visited[ny][nx] = true; // �湮 üũ
          }
        }
      }
    }
  }
}