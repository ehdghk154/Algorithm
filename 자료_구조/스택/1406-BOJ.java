/**
 * 1406 에디터
 */

/**
 * commend를 StringTokenizer() 대신 toCharArray()를 사용하면
 * 메모리와 시간을 절약할 수 있음.
 * 
 * StringTokenizer() 사용 시   메모리 : 117040KB / 시간 : 636ms
 * toCharArray() 사용 시       메모리 : 59172KB / 시간 : 476ms
 */
import java.io.*;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Stack<Character> stack1 = new Stack<>();
    Stack<Character> stack2 = new Stack<>();
    String N = br.readLine();
    int M = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < N.length(); i++) {
      stack1.add(N.charAt(i));
    }
    
    for(int i = 0; i < M; i++) {
      char[] commend = br.readLine().toCharArray();
      
      switch(commend[0]) {
        case 'P':
          stack1.add(commend[2]);
          break;
        case 'L':
          if(!stack1.isEmpty()) {
            stack2.add(stack1.pop());
          }
          break;
        case 'D':
          if(!stack2.isEmpty()) {
            stack1.add(stack2.pop());
          }
          break;
        case 'B':
          if(!stack1.isEmpty()) {
            stack1.pop();
          }
          break;
        default:
      }
    }
    
    while(!stack2.isEmpty()) {
      stack1.add(stack2.pop());
    }
    
    for(int i = 0; i < stack1.size(); i++) {
      bw.write(stack1.get(i));
    }
    
    bw.flush();
    bw.close();
  }
}