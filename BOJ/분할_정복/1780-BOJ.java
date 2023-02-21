/**
 * 1780 종이의 개수
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static int N;
  static int[] pCount;
  static int[][] paper;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    paper = new int[N][N];
    pCount = new int[3];
    for(int i = 0; i < N; i++) {
      paper[i] = paperLine(br.readLine());
    }
    
    paperCount(0, 0, N);
    
    for(int i = 0; i < 3; i++) {
      System.out.println(pCount[i]);
    }
  }
  
  // 행렬 한 줄 입력
  public static int[] paperLine(String s) {
    StringTokenizer st = new StringTokenizer(s);
    int[] line = new int[N];
    for(int i = 0; i < N; i++) {
      line[i] = Integer.parseInt(st.nextToken());
    }
    return line;
  }
  
  // 분할 정복 및 재귀를 통해 숫자별 종이 개수 카운트
  public static void paperCount(int y, int x, int n) {
    if(n < 1) return;
    
    int flag = paper[y][x]; // 종이 시작 숫자 지정
    for(int i = y; i < n+y; i++) {
      for(int j = x; j < n+x; j++) {
        if(paper[i][j] != flag) {
          int dn = n/3;
          recursion(y, x, dn); // 재귀 함수 실행
          return;
        }
      }
    }
    
    pCount[flag+1]++; // -1, 0, 1 개수 저장
    
  }
  
  // 종이 분할
  public static void recursion(int y, int x, int n) {
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        paperCount(y+n*i, x+n*j, n);
      }
    }
  }
}