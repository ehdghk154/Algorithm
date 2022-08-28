/*
 * 2480 주사위 세개
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int dice1 = Integer.parseInt(st.nextToken());
    int dice2 = Integer.parseInt(st.nextToken());
    int dice3 = Integer.parseInt(st.nextToken());
    
    if(dice1 == dice2 && dice2 == dice3) {
      System.out.println(10000+dice1*1000);
    }else if(dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
      int dice = dice1 == dice2 ? dice1 : dice3;
      System.out.println(1000+dice*100);
    }else {
      int temp = dice1 > dice2 ? dice1 : dice2;
      int dice = dice3 > temp ? dice3 : temp;
        System.out.println(dice*100);
    }
  }
}
