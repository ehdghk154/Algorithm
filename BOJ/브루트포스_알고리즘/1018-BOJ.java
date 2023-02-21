/*
 * 1018 체스판 다시 칠하기
 */
import java.io.*;
import java.util.*;

public class Main {
  private static char[][] board;
  private static int ans = 64;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    
    board = new char[N][M]; /*
                             * char로 직접 하나씩 받아서 했지만
                             * boolean으로 true false 이용하여 할 수 있음
                             */
    
    for(int i=0; i<N; i++) {
      String line = br.readLine();
      for(int j=0; j<M; j++) {
        board[i][j] = line.charAt(j);
      }
    }
    
    for(int i=0; i<=N-8; i++) {
      for(int j=0; j<=M-8; j++) {
        color_Count(i, j);
      }
    }
    System.out.println(ans);
  }

  private static void color_Count(int y, int x) {
    char start = board[y][x]; // 시작 지점 첫 번째 색
    int count = 0;
    for(int i=y; i<y+8; i++) {
      for(int j=x; j<x+8; j++) {
        // 지정된 체스판 색상과 다르면 카운트
        if(start != board[i][j])
          count++;
        
        //다음 칸의 색상으로 변경
        if(start == 'W')
          start ='B';
        else
          start ='W';
      }
      //아래 칸의 첫 번째 색상으로 변경
      if(start == 'W')
        start ='B';
      else
        start ='W';
    }
    
    /* 
     * 첫 번째가 W 기준일 때 색칠할 갯수와
     * 반대 색인 B 기준일 때 색칠할 갯수 중 최소값
     */
    count = Math.min(count, 64-count);
    
    /*
     * 이전 색칠할 갯수 최소값과 현재 최소값을 비교하여 작으면 갱신
     */
    ans = Math.min(ans, count);
  }
}
