/*
 * 2581 소수
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int M = Integer.parseInt(br.readLine()); 
    int N = Integer.parseInt(br.readLine());
    int sum = 0;
    int min = 10000;
    for(int i=M; i <= N; i++) {
      if(Prime(i)) {
        sum += i;
        if(i < min)
          min = i;
      }
    }
    if(sum == 0)
      System.out.println(-1);
    else {
      System.out.println(sum);
      System.out.println(min);
    }
  }
  static boolean Prime(int num) {
  if(num < 2)
  return false;

  // 시간복잡도 O(√N) √N번 조회
  for(int i = 2; i*i <= num; i++) {
  if(num%i == 0) {
    return false;
  }
  }
  return true;
  }
}
