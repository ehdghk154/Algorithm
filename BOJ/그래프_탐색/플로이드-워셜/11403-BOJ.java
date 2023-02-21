/**
 * 11403 경로 찾기
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    int[][] arr = new int[N][N];
    
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    // j에서 i로 갈 수 있고, i에서 k로 갈 수 있다면, j에서 k로 갈 수 있다.
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        for(int k = 0; k < N; k++) {
          if(arr[j][i] == 1 && arr[i][k] == 1)
            arr[j][k] = 1;
        }
      }
    }
    
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        sb.append(arr[i][j]).append(" ");
      }
      sb.append("\n");
    }
    
    System.out.print(sb);
  }
}