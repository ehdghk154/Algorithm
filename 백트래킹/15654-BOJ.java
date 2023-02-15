/**
 * 15654 N과 M (5)
 */
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  static int[] arr;
  static int[] num;
  static boolean[] checked;
  static int N, M;
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    arr = new int[M];
    num = new int[N];
    checked = new boolean[N];
    for(int i = 0; i < N; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(num);
    
    bt(0);
    
    System.out.println(sb);
  }
  
  public static void bt(int cnt) {
    if(cnt == M) {
      for(int i = 0; i < M; i++) {
        sb.append(arr[i]).append(' ');
      }
      sb.append('\n');
      return;
    }
    
    for(int i = 0; i < N; i++) {
      if(!checked[i]) {
        checked[i] = true;
        arr[cnt] = num[i];
        bt(cnt+1);
        checked[i] = false;
      }
    }
  }
}