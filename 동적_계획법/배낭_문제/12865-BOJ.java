/*
 * 12865 평범한 배낭
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[] W = new int[N+1]; // 무게
    int[] V = new int[N+1]; // 가치
    //int[][] dp = new int[N+1][K+1];
    int[] dp = new int[K+1];
    
    for(int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      W[i] = Integer.parseInt(st.nextToken());
      V[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 1; i <= N; i++) {
      for(int j = K; j - W[i] >= 0; j--) {
        dp[j] = Math.max(dp[j], dp[j-W[i]] + V[i]);
      }
    }
    
    /**
    for(int i = 1; i <= N; i++) {
      for(int j = 1; j <= K; j++) {
        
        if(W[i] > j) {
          dp[i][j] = dp[i-1][j];
        }
        else {
          dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-W[i]] + V[i]);
        }
        
      }
    }
    
    System.out.print(dp[N][K]);
    */
    
    System.out.print(dp[K]);
  }
}
