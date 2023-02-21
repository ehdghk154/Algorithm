/*
 * 1476 날짜 계산
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int E = Integer.parseInt(st.nextToken()); // 15까지
    int S = Integer.parseInt(st.nextToken()); // 28까지
    int M = Integer.parseInt(st.nextToken()); // 19까지
    
    int year = 1;
    int e=0, s=0, m=0;
    while(true) {
      e = (year - E) % 15;
      s = (year - S) % 28;
      m = (year - M) % 19;
      if(e == 0 && s == 0 && m == 0) break;
      year++;
    }
    
    System.out.print(year);
  }
}