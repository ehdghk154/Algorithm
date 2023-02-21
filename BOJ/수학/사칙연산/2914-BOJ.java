/**
 * 2914 저작권
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken()); // 앨범 수록곡 개수
    int I = Integer.parseInt(st.nextToken()); // 평균값
    
    System.out.println(A*(I-1)+1); // 저작권 있는 최소 멜로디 개수
  }
}