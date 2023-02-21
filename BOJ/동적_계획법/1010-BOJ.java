/*
 * 1010 다리 놓기
 */
import java.io.*;
import java.util.*;

public class Main {
  static int[][] dp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    dp = new int[30][30];
    
    for(int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      
      
      sb.append(comb(m, n)).append('\n');
    }
    
    System.out.print(sb);
  }
  
  public static int comb(int n, int r) {
    if(dp[n][r] > 0) // 이미 계산된 값은 바로 리턴
      return dp[n][r];
    
    if(n == r || r == 0) // n과 r이 같거나 재귀 중 r이 0까지 내려가면 리턴
      return dp[n][r] = 1;
    
    // nCr=(n-1)C(r-1)+(n-1)Cr -> 파스칼의 삼각형
    return dp[n][r] = comb(n-1, r-1) + comb(n-1, r);
  }
}
