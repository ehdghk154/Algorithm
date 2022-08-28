/*
 * 1932 정수 삼각형
 */
import java.io.*;
import java.util.*;

public class Main {
  private static int[][] nums;
  private static Integer[][] dp;
  private static int N;
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    nums = new int[N][];
    dp = new Integer[N][];
    StringTokenizer st;
    
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      nums[i] = new int[i+1];
      dp[i] = new Integer[i+1];
      for(int j=0; j<i+1; j++) {
        nums[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    for(int i=0; i<N; i++) {
      dp[N-1][i] = nums[N-1][i];
    }
    
    System.out.println(DP(0, 0));
  }
  private static int DP(int depth, int idx) {
    if(depth == N-1)
      return dp[depth][idx];
    
    if(dp[depth][idx] == null) {
      dp[depth][idx] = Math.max(DP(depth+1, idx), DP(depth+1, idx+1)) + nums[depth][idx];
    }
    return dp[depth][idx];
  }
}
