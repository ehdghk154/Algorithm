/**
 * 10162 전자레인지
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    // A = 5min = 300sec, B = 1min = 60sec, C = 10sec
    int T = Integer.parseInt(br.readLine());
    if(T % 10 != 0) {
      System.out.println(-1);
    } else {
      int A = T / 300;
      T %= 300;
      int B = T / 60;
      T %= 60;
      int C = T / 10;
      
      sb.append(A).append(' ');
      sb.append(B).append(' ');
      sb.append(C);
      
      System.out.println(sb);
    }
  }
}