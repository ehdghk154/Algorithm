import java.io.*;
import java.util.*;
/*
 * 1931 회의실 배정
 */
class schedule {
  int startTime;
  int endTime;
  
  schedule(int startTime, int endTime) {
    this.startTime = startTime;
    this.endTime = endTime;
  }
}

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    ArrayList<schedule> time = new ArrayList<schedule>();
    
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      time.add(new schedule(s, e));
    }
    
    time.sort((e1, e2) -> {
      if(e1.endTime == e2.endTime)
        return e1.startTime - e2.startTime;
      else
        return e1.endTime - e2.endTime;
    });
    
    System.out.println(assign(time));
  }
  
  private static int assign(ArrayList<schedule> time) {
    int count = 0;
    int end = 0;
    for(schedule a : time) {
      if(end <= a.startTime) {
        count++;
        end = a.endTime;
      }
    }
    return count;
  }
}
