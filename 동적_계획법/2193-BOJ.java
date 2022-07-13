/*
 * 2193 이친수
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); 
    // 2 = 1개, 3 = 2개, 4 = 3개, 5 = 5개, 6 = 8개, ...
    long[] arr = new long[N+1]; // int형 범위로 불가 -> long형으로 변경
    
    arr[1] = 1;
    if(N >= 2)
      arr[2] = 1;
    for(int i=3; i<=N; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }
    
    System.out.print(arr[N]);
  }
}
