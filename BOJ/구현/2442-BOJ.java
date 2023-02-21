/*
 * 2442 별 찍기 - 5
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    for(int i=0; i<N; i++) {
      
      for(int j=N-i-1; j > 0; j--) {
        sb.append(' ');
      }
      
      for(int j=0; j < 2*(i+1)-1; j++) {
        sb.append('*');
      }
      sb.append('\n');
    }
    
    System.out.print(sb);
  }
}
