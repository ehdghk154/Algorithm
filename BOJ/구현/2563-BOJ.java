/**
 * 2563 색종이
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static boolean[][] whitePaper = new boolean[100][100]; // 도화지
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numPaper = Integer.parseInt(br.readLine()); // 색종이 개수
    
    int area = 0; // 검은 색 종이 넓이
    for(int i = 0; i < numPaper; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int y = Integer.parseInt(st.nextToken());
      int x = Integer.parseInt(st.nextToken());
      
      attach(x, y);
    }
    
    for(int i = 0; i < 100; i++) {
      for(int j = 0; j < 100; j++) {
        if(whitePaper[i][j]) {
          area++;
        }
      }
    }
    System.out.println(area);
    
  }
  
  static void attach(int x, int y) {
    for(int i = x; i < x+10; i++) {
      for(int j = y; j < y+10; j++) {
        whitePaper[i][j] = true;
      }
    }
  }
}