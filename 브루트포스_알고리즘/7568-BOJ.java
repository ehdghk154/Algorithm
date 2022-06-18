/*
 * 7568 덩치
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] x = new int[N]; // 몸무게
    int[] y = new int[N]; // 키
    int[] rank = new int[N]; // 등수
    
    StringTokenizer st;
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      x[i] = Integer.parseInt(st.nextToken());
      y[i] = Integer.parseInt(st.nextToken());
      rank[i] = 1;
    }

    for(int i=0; i<N; i++) {
      for(int j=0; j<N; j++) {
        if(i==j) continue;
        if(x[i]<x[j] && y[i]<y[j]) {
          rank[i]++;
        }
      }
    }
    
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<N; i++)
      sb.append(rank[i]).append(" ");
    System.out.println(sb);
  }
}
