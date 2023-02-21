/**
 * 10807 개수 세기
 */
import java.io.*;
import java.util.StringTokenizer;
// 배열 사용
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 정수의 개수
    int[] num = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }
    int count = 0;
    int v = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < N; i++) {
      if(num[i] == v) {
        count++;
      }
    }
    
    System.out.println(count);
  }
}

/*
import java.io.*;
import java.util.StringTokenizer;
// 배열 인덱스 사용
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 정수의 개수
    int[] num = new int[201];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++) {
      num[Integer.parseInt(st.nextToken())+100]++;
    }
    
    System.out.println(num[Integer.parseInt(br.readLine())+100]);
  }
}
*/