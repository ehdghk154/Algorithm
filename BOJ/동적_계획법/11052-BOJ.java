/*
 * 11052 카드 구매하기
 */
import java.io.*;
import java.util.*;

public class Main {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] P = new int[N+1];
    int[] dp = new int[N+1];
    
    for(int i = 1; i <= N; i++) {
      P[i] = Integer.parseInt(st.nextToken());
    }
    /*
     * 카드팩을 구매할 때, i개의 카드를 구매하는 방법은
     * 1개가 들어있는 카드팩을 구매 후, i-1개의 카드팩을 구매
     * 2개가 들어있는 카드팩을 구매 후, i-2개의 카드팩을 구매
     * ...
     * j개가 들어있는 카드팩은 P[j]이고, i-j개의 카드팩을 최대비용으로 구매하는 방법을 dp[i-j]이라고 하면
     * i == 1 일 때, j -> 1 까지 중 최대비용,
     * i == 2 일 때, j -> 2 까지 중 최대비용,
     * ...
     * i == N 일 때, j -> N 까지 중 최대비용을 선택해야하므로,
     * dp[i] = Max(dp[i], P[j] + dp[i-j])
     * 위 식이 점화식이 된다.
     * */
    for(int i = 1; i <= N; i++) {
      for(int j = 1; j <= i; j++) {
        dp[i] = Math.max(dp[i], P[j] + dp[i-j]);
      }
    }
    
    System.out.print(dp[N]);
  }
}
