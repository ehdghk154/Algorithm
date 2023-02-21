/*
 * 11727 2xn 타일링 2
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
//  1=1, 2=3, 3=5, 4=11, 5=21, ...(dp[n] = dp[n-1] + 2xdp[n-2])
    int[] dp = new int[n+1];
    dp[1] = 1;
    if(n >= 2)
      dp[2] = 3;
    if(n >= 3)
      dp[3] = 5;
    
    for(int i=4; i<=n; i++) {
      dp[i] = (dp[i-1] + 2*dp[i-2])%10007;
    }
    
    System.out.println(dp[n]);
  }
}
