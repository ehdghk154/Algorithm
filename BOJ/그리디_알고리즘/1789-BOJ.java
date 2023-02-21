/**
 * 1789 수들의 합
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long S = Long.parseLong(br.readLine());
    long num = 0;
    int N = 0;
    
    for(int i=1; ; i++) {
      if(num > S) break;
      num += i;
      N++;
    }
    
    System.out.println(N-1);
  }
}