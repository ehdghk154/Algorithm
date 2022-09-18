/*
 * 2490 ¿∑≥Ó¿Ã
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    for(int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      int zero = 0;
      for(int j = 0; j < 4; j++) {
        int yut = Integer.parseInt(st.nextToken());
        if(yut == 0)
          zero++;
      }
      
      switch(zero) {
        case 0:
          System.out.println("E");
          break;
        case 1:
          System.out.println("A");
          break;
        case 2:
          System.out.println("B");
          break;
        case 3:
          System.out.println("C");
          break;
        case 4:
          System.out.println("D");
          break;
      }
    }
  }
}