/*
 * 9020 골드바흐의 추측
 */
import java.io.*;

public class Main {
  static boolean[] checked = new boolean[10001];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    Prime();
    for(int i = 0; i < T; i++) {
      int n = Integer.parseInt(br.readLine());
      
      int one = n/2;
      int two = n/2;
      while(checked[one] || checked[two]) {
        one--;
        two++;
      }
      sb.append(String.valueOf(one));
      sb.append(' ');
      sb.append(String.valueOf(two));
      sb.append('\n');
    }
    
    System.out.print(sb);
  }
  
  static void Prime() {
    checked[1] = true;

    for(int i = 2; i*i <= checked.length; i++) {
      if(!checked[i]) { // 소수가 아닌 것들만 true체크, 소수는 변경없이 false로 유지
        for(int j=i*i; j < checked.length; j += i) { // i를 더하면 i의 배수이기 때문에 소수X
          checked[j] = true;
        }
      }
    }
  }
}
