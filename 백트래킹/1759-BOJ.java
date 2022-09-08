/*
 * 1759 암호 만들기
 */
import java.io.*;
import java.util.*;

public class Main {
  static char[] s, pwd;
  static int L, C;
  static StringBuilder sb = new StringBuilder();
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    L = Integer.parseInt(st.nextToken()); // 서로 다른 알파벳 소문자 개수
    C = Integer.parseInt(st.nextToken()); // 암호로 사용했을 법한 문자의 개수
    s = new char[C];
    pwd = new char[L];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < C; i++) {
      s[i] = st.nextToken().charAt(0);
    }
    Arrays.sort(s);
    
    password(0, 0);
    
    System.out.print(sb);
  }
  
  public static void password(int depth, int count) {
    if(count == L) {
      boolean check = vcCount(pwd);
      
      if(check) {
        for(int i = 0; i < L; i++) {
          sb.append(pwd[i]);
        }
        sb.append("\n");
      }
      
      return;
    }
    
    for(int i = depth; i < C; i++) {
      pwd[count] = s[i];
      password(i+1, count+1);
    }
  }

  public static boolean vcCount(char[] p) {
    int v = 1; // 자음
    int c = 2; // 모음
    for(int i = 0; i < p.length; i++) {
      if(p[i] == 'a' || p[i] == 'e' || p[i] == 'i' || p[i] == 'o' || p[i] == 'u')
        v--;
      else
        c--;
    }
    
    if(v <= 0 && c <= 0) 
      return true;
    
    return false;
  }
}