/*
 * 1011 Fly me to the Alpha Centauri
 */
import java.io.*;
import java.util.*;

public class Main {
  static int ans = Integer.MAX_VALUE;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      
      int distance = y - x;
      int max = (int)Math.sqrt(distance);
      
      if(max == Math.sqrt(distance)) {
        sb.append(2*max-1).append('\n');
      }
      else if(distance <= max*max+max) { // 위 조건문이 아니면 distance는 max*max보다 큼
        sb.append(2*max).append('\n');
      }
      else {
        sb.append(2*max+1).append('\n');
      }
    }
    
    System.out.print(sb);
  }
}
