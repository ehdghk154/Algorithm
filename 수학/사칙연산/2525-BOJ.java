/*
 * 2525 오븐 시계
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(br.readLine());
    B += C;
    while (B >= 60) {
      B -= 60;
      A++;
      if(A > 23)
        A = 0;
    }
    sb.append(A).append(" ").append(B);
    System.out.println(sb);
  }
}
