/*
 * 11866 요세푸스 문제 0
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    List<Integer> list = new ArrayList<>();
    for(int i = 1; i <= N; i++) {
      list.add(i);
    }
    sb.append("<");
    int n = K-1;
    while(!list.isEmpty()) {
      
      while(list.size() <= n)
        n -= list.size();
      
      if(list.size() == 1)
        sb.append(list.remove(n)).append(">");
      else
        sb.append(list.remove(n)).append(", ");
      
      n += K-1; // 리스트의 크기가 1씩 줄어들기 때문에 K를 더하고 -1 해줌
    }
    System.out.println(sb);
  }
}
