/*
 * 3009 네 번째 점
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    int[][] points = new int[2][1001];
    
    for(int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      points[0][Integer.parseInt(st.nextToken())]++;
      points[1][Integer.parseInt(st.nextToken())]++;
    }
    
    for(int i = 1; i <= 1000; i++) {
      if(points[0][i] == 1) {
        sb.append(i).append(" ");
        break;
      }
    }
    for(int i = 1; i <= 1000; i++) {
      if(points[1][i] == 1) {
        sb.append(i).append(" ");
        break;
      }
    }
    
    System.out.print(sb);
  }
}
