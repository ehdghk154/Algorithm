package baekjun;
/*
 * 10799 ¼è¸·´ë±â
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    Stack<Character> stack = new Stack<>();
    String S = br.readLine();
    int stick = 0;
    int count = 0;
    
    for(int i = 0; i < S.length(); i++) {
      if(S.charAt(i) == '(') {
        
        if(i > 0 && S.charAt(i-1) == '(') {
          stick++;
          count++;
        }
        
        stack.add(S.charAt(i));
      }
      
      if(S.charAt(i) == ')') {
        
        if(S.charAt(i-1) == ')') {
          stick--;
        }
        else {
          stack.pop();
          count += stick;
        }
      }
      
      if(stack.isEmpty()) {
        stick = 0;
      }
    }
    
    System.out.print(count);
  }
}