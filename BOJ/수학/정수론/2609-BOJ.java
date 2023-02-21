/*
 * 2609 최대공약수와 최소공배수
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num1 = Integer.parseInt(st.nextToken());
    int num2 = Integer.parseInt(st.nextToken());
    int gcd = 0;
    int lcm = 0;

    gcd = gcd(num1, num2);
    lcm = num1*num2/gcd;
    System.out.println(gcd);
    System.out.println(lcm);
  }
  //유클리드 호제법
  public static int gcd(int num1, int num2) {
    if(num1%num2==0) 
      return num2;
    else 
      return gcd(num2, num1%num2);
  }
}
