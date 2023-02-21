/*
 * 2805 나무 자르기
 */
import java.io.*;
import java.util.*;

public class Main {
  static int[] h;
  static int M;
  static long ans;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    h = new int[N];
    long max = 0;
    st = new StringTokenizer(br.readLine());
    
    for(int i = 0; i < N; i++) {
      h[i] = Integer.parseInt(st.nextToken());
      max = Math.max(max, h[i]);
    }
    
    h_Search(1, max);
    
    System.out.print(ans);
  }
  
  public static void h_Search(long s, long e) {
    if(s > e) {
      return;
    }
    long sum = 0;
    long mid = (s + e) / 2;
    
    for(int i : h) {
      if(i > mid) {
        sum += i - mid; // mid 높이로 자르고 남은 나무 길이 합
      }
    }
    
    if(sum >= M) {
      if(ans < mid)
        ans = mid; // 자를 수 있는 높이 최대 값 갱신
      h_Search(mid+1, e);
    }
    else {
      
      h_Search(s, mid-1);
    }
  }
}
