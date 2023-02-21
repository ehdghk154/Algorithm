/*
 * 1904 01타일
 */
import java.io.*;
//배열 사용X
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    if(N <= 2) {
      
      System.out.println(N);
      
    }else {
      
      int t1 = 1;
      int t2 = 2;
      int res = 0;
      
      for(int i = 3; i <= N; i++) {
        res = (t1 + t2) % 15746;
        t1 = t2;
        t2 = res;
      }
      
      System.out.println(res);
    }
  }
}

/*
import java.io.*;
// 배열 사용
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] tile = new int[N+1];
    
    tile[1] = 1;
    if(N >= 2)
      tile[2] = 2;
    
    for(int i = 3; i <= N; i++) {
      tile[i] = (tile[i-1] + tile[i-2]) % 15746;
    }
    
    System.out.println(tile[N]);
  }
}
*/
