package baekjun;
/*
 * 10808 ¾ËÆÄºª °³¼ö
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String S = br.readLine();
    int[] alpha = new int[26];
    for(int i = 0; i < S.length(); i++) {
      alpha[S.charAt(i)-97]++;
    }
    
    for(int i = 0; i < alpha.length; i++) {
      sb.append(alpha[i]).append(" ");
    }
    
    System.out.print(sb);
  }
}