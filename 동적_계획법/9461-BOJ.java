/*
 * 9461 파도반 수열
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    int[] count = new int[T];
    long[] P = new long[100];
    int max = 0;
    P[0] = 1;
    P[1] = 1;
    P[2] = 1;
    P[3] = 2;
    P[4] = 2;
    for(int i=0; i<T; i++) {
      count[i] = Integer.parseInt(br.readLine());
      max = Math.max(max, count[i]);
    }
    
    for(int i=5; i<max; i++) {
      P[i] = P[i-2] + P[i-3];
    }
    
    for(int i=0; i<T; i++) {
      sb.append(P[count[i]-1]).append("\n");
    }
    
    System.out.print(sb);
  }
}
