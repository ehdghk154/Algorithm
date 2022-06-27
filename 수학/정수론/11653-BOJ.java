/*
 * 11653 소인수분해
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    // while문
    int div = 2;
    while(div <= Math.sqrt(N)) {
      if(N%div == 0) {
        sb.append(div).append("\n");
        N /= div;
      }else {
        div++;
      }
    }
    if(N != 1)
      sb.append(N);
    
    /* for문
    for(int i=2; i<=Math.sqrt(N); i++) {
      while(N%i == 0) {
        N /= i;
        sb.append(i).append("\n");
      }
    }
    if(N != 1)
      sb.append(N);
    */
    
    System.out.println(sb);
  }
}
