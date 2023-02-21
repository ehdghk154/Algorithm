/*
 * 1037 약수
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int max = 0;
    int min = 1000000;
    for(int i = 0; i < T; i++) {
      int div = Integer.parseInt(st.nextToken());
      
      max = max < div ? div : max;
      min = min > div ? div : min;
    }
    
    System.out.print(max*min);
  }
}
