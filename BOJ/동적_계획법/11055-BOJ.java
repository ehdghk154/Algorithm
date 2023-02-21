/**
 * 11055 가장 큰 증가 부분 수열
 * 최장 증가 부분 수열(lis)
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] num = new int[N];
      
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }
    
    System.out.println(max(num));
  }
  
  static int max(int[] num) {
    int[] sum = new int[num.length];
    int max = 0;
    for(int i = 0; i < num.length; i++) {
      sum[i] = num[i];
      for(int j = 0; j < i; j++) {
        if(num[j] < num[i]) {
          sum[i] = Math.max(sum[i], sum[j] + num[i]);
        }
      }
      if(max < sum[i])
        max = sum[i];
    }
    return max;
  }
}