/*
 * 3003 Å·, Äý, ·è, ºñ¼ó, ³ªÀÌÆ®, Æù
 */
import java.io.*;
import java.util.*;

public class Main {
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int[] set = {1, 1, 2, 2, 2, 8};
    
    for(int i = 0; i < 6; i++) {
      int chess = Integer.parseInt(st.nextToken());
      sb.append(set[i] - chess).append(" ");
    }
    
    System.out.print(sb);
  }
}