/*
 * 10866 덱
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    Deque<Integer> q = new ArrayDeque<>();
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      switch(st.nextToken()) {
        case "push_back":
          q.addLast(Integer.parseInt(st.nextToken()));
          break;
        case "push_front":
          q.addFirst(Integer.parseInt(st.nextToken()));
          break;
        case "pop_back":
          if(!q.isEmpty())
            sb.append(q.pollLast()).append('\n');
          else
            sb.append(-1).append('\n');
          break;
        case "pop_front":
          if(!q.isEmpty())
            sb.append(q.pollFirst()).append('\n');
          else
            sb.append(-1).append('\n');
          break;
        case "size":
          sb.append(q.size()).append('\n');
          break;
        case "empty":
          if(!q.isEmpty())
            sb.append(0).append('\n');
          else
            sb.append(1).append('\n');
          break;
        case "front":
          if(!q.isEmpty())
            sb.append(q.peekFirst()).append('\n');
          else
            sb.append(-1).append('\n');
          break;
        case "back":
          if(!q.isEmpty())
            sb.append(q.peekLast()).append('\n');
          else
            sb.append(-1).append('\n');
          break;
      }
    }
    
    System.out.print(sb);
  }
}
