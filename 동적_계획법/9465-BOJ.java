/*
 * 9465 ��ƼĿ
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    
    StringTokenizer st;
    for(int i = 0; i < T; i++) {
      int n = Integer.parseInt(br.readLine());
      int[][] sticker = new int[2][n+1];
      int[][] dp = new int[2][n+1];
      
      for(int j = 0; j < 2; j++) {
        st = new StringTokenizer(br.readLine());
        
        for(int k = 1; k <= n; k++) {
          sticker[j][k] = Integer.parseInt(st.nextToken());
        }
      }
      
      //dp[x][0] = 0
      dp[0][1] = sticker[0][1];
      dp[1][1] = sticker[1][1];
      
      for(int j = 2; j <= n; j++) {
        dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + sticker[0][j];
        dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + sticker[1][j];
      }
      
      sb.append(Math.max(dp[0][n], dp[1][n])).append("\n");
    }
    
    System.out.print(sb);
  }

}