/**
 * 13458 시험 감독
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());
    long count = N;
    int[] A = new int[N];
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    
    st = new StringTokenizer(br.readLine());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());
    
    for(int i = 0; i < N; i++) {
      if(A[i] - B <= 0) continue;
      
      A[i] -= B;
      count += A[i] / C;
      
      if(A[i] % C != 0) 
        count++;
      
    }
    
    System.out.println(count);
  }
}