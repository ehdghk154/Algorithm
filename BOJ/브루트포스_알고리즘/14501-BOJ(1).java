/*
 * 14501 퇴사
 */
import java.io.*;
import java.util.*;
// 알고리즘 분류로 다이나믹 프로그래밍과 브루트포스가 있었고 직접 푼 이 방식은 브루트포스에 가깝다고 생각해서 여기에 추가.
// 다이나믹 프로그래밍(동적 계획법) 폴더에도 해당 코드가 있음
public class Main {
  static int[] T, P;
  static int N, max;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    T = new int[N+1];
    P = new int[N+1];
    
    for(int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      
      T[i] = Integer.parseInt(st.nextToken());
      P[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 1; i <= N; i++) {
      consult(0, i);
    }
    
    System.out.print(max);
  }
  
  public static void consult(int sum, int day) {
    int nextD = day + T[day];
    
    if(nextD-1 > N) {
      if(max < sum)
        max = sum;
      return;
    }
    
    if(nextD-1 <= N) 
      sum += P[day];
    
    if(nextD-1 == N)
      if(max < sum)
        max = sum;
    
    for(int i = nextD; i <= N; i++)
      consult(sum, i);
  }
}
