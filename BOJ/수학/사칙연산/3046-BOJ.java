/*
 * 3046 R2
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int R1 = Integer.parseInt(st.nextToken());
    int S = Integer.parseInt(st.nextToken());
    
    //2S = R1 + R2, 2S - R1 = R2
    int R2 = 2*S - R1;
    System.out.print(R2);
  }
}
