/**
 * 2752 세수정렬
 */
import java.io.*;
import java.util.StringTokenizer;
// Arrays.sort()보다 살짝 메모리를 덜 씀
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] num = new int[3];
    
    for(int i = 0; i < 3; i++) {
      if(i == 0) {
        num[i] = Integer.parseInt(st.nextToken());
      } else {
        int tmp = Integer.parseInt(st.nextToken());
        for(int j = i; j > 0; j--) {
          if(num[j-1] > tmp) {
            num[j] = num[j-1];
            num[j-1] = tmp;
          } else {
            num[j] = tmp;
            break;
          }
        }
      }
    }
    
    sb.append(num[0]).append(' ').append(num[1]).append(' ').append(num[2]);
    System.out.println(sb);
  }
}

/* 편하게 Arrays.sort 함수가 있고 메모리 별 차이 없는데 이런 문제에서 위에 코드처럼 쓸 필요가 있을까?
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] num = new int[3];
    num[0] = Integer.parseInt(st.nextToken());
    num[1] = Integer.parseInt(st.nextToken());
    num[2] = Integer.parseInt(st.nextToken());
    
    Arrays.sort(num);
    
    sb.append(num[0]).append(' ').append(num[1]).append(' ').append(num[2]);
    System.out.println(sb);
  }
}
 */