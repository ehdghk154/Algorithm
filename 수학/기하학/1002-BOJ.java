/*
 * 1002 터렛
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] jo = new int[3]; // x, y, r
    int[] baek = new int[3];
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
      
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j=0; j<3; j++)
        jo[j] = Integer.parseInt(st.nextToken());
      for(int j=0; j<3; j++)
        baek[j] = Integer.parseInt(st.nextToken());
      
      if(jo[0] == baek[0] && jo[1] == baek[1]) {
        if(jo[2] == baek[2]) 
          sb.append(-1).append("\n");
        else 
          sb.append(0).append("\n");
        continue;
      }
      
      double x = Math.pow((baek[0]-jo[0]), 2);
      double y = Math.pow((baek[1]-jo[1]), 2);
      double dist = Math.sqrt(x+y);
      if((jo[2] + baek[2]) == dist || Math.abs(jo[2] - baek[2]) == dist)
        sb.append(1).append("\n");
      else if((jo[2] + baek[2]) < dist || Math.abs(jo[2] - baek[2]) > dist)
        sb.append(0).append("\n");
      else
        sb.append(2).append("\n");
    }
      
    System.out.println(sb);
  }
}
