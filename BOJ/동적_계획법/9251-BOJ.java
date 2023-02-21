/*
 * 9251 LCS
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] S1 = br.readLine().toCharArray();
    char[] S2 = br.readLine().toCharArray();
    int[][] dp = new int[S1.length + 1][S2.length + 1];
    
    for(int i = 1; i <= S1.length; i++) {
      for(int j = 1; j <= S2.length; j++) {
        
        if(S1[i-1] == S2[j-1]) {
          dp[i][j] = dp[i-1][j-1] + 1;
        }
        
        else {
          dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
      }
    }
    
    System.out.print(dp[S1.length][S2.length]);
  }
}