/*
 * 10757 큰 수 A+B
 */
// 빈칸을 0으로 채워서 동일한 길이로 계산
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    String A_ = st.nextToken();
    String B_ = st.nextToken();
    if(A_.length() < B_.length()) {
      String temp = A_;
      A_ = B_;
      B_ = temp;
    }
    int[] A = new int[A_.length()];
    int[] B = new int[A_.length()];
    int[] ans = new int[A_.length()+1];
    int zero = A_.length()-B_.length();
    
    for(int i=0; i<A.length; i++) {
      A[i] = A_.charAt(i) - '0';
      if(i < zero)
        B[i] = 0;
      else
        B[i] = B_.charAt(i-zero) - '0';
    }
    
    for(int i=A.length; i>0; i--) {
      int plus = A[i-1] + B[i-1];
      if(plus+ans[i] >= 10) {
        plus -= 10;
        ans[i-1]++;
      }
      ans[i] += plus;
    }

    for(int i=0; i<=A_.length(); i++) {
      if(ans[i] == 0 && i == 0) continue;
      sb.append(ans[i]);
    }
    
    System.out.print(sb);
  }
}


/* 
import java.io.*;
import java.util.*;
// 값을 역으로 불러와서 계산
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    String A_ = st.nextToken();
    String B_ = st.nextToken();
    int leng = Math.max(A_.length(), B_.length());
    int[] A = new int[leng];
    int[] B = new int[leng];
    int[] ans = new int[leng+1];
    int zero = Math.abs(A_.length()-B_.length());
    
    for(int i=0, idx=A_.length()-1; i<A_.length(); i++, idx--) {
      A[i] = A_.charAt(idx) - '0';
    }
    for(int i=0, idx=B_.length()-1; i<B_.length(); i++, idx--) {
      B[i] = B_.charAt(idx) - '0';
    }
    
    for(int i=0; i<leng; i++) {
      int plus = A[i] + B[i] + ans[i];
      ans[i+1] = (plus/10);
      ans[i] = (plus%10);
    }

    if(ans[leng] != 0)
      sb.append(ans[leng]);
    for(int i=leng-1; i>=0; i--) {
      sb.append(ans[i]);
    }
    
    System.out.print(sb);
  }
}

*/
