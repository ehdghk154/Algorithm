/*
 * 10845 큐
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    Queue<Integer> q = new LinkedList<Integer>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    String[] commend;
    String lastEl = "-1";
    
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      commend = new String[st.countTokens()];
      if(commend.length == 1)
        commend[0] = st.nextToken();
      else {
        commend[0] = st.nextToken();
        commend[1] = st.nextToken();
      }
        
      
      switch(commend[0]) {
        case "push":
          q.offer(Integer.parseInt(commend[1]));
          lastEl = commend[1];
          break;
        case "pop":
          if(q.isEmpty())
            System.out.println(-1);
          else
            System.out.println(q.poll());
          break;
        case "size":
          System.out.println(q.size());
          break;
        case "empty":
          if(q.isEmpty())
            System.out.println(1);
          else
            System.out.println(0);
          break;
        case "front":
          if(q.isEmpty())
            System.out.println(-1);
          else
            System.out.println(q.peek());
          break;
        case "back":
          if(q.isEmpty())
            System.out.println(-1);
          else
            System.out.println(lastEl);
          break;
      }
    }
  }
}
