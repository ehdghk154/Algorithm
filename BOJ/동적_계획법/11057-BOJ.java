/*
 * 11057 오르막 수
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] dp = new int[N+1][10];
    
    for(int i = 0; i < 10; i++) {
      dp[1][i] = 1;
    }
    
    for(int i = 0; i <= N; i++) {
      dp[i][0] = 1;
    }
    
    for(int i = 2; i <= N; i++) {
      for(int j = 1; j < 10; j++) {
        dp[i][j] = (dp[i][j-1] + dp[i-1][j])%10007;
      }
    }
    
    int sum = 0;
    for(int i = 0; i < 10; i++) {
      sum += dp[N][i];
    }
    
    System.out.print(sum%10007);
    /**
     * %10007을 두 번 하는 이유
     * dp를 구할 때, 수가 커지면 값이 커져서 제대로 저장되지 않기 때문에
     * 10007로 나눈 나머지를 저장하고
     * 출력 또한 10007로 나눈 나머지가 나와야 하므로 총 개수에 나머지 연산을 해줌
     */
  }
}