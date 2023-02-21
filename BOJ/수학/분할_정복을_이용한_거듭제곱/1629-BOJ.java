/**
 * 1629 곱셈
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());

    
    System.out.println(pow(A, B, C));
  }

  public static long pow(int a, int exp, int c) {
    if(exp == 1)
      return a%c;
    
    long temp = pow(a, exp/2, c);
    
    if(exp % 2 == 1) { 
      // B가 홀수인 경우, A^B % C = A^(B/2) * A^(B/2) * A % C
      // A^(B/2) * A^(B/2) * A 부분이 long형(2^63-1)에 저장하기에도 너무 큰 수이므로
      // 나머지 연산 분배법칙으로 (A^(B/2) * A^(B/2)) % C * A % C 형태로 계산
      return (temp * temp) % c * a % c;
    }
    
    // B가 짝수인 경우, A^B % C = A^(B/2) * A^(B/2) % C
    return (temp * temp) % c;
  }
}
