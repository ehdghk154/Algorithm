/**
 * 2583 영역 구하기
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
  static int M, N, aCount, eCount;
  static int[][] paper; // 모눈종이
  static boolean[][] visited; // 방문 여부
  static int[] dx = {0, 0, -1, 1}; // 상하좌우
  static int[] dy = {-1, 1, 0, 0};
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    M = Integer.parseInt(st.nextToken());
    N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken()); // 모눈종이 위의 직사각형 개수
    paper = new int[M][N];
    visited = new boolean[M][N];
    
    for(int i = 0; i < K; i++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
      
      drawSquare(x1, y1, x2, y2);
    }
    aCount = 0;
    eCount = 1;
    ArrayList<Integer> area = new ArrayList<>();
    for(int i = 0; i < M; i++) {
      for(int j = 0; j < N; j++) {
        if(!visited[i][j]) {
          dfs(i, j);
          aCount++;
          area.add(eCount);
          eCount = 1;
        }
      }
    }
    Collections.sort(area);
    
    sb.append(aCount).append('\n');
    for(int i = 0; i < aCount; i++) {
      sb.append(area.get(i)).append(" ");
    }
    
    System.out.println(sb);
  }
  
  private static void dfs(int y, int x) {
    visited[y][x] = true;
    
    for(int i = 0; i < 4; i++) {
      int ny = y + dy[i];
      int nx = x + dx[i];
      if(ny >= 0 && ny < M && nx >= 0 && nx < N) {
        if(!visited[ny][nx]) {
          dfs(ny, nx);
          eCount++;
        }
      }
    }
  }
  private static void drawSquare(int x1, int y1, int x2, int y2) {
    for(int i = y1; i < y2; i++) {
      for(int j = x1; j < x2; j++) {
        visited[i][j] = true;
      }
    }
  }
}