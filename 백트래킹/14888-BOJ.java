/*
 * 14888 연산자 끼워넣기
 */
import java.io.*;
import java.util.*;

public class Main {
  static int[] A, op;
  static int N, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    A = new int[N];
    op = new int[4];
    
    for(int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    
    st = new StringTokenizer(br.readLine());
    // +, -, *, /
    for(int i = 0; i < 4; i++) {
      op[i] = Integer.parseInt(st.nextToken());
    }
    
    ans(A[0], 1);
    
    System.out.println(max);
    System.out.println(min);
  }
  public static void ans(int sum, int depth) {
    if(depth == N) {
      if(max < sum)
        max = sum;
      if(min > sum)
        min = sum;
      return;
    }
    
    for(int i = 0; i < 4; i++) {
      if(op[i] > 0) {
        op[i]--; // 해당 연산자 횟수 차감
        if(i == 0) ans(sum + A[depth], depth+1);
        else if(i == 1) ans(sum - A[depth], depth+1);
        else if(i == 2) ans(sum * A[depth], depth+1);
        else if(i == 3) ans(sum / A[depth], depth+1);
        op[i]++; // 한 줄의 연산이 끝났으므로 다른 형태의 연산을 위해 처음 상태로 복구
      }
    }
  }
}
