/*
 * 11729 하노이 탑 이동 순서
 */
import java.io.*;
// BufferedWriter 사용 -> 52552KB 496ms
public class Main {
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); 
    System.out.println((int)Math.pow(2, N)-1);
    hanoi(N, 1, 2, 3);
    bw.flush();
    bw.close();
    br.close();
  }
  static void hanoi(int N, int r1, int r2, int r3) throws IOException {
    if(N == 1) {
      bw.write(r1 + " " + r3 + "\n");
    }
    else {
      hanoi(N-1, r1, r3, r2); // N-1번째 원판을 경유지점으로 옮기기
      bw.write(r1 + " " + r3 + "\n"); // N번째 원판을 목적지로 옮기기 
      hanoi(N-1, r2, r1, r3); // 경유지점에 있는 원판을 목적지로 옮기기
    }
  }
}

/*
import java.io.*;
import java.util.*;
// StringBuilder 사용 -> 46844KB 704ms
public class Main {
  private static StringBuilder sb;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    sb = new StringBuilder();
    
    hanoi(N, 1, 2, 3);
    
    System.out.println((int)Math.pow(2, N)-1);
    System.out.println(sb);
  }
  static void hanoi(int N, int r1, int r2, int r3) {
    if(N == 1) {
      sb.append(r1).append(' ').append(r3).append('\n');
    }
    else {
      hanoi(N-1, r1, r3, r2); // N-1번째 원판을 경유지점으로 옮기기
      sb.append(r1).append(' ').append(r3).append('\n'); // N번째 원판을 목적지로 옮기기
      hanoi(N-1, r2, r1, r3); // 경유지점에 있는 원판을 목적지로 옮기기
    }
  }
}
*/
