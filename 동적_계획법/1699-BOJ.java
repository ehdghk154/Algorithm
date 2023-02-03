/**
 * 1699 제곱수의 합
 */
import java.io.*;

public class Main {
  static int min = Integer.MAX_VALUE;
  static int[] dp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    dp = new int[N+1];
    
    // N까지의 모든 제곱수 1로 초기화
    for(int i = 1; i*i <= N; i++) {
      dp[i*i] = 1;
    }
    
    System.out.println(DP(N));
  }
  
  static int DP(int N) {
    if(dp[N] == 0) {
      dp[N] = min;
      for(int i = (int)Math.sqrt(N); i >= 0; i--) {
        int pow = (int)Math.pow(i, 2);
        dp[N] = Math.min(DP(N-pow)+1, dp[N]);
      }
    }
    return dp[N];
  }
}