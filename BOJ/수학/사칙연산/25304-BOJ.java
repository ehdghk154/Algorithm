/**
 * 25304 영수증
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int X = Integer.parseInt(br.readLine()); // 영수증에 적힌 총 금액
    int N = Integer.parseInt(br.readLine()); // 영수증에 적힌 구매한 물건의 종류 수
    int sum = 0; // 직접 계산한 총 금액
    for(int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken()); // 물건 가격
      int b = Integer.parseInt(st.nextToken()); // 물건 개수
      sum += a*b;
    }
    
    if(X != sum) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}