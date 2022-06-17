/*
 * 10989 수 정렬하기 3
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 인덱스를 이용하여 출력
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] nums = new int[10001];
    for(int i=0; i<N; i++) {
      nums[Integer.parseInt(br.readLine())]++;
    }
    
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for(int i=1; i<=10000; i++) {
      bw.write((String.valueOf(i)+"\n").repeat(nums[i]));
    }
    
    bw.close();
    br.close();
  }
}
/* 값을 직접 정렬하여 출력
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] num = new int[N];
    for(int i=0; i<N; i++) {
      num[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(num);
    
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<N; i++) {
      sb.append(num[i]).append("\n");
    }
    System.out.println(sb);
  }
}
*/
