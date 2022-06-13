/*
 * 11053 가장 긴 증가하는 부분 수열
 */
import java.io.*;
import java.util.*;

public class Main {
  private static int[] nums, dp;
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    nums = new int[N];
    dp = new int[N];
    for(int i=0; i<N; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }
    
    int max = 0;
    for(int i=0; i<N; i++) {
      LIS(i);
      max = Math.max(dp[i], max);
    }
    
    System.out.println(max);
  }
  
  static int LIS(int N) {
    if(dp[N] == 0) {
      dp[N] = 1;
      
      for(int i=N-1; i>=0; i--) {
        if(nums[i] < nums[N])
          dp[N] = Math.max(dp[N],  LIS(i) + 1);
      }
    }
    return dp[N];
  }
}
