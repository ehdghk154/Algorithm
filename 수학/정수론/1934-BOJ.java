/*
 * 1934 최소공배수
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      int num1 = Integer.parseInt(st.nextToken());
      int num2 = Integer.parseInt(st.nextToken());
      
      int lcm = num1*num2/gcd(num1, num2);
      sb.append(lcm).append('\n');
    }
    
    System.out.print(sb);
  }
  
  public static int gcd(int num1, int num2) {
    if(num1%num2==0) 
      return num2;
    else 
      return gcd(num2, num1%num2);
  }
}
