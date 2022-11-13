/**
 * 1021 회전하는 큐
 */
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    Deque<Integer> dq = new ArrayDeque<>();
    
    for(int i = 1; i <= N; i++) {
      dq.add(i);
    }
    
    int count = 0;
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < M; i++) {
      Deque<Integer> fDq = new ArrayDeque<>();
      Deque<Integer> bDq = new ArrayDeque<>();
      fDq.addAll(dq);
      bDq.addAll(dq);
      int fCount = 0;
      int bCount = 0;
      int element = Integer.parseInt(st.nextToken());
      while(true) {
        if(fDq.getFirst() != element) {
          fDq.addLast(fDq.getFirst());
          fDq.removeFirst();
          fCount++;
        } else {
          fDq.removeFirst();
          break;
        }
      }

      while(true) {
        if(bDq.getFirst() != element) {
          bDq.addFirst(bDq.getLast());
          bDq.removeLast();
          bCount++;
        } else {
          bDq.removeFirst();
          break;
        }
      }
      
      if(fCount < bCount) {
        dq = fDq;
        count += fCount;
      } else {
        dq = bDq;
        count += bCount;
      }
    }
    System.out.println(count);
  }
}