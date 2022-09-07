/*
 * 1182 부분수열의 합
 */
import java.io.*;
import java.util.*;

public class Main {
  static int N, S, count;
  static int[] arr;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    S = Integer.parseInt(st.nextToken());
    arr = new int[N];
    count = 0;
    st = new StringTokenizer(br.readLine());
    
    for(int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    bt(0, 0);
    
    System.out.print(count);
  }
  
  public static void bt(int index, int sum) {
    if(index > N-1) return;
    
    if(sum + arr[index] == S) count++;
    
    bt(index+1, sum+arr[index]); // arr[index] 숫자를 선택한 경우
    bt(index+1, sum); // arr[index] 숫자를 선택하지 않은 경우
  }
}

//분류로 백트래킹도 있었지만 브루트포스 알고리즘에 더 가깝게 풀었다고 생각하여 배치