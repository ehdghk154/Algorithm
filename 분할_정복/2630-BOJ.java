/**
 * 2630 색종이 만들기
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static int[][] arr;
  static int blueCnt, whiteCnt;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());
    arr = new int[N][N];
    blueCnt = 0;
    whiteCnt = 0;
    
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    paper(0, 0, N);
    
    System.out.println(whiteCnt);
    System.out.println(blueCnt);
  }
  
  public static void paper(int y, int x, int n) {
    if(n < 1) return;
    
    int flag = arr[y][x]; // 1(blue) 또는 0(white)
    for(int i = y; i < n+y; i++) {
      for(int j = x; j < n+x; j++) {
        if(arr[i][j] != flag) { // flag와 같은 숫자가 아니면 종이 분할
          int nn = n/2;
          paper(y, x, nn);
          paper(y, x+nn, nn);
          paper(y+nn, x, nn);
          paper(y+nn, x+nn, nn);
          return;
        }
      }
    }
    // flag와 arr의 숫자가 모두 같을 경우
    if(flag == 1)
      blueCnt++;
    else
      whiteCnt++;
  }
}