package baekjun;
/*
 * 5585 �Ž�����
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int change = 1000 - N;
    int count = 0;
    
    while(change > 0) {
      count++;
      
      if(change >= 500) change -= 500;
      else if(change >= 100) change -= 100;
      else if(change >= 50) change -= 50;
      else if(change >= 10) change -= 10;
      else if(change >= 5) change -= 5;
      else change -= 1;

    }
    
    System.out.print(count);
  }
}