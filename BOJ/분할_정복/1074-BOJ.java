/**
 * 1074 Z
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static int r, c, count, ans;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    r = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    int powN = (int) Math.pow(2, N);
    count = 0;
    
    zSearch(0, 0, powN);
    
    System.out.println(ans);
  }
  
  public static void zSearch(int y, int x, int powN) {
    if(r >= y+powN || c >= x+powN) {
      if(r >= y+powN) {
        y += powN;
        // y축인 r이 i+powN보다 크면 1사분면에서 3사분면으로 이동하여 1, 2 사분면을 지나므로
        // 한 덩어리인 powN*powN 크기의 사분면이 2개 카운트됨
        count += powN*powN*2;
      }
      if(c >= x+powN) {
        x += powN;
        // x축인 c가 j+powN보다 크면 1사분면에서 2사분면으로 이동하여 1사분면을 지나므로
        // 한 덩어리인 powN*powN 크기의 사분면이 1개 카운트됨
        count += powN*powN;
      }
      zSearch(y, x, powN);
    }
    else {
      if(powN == 2) {
        for(int i = 0; i < 2; i++) {
          for(int j = 0; j < 2; j++) {
            if(y+i == r && x+j == c) {
              ans = count;
              return;
            }
            count++;
          }
        }
      }
      else {
        zSearch(y, x, powN/2);
      }
    }
  }
}