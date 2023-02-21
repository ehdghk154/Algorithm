/*
 * 2293 동전
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 동전의 종류
    int k = Integer.parseInt(st.nextToken()); // 구해야하는 동전의 합
    int[] dp = new int[k+1];
    int[] coins = new int[n];
    
    for(int i = 0; i < n; i++) {
      coins[i] = Integer.parseInt(br.readLine());
    }
    
    dp[0] = 1; // 합이 0인 경우의 수는 1가지
    
    for(int i = 0; i < n; i++) { // coins[i]값의 동전까지 사용하여 만들 수 있는 경우의 수 
      for(int j = 1; j <= k; j++) {
        if(coins[i] <= j) {
          dp[j] += dp[j-coins[i]];
        }
      }
    }
    
    System.out.print(dp[k]);
  }
}
/**
 * 동전이 1, 2, 5원 동전이 있을 경우
 * 1원으로만 만들 수 있는 경우의 수는
 * 0원 = 1가지, 1원 = 1가지, 2원 = 1가지, ..., 10원 = 1가지 
 * 
 * 2원이 추가되었을 경우의 수는
 * 0원 = 1가지, 1원 = 1가지, 2원 = 2가지, 3원 = 2가지, 4원 = 3가지, ..., 10원 = ...
 * 
 * 규칙을 보면 2원이 추가되었을 경우의 수는
 * 1원의 경우의 수에 2원이 적어도 1개가 사용되는 경우의 수를 합한 값이므로
 * 
 * 2원이 추가된 경우의 수에서 보면
 * 2원 = 2가지 -> 1+1 과 (0)+2 이다.
 * 1원으로만 만들 수 있는 경우의 수인 2원 = 1가지와
 * 괄호와 같이 0원을 만드는 경우의 수인 0원 = 1가지의 각 경우에 2원을 더한 것이다.
 * DP[2] = DP[2] + DP[0] = 1가지 + 1가지 = 2가지
 * 
 * 3원을 만드는 경우의 수도 보면
 * 3원 = 2가지 -> 1+1+1 과 (1)+2 이다.
 * 1원으로만 만들 수 있는 경우의 수인 3원 = 1가지와
 * 괄호와 같이 1원을 만드는 경우의 수인 1원 = 1가지의 각 경우에 2원을 더한 것이다.
 * DP[3] = DP[3] + DP[1] = 1가지 + 1가지 = 2가지
 * 
 * 4원을 만드는 경우도 보면
 * 4원 = 3가지 -> 1+1+1+1 과 (1+1)+2 와 (0+2)+2 이다.
 * 1원으로만 만들 수 있는 경우의 수인 4원 = 1가지,
 * 괄호와 같이 2원을 만드는 경우의 수인 2원 = 2가지의 각 경우에 2원을 더한 것이다.
 * DP[4] = DP[4] + DP[2] = 1가지 + 2가지 = 3가지
 * DP(n) = DP(n) + DP(n-2)
 * 
 * 5원이 추가된 경우는
 * 5원을 만드는 경우를 보면
 * 5원 = 4가지 -> (1+1+1+1+1), (1+1+1+2), (1+2+2)와 0+5 이다.
 * 위의 괄호는 2원이 추가된 경우에서 구했던 DP[5] = 3가지이고,
 * 5원이 사용된 경우는 0원을 만드는 경우의 수인 0원 = 1가지의 각 경우에 5원을 더한 것이다.
 * DP[5] = DP[5] + DP[0] = 3가지 + 1가지 = 4가지
 * DP(n) = DP(n) + DP(n-5)
 * 
 * 따라서, n원의 경우의 수 = 이전에 구해진 n원의 경우의 수 + 추가된 동전으로 만들 수 있는 경우의 수
 * 식은
 * DP[n] = DP[n] + DP[n-coins[i]]
 * */