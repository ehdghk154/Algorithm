/*
 * 14501 퇴사
 */
import java.io.*;
import java.util.*;
// 해당 문제는 브루트포스와 다이나믹 두 가지 알고리즘으로 풀었기 때문에 브루트포스 알고리즘 폴더에도 해당 문제가 있음
// 직접 푼 풀이는 브루트포스 알고리즘 형식으로
// 해당 다이나믹 프로그래밍 형식은 다른 사람의 풀이를 참고하여 풀이했음
public class Main {
  static int[] T, P, dp;
  static int N, max;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    T = new int[N+1];
    P = new int[N+1];
    dp = new int[N+5];
    
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      
      T[i] = Integer.parseInt(st.nextToken());
      P[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 0; i <= N; i++) {
      
      // 현재까지의 총 상담 금액
      dp[i] = Math.max(dp[i], max);
      
      // i+T[i]에 해당하는 날까지 얻을 수 있는 총 상담 금액(dp[i+T[i])과 
      // 현재까지의 누적 금액인 dp[i]와 현재에 해당하는 i에 해당하는 날의 상담 금액인 P[i]를 합한 금액 중 
      // 높은 금액을 i+T[i] 날에 얻을 수 있는 총 상담 금액으로 지정
      dp[i+T[i]] = Math.max(dp[i+T[i]], dp[i] + P[i]);
      
      // (i+1)일에 받을 수 있는 최대 금액
      max = Math.max(max, dp[i]); 
    }
    
    System.out.print(max);
  }
}
