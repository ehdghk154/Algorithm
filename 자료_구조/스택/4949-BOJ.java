/*
 * 4949 균형잡힌 세상
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    
    while(true) {
      String line = br.readLine();
      
      if(line.charAt(0) == '.')
        break;
      
      sb.append(balance(line)).append('\n');
    }
    
    System.out.print(sb);
  }
  
  public static String balance(String line) {
    Stack<Character> stack = new Stack<>();
    
    for(int i = 0; i < line.length(); i++) {
      
      if(line.charAt(i)  == '.') continue;
      
      if(line.charAt(i) == '(' || line.charAt(i) == '[') 
        stack.add(line.charAt(i));
      
      if(line.charAt(i) == ')') {
        
        if(!stack.isEmpty()) {
          
          if(stack.peek() == '(') 
            stack.pop();
          else {
            stack.add('/');
            break;
          }
          
        }else {
          stack.add('/');
          break;
        }
      }
          
      if(line.charAt(i) == ']') {
        
        if(!stack.isEmpty()) {
          
          if(stack.peek() == '[') 
            stack.pop();
          else {
            stack.add('/');
            break;
          }
          
        }else {
          stack.add('/');
          break;
        }
      }
    }
    
    if(!stack.isEmpty())
      return "no";
    else
      return "yes";
  }
}
