/*
 * 2445 별 찍기 - 8
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < N; i++) {
      for(int j = 0; j <= i; j++) {
        sb.append('*');
      }
      for(int j = 0; j < 2*(N-i-1); j++) {
        sb.append(' ');
      }
      for(int j = 0; j <= i; j++) {
        sb.append('*');
      }
      sb.append('\n');
    }
    
    for(int i = N-1; i > 0; i--) {
      for(int j = 0; j < i; j++) {
        sb.append('*');
      }
      for(int j = 0; j < 2*(N-i); j++) {
        sb.append(' ');
      }
      for(int j = 0; j < i; j++) {
        sb.append('*');
      }
      sb.append('\n');
    }
    
    System.out.print(sb);
  }
}
