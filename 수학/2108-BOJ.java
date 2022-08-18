/*
 * 2108 통계학
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] num = new int[8001];
    int ans1 = 0; // 산술 평균
    int ans2 = 0; // 중앙값
    int ans3 = 0; // 최빈값
    int ans4 = 0; // 범위
    int min = 4000, max = -4000;
    int count = 0;
    boolean checked = false;
    int mid = N/2 + 1;
    
    for(int i = 0; i < N; i++) {
      int x = Integer.parseInt(br.readLine());
      
      num[x+4000]++; // 최빈값 확인
      
      ans1 += x; // 산술 평균
      
      // 범위
      if(x < min)
        min = x;
      if(x > max)
        max = x;
    }
    
    float temp = (float)ans1 / N;
    ans1 = Math.round(temp);
    
    for(int i = min+4000; i <= max+4000; i++) {
      if(num[i] != 0) {
        if(count == num[i] && !checked) {
          ans3 = i-4000;
          checked = true;
        }
        else if(count < num[i]) {
          count = num[i];
          ans3 = i-4000;
          checked = false;
        }
        
        if(mid > 0) {
          mid -= num[i];
          if(mid <= 0)
            ans2 = i-4000;
        }
      }
    }
    
    ans4 = max - min;
    
    System.out.println(ans1);
    System.out.println(ans2);
    System.out.println(ans3);
    System.out.println(ans4);
  }
}
