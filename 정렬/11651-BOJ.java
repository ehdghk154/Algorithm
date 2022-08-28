/*
 * 11651 좌표 정렬하기 2
 */
import java.io.*;
import java.util.*;

class dot {
  int x;
  int y;
  
  dot(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    List<dot> list = new ArrayList<>();
    
    StringTokenizer st;
    
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      list.add(new dot(Integer.parseInt(st.nextToken()), 
                       Integer.parseInt(st.nextToken())));
    }
    
    list.sort((e1, e2)-> {
      if(e1.y == e2.y)
        return e1.x - e2.x;
      else
        return e1.y - e2.y;
    });
    
    list.forEach(d->{
      sb.append(d.x);
      sb.append(' ');
      sb.append(d.y);
      sb.append('\n');
    });
    
    System.out.print(sb);
  }
}
