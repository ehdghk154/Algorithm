 * 11659 구간 합 구하기 4
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(st.nextToken()); // 주어지는 수의 개수
    int M = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수
    int[] sum = new int[N+1];
    st = new StringTokenizer(br.readLine());
    
    for(int i = 1; i <= N; i++) {
      int num = Integer.parseInt(st.nextToken());
      sum[i] += num + sum[i-1];
    }
    
    for(int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());;
      int e = Integer.parseInt(st.nextToken());;
      
      sb.append(sum[e] - sum[s-1]).append("\n");
    }
    
    System.out.print(sb);
  }
}