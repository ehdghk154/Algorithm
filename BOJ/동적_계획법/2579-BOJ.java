/*
 * 2579 계단 오르기
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int[] st;
  static int[] dp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    st = new int[n+1];
    dp = new int[n+1];
    for(int i=1; i<=n; i++) {
      st[i] = Integer.parseInt(br.readLine());
    }

    dp[1] = st[1];
    
    if(n >= 2)
      dp[2] = st[1] + st[2];
    
    System.out.println(DP(n));
  }
  
  public static int DP(int n) {
    if(dp[n] == 0 && n != 0) {
      dp[n] = Math.max(DP(n-2), DP(n-3) + st[n-1]) + st[n];
    }
    return dp[n];
  }
}
