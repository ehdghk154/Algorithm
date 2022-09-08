/*
 * 6603 로또
 */
import java.io.*;
import java.util.*;

public class Main {
  static int[] S, lt;
  static int k;
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    while(true) {
      st = new StringTokenizer(br.readLine());
      k = Integer.parseInt(st.nextToken()); // 집합 S의 원소의 개수
      S = new int[k]; // 집합 S
      lt = new int[6]; // 선택한 로또 번호
      if(k == 0)  break; // 0 입력 시 종료
      
      for(int i = 0; i < k; i++) {
        S[i] = Integer.parseInt(st.nextToken());
      }
      
      lotto(0, 0);
      
      sb.append("\n");
    }
    
    System.out.print(sb);
  }
  
  public static void lotto(int num, int count) {
    if(count == 6) { // 로또 번호를 6개 선택했으면
      for(int i = 0; i < 6; i++) // 선택한 6개 로또 번호 출력
        sb.append(lt[i]).append(" ");
      sb.append("\n");
      
      return;
    }
    
    for(int i = num+1; i <= k; i++) {
      lt[count] = S[i-1]; // 선택한 로또 번호에 집합 S의 번호를 덮어쓰기 방식으로 모든 방법 입력
      lotto(i, count+1); // 다음 로또 번호 선택
    }
  }
}