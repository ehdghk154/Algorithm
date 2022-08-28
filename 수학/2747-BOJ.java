/*
 * 2747 피보나치 수
 */
import java.io.*;

public class Main {
  static char[][] arr;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n+1];
    arr[0] = 0;
    arr[1] = 1;
    
    for(int i = 2; i <= n; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }
    
    System.out.print(arr[n]);
  }
}
