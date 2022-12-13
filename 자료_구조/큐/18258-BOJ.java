/**
 * 18258 큐 2
 */
import java.io.*;

public class Main {
  static int[] queue;
  static int size = 0;
  static int start = 0;
  static int end = 0;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int count = Integer.parseInt(br.readLine());
    queue = new int[count];
    while(count-- > 0) {
      String s = br.readLine();
      switch(s.charAt(0)) {
        case 'p':
          if(s.charAt(1) == 'u') { // push
            push(Integer.parseInt(s.substring(5)));
          }else { // pop
            sb.append(pop()).append('\n');
          }
          break;
        case 's': // size
          sb.append(size).append('\n');
          break;
        case 'e': // empty
          sb.append(empty()).append('\n');
          break;
        case 'f': // front
          sb.append(front()).append('\n');
          break;
        case 'b': // back
          sb.append(back()).append('\n');
          break;
      }
    }
    
    System.out.println(sb);
  }
  
  static void push(int n) {
    queue[end] = n;
    end++;
    size++;
  }
  
  static int pop() {
    if(size == 0) return -1;
    else {
      int r = queue[start];
      start++;
      size--;
      return r;
    }
  }
  
  static int empty() {
    if(size == 0) return 1;
    else return 0;
  }
  
  static int front() {
    if(size == 0) return -1;
    else return queue[start];
  }
  
  static int back() {
    if(size == 0) return -1;
    else return queue[end-1];
  }
}