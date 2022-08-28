/*
 * 10953 A+B - 6
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st;
    
    for(int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine(), ",");
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      sb.append(A+B).append('\n');
    }
    
    System.out.println(sb);
  }
}
