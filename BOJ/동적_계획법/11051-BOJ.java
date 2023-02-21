/**
 * 11051 이항 계수 2
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static int[][] dp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    dp = new int[N+1][K+1];

    int bc = binomial(N, K);
    
    System.out.println(bc);
  }
  
  static int binomial(int n, int r) {
    for(int i = 1; i <= n; i++) {
      // i와 r 중 작은 값까지만 계산. 그 이상으로 할 필요가 없기 때문
      for(int j = 0; j <= Math.min(i, r); j++) {
        if(j == 0 || j == i)
          dp[i][j] = 1;
        else 
          dp[i][j] = dp[i-1][j-1]%10007 + dp[i-1][j]%10007;
      }
    }
    return dp[n][r]%10007;
  }
}