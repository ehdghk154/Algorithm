/*
 * 10815 숫자 카드
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    boolean[] card = new boolean[20000001];
    
    int N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++) {
      card[Integer.parseInt(st.nextToken())+10000000] = true;
    }
    
    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < M; i++) {
      if(card[Integer.parseInt(st.nextToken())+10000000])
        sb.append(1).append(" ");
      else
        sb.append(0).append(" ");
    }
    
    System.out.println(sb);
  }
}
