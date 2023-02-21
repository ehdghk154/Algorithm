/*
 * 11650 좌표 정렬하기
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[][] pos = new int[N][2];
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      pos[i][0] = Integer.parseInt(st.nextToken());
      pos[i][1] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(pos, (e1, e2) -> { // 양수일 경우 교환, 음수 교환x
      if(e1[0] == e2[0]) { // x가 같으면
        return e1[1] - e2[1]; // y 비교
      }
      else {
        return e1[0] - e2[0];
      }
    });
    for(int i=0; i<N; i++) {
      sb.append(pos[i][0]).append(" ").append(pos[i][1]).append("\n");
    }
    System.out.println(sb);
  }
}
