/**
 * 11286 절댓값 힙
 */
import java.io.*;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    PriorityQueue<Integer> q = new PriorityQueue<>((x1, x2) -> {
      int a1 = Math.abs(x1);
      int a2 = Math.abs(x2);
      if(a1 == a2) {
        return x1 - x2;
      }else {
        return a1 - a2;
      }
    });
    
    for(int i = 0; i < N; i++) {
      int x = Integer.parseInt(br.readLine());
      if(x == 0) {
        if(!q.isEmpty())
          sb.append(q.poll()).append('\n');
        else
          sb.append(0).append('\n');
      }else {
        q.add(x);
      }
    }
    
    System.out.println(sb);
  }
}
