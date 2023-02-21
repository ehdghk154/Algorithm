/*
 * 1654 랜선 자르기
 */
import java.io.*;
import java.util.*;

public class Main {
  static int N, K;
  static int[] arr;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    K = Integer.parseInt(st.nextToken());
    N = Integer.parseInt(st.nextToken());
    arr = new int[K];
    for(int i = 0; i < K; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    System.out.print(binarySearch());
  }

  static long binarySearch() {
    long left = 1;
    long right = (long)Integer.MAX_VALUE+1;
    long ans = 0;
    while(left < right) {
      //System.out.printf("left: %d%n", left);
      //System.out.printf("right: %d%n", right);
      long mid = (left + right) / 2;
      if(count(mid)) {
        ans = mid;
        left = mid+1;
      }else {
        right = mid;
      }
    }
    
    return ans;
  }

  static boolean count(long mid) {
    int sum = 0;
    for(int i = 0; i < K; i++) {
      sum += arr[i] / mid;
    }
    return sum >= N;
  }
}
