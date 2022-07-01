/*
 * 2156 포도주 시식
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    int[] dp = new int[n+1];
    int[] arr = new int[n+1];
    for(int i = 1 ; i <= n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    dp[1] = arr[1];
    if(n >= 2)
      dp[2] = arr[1] + arr[2];
    if(n >= 3)
      dp[3] = Math.max(Math.max(arr[1]+arr[2], arr[1]+arr[3]), arr[2]+arr[3]);
    
    for(int i = 4; i <= n; i++) {
      dp[i] = Math.max(Math.max(arr[i]+arr[i-1]+dp[i-3], arr[i]+dp[i-2]), dp[i-1]);
    }
    
    System.out.print(dp[n]);
  }
}
