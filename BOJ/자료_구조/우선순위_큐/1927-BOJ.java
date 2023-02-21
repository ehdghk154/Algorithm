/*
 * 1927 최소 힙
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> q = new PriorityQueue<>();
    
    for(int i = 0; i < N; i++) {
      int x = Integer.parseInt(br.readLine());
      if(x == 0) {
        if(q.isEmpty())
          sb.append(0).append('\n');
        else {
          sb.append(q.poll()).append('\n');
        }
      }
      else {
        q.offer(x);
      }
    }
    
    System.out.print(sb);
  }
}
