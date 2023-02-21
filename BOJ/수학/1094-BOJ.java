/**
 * 1094 막대기
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int X = Integer.parseInt(br.readLine());
    int lod = 64;
    int count = 0;
    
    while(X != 0) {
      if(lod <= X) {
        X -= lod;
        count++;
      }
      lod /= 2;
    }
    
    System.out.println(count);
  }
}
/** X의 2진수에서 1이 몇 개인지 count하는 방법
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int X = Integer.parseInt(br.readLine());
    int count = 1;
    
    while(X != 1) {
      int bit = X % 2;
      X /= 2;
      count += bit;
    }
    
    System.out.println(count);
  }
}
*/