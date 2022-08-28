/*
 * 1676 팩토리얼 0의 개수
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count = 0;
    while(N >= 5) {
      count += N / 5;
      N /= 5;
    }
    
    System.out.print(count);
  }
}

/*
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int ans = 0;
    for(int i = N-1; i >= 1; i--) {
      N = N * i;
      while(N % 10 == 0) {
        if(N % 100 == 0) {
          ans += 2;
          N = N / 100;
        }else {
          ans++;
          N = N / 10;
        }
      }
      N %= 100;
    }
    
    System.out.print(ans);
  }
}
*/
