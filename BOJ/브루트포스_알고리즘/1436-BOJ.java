/*
 * 1436 영화감독 숌
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int num = 666;
    int count = 1;
    
    while(count != N) {
      num++;
      int temp = num;
      int sCount = 0;
      while(temp != 0) {
        
        if(temp%10 == 6) { // 자릿수가 6인지 확인
          sCount++;
          if(sCount == 3) // 자릿수가 연속으로 6이면 count+1
            count++;
          
        }else {
          sCount = 0; // 자릿수가 연속되지 않으면 초기화
        }
        temp /= 10;
      }
    }
    
    System.out.print(num);
  }
}

/* 문자열로 변환하여 contains 사용
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int num = 666;
    int count = 1;
    
    while(count != N) {
      num++;
      String snum = String.valueOf(num);
      if(snum.contains("666")) {
        count++;
      }
    }
    
    System.out.print(num);
  }
}
*/
