/*
 * 1874 스택 수열
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    int[] num = new int[N+1];
    boolean end = false;
    Stack<Integer> stack = new Stack<>();
    for(int i=1; i<=N; i++) {
      num[i] = Integer.parseInt(br.readLine());
    }
    int i = 1;
    int count = 0;
    
    while(true) {
      
      if(num[i] > count) {
        sb.append("+").append("\n");
        stack.push(++count);
      }
      if(stack.peek().equals(num[i])) {
        sb.append("-").append("\n");
        i++;
        stack.pop();
      }
      
      if(i > N) {
        end = true;
        break;
      }
      if(stack.isEmpty()) {
        if(count > num[i])
          break;
      }else if(stack.peek() > num[i]) {
        break;
      }
    }
    if(end) {
      System.out.print(sb);
    }else {
      System.out.print("NO");
    }
  }
}
