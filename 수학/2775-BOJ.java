/*
 * 2775 부녀회장이 될테야
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    int[][] apart = new int[15][15]; // [0 ~ 14][1~14]
    StringBuilder sb = new StringBuilder();
    // 1층 3호 = 0층 1호 + 0층 2호 + 0층 3호
    // 1호는 모두 1명
    // apart[1][3] = apart[0][1] + apart[0][2] + apart[0][3]
    // apart[k][n] = apart[k-1][1] + apart[k-1][2] + ... + apart[k-1][n]
    for(int i=0; i<15; i++) {
      apart[i][1] = 1;
      apart[0][i] = i;
    }
    for(int i=1; i<15; i++) {
      for(int j=2; j<15; j++) {
        // apart[i][j-1] = apart[i-1]에서 1부터 (j-1)까지 모두 더한 값
        apart[i][j] = apart[i][j-1] + apart[i-1][j];
      }
    }
    for(int i=0; i<T; i++) {
      int k = Integer.parseInt(br.readLine()); // 층
      int n = Integer.parseInt(br.readLine()); // 호
      sb.append(apart[k][n]).append('\n');
    }
    System.out.println(sb);
  }
}
