/*
 * 11726 2xn 타일링
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
//  1=1, 2=2, 3=3, 4=5, 5=8, 6=13, 7=21, 8=34, 9=55 (dp[n] = dp[n-1] + dp[n-2])
    int[] dp = new int[n+2];
    dp[1] = 1;
    dp[2] = 2;
    for(int i=3; i<=n; i++) {
      /* 
       * 최종값에 나머지를 하지 않는 이유 = n이 커질수록 값이 너무 커져서 오버플로가 일어나기 때문에
       * 값을 구하는 동시에 나머지를 구해서 대입
       */
      dp[i] = (dp[i-1] + dp[i-2])%10007;
    }
    
    System.out.println(dp[n]);
  }
}
