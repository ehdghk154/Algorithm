/*
 * 11653 소인수분해
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    while(true) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      int z = Integer.parseInt(st.nextToken());
      
      if(x == 0)
        break;
      
      if(z < x) {
        int temp = z;
        z = x;
        x = temp;
      }
      if(z < y) {
        int temp = z;
        z = y;
        y = temp;
      }
      
      if(Math.pow(z, 2) == (Math.pow(y, 2) + Math.pow(x, 2)))
        sb.append("right").append("\n");
      else
        sb.append("wrong").append("\n");
    }
    
    System.out.print(sb);
  }
}
