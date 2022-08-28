/*
 * 11050 이항 계수 1
 */
import java.io.*;
import java.util.*;
// 다이나믹 프로그래밍으로 구현
public class Main {
  public static int[][] dp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    dp = new int[n+1][k+1];
    
    // n k = n-1 k-1 + n-1 k
    System.out.print(comb(n, k));
  }
  
  public static int comb(int n, int r) {
    if(dp[n][r] > 0)
      return dp[n][r];
    
    if(n == r || r == 0)
      return dp[n][r] = 1;
    
    return dp[n][r] = comb(n-1, r-1) + comb(n-1, r);
  }
}
