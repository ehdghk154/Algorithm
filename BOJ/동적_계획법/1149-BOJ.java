/*
 * 1149 RGB거리
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static int R=0, G=1, B=2;
  private static int[][] price;
  private static int[][] dp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    price = new int[n][3]; // 각 색상 별 가격
    dp = new int[n][3]; // 총 가격
    StringTokenizer st;
    
    for(int i=0; i<n; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j=0; j<3; j++) {
        price[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    //price[1][R] += Math.min(price[0][G], price[0][B])
    //price[1][G] += Math.min(price[0][R], price[0][B])
    //price[1][B] += Math.min(price[0][R], price[0][G])
    // ...
    //price[n-1][R] += Math.min(price[n-2][G], price[n-2][B])
    //price[n-1][G] += Math.min(price[n-2][R], price[n-2][B])
    //price[n-1][B] += Math.min(price[n-2][R], price[n-2][G])
    
    dp[0][R] = price[0][R];
    dp[0][G] = price[0][G];
    dp[0][B] = price[0][B];
    int TotalR = Paint(n-1, R);
    int TotalG = Paint(n-1, G);
    int TotalB = Paint(n-1, B);
    
    System.out.println(Math.min(TotalR, Math.min(TotalG, TotalB)));
  }
  
  private static int Paint(int n, int c) {
    if(dp[n][c] == 0) {
      if(c == R)
        dp[n][R] = Math.min(Paint(n-1, G), Paint(n-1, B)) + price[n][R];
      if(c == G)
        dp[n][G] = Math.min(Paint(n-1, R), Paint(n-1, B)) + price[n][G];
      if(c == B)
        dp[n][B] = Math.min(Paint(n-1, R), Paint(n-1, G)) + price[n][B];
    }
    return dp[n][c];
  }
}
