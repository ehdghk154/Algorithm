/*
 * 1966 프린터 큐
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken()); // 문서의 개수
      int M = Integer.parseInt(st.nextToken()); // 몇 번째로 인쇄되었는지 궁금한 문서의 위치
      Queue<Integer> q = new LinkedList<>();
      int count = 0;
      
      st = new StringTokenizer(br.readLine());
      
      for(int j = 0; j < N; j++) {
        q.add(Integer.parseInt(st.nextToken()));
      }
      
      while(true) {
        int doc = q.poll();
  
        for(Integer other : q) {
          if(doc < other) { // 현재 문서의 우선순위가 다른 문서보다 낮다면
            if(M == 0) // 특정한 문서가 0 번째 자리라면
              M = q.size(); // 가장 뒤로 재배치
            else
              M--; // 앞으로 1칸 이동
            
            q.add(doc);
            doc = 0; // 문서 인쇄 여부 (0이면 인쇄x, 그 외 인쇄o)
            break;
          }
        }
        
        if(doc != 0) { // 문서가 인쇄됐다면
          count++; // 인쇄된 순서 +1
          if(M == 0) { // 특정한 문서가 인쇄됐다면
            sb.append(count).append('\n'); // 인쇄 순서 출력
            break;
          }
          M--; // 우선순위인 문서가 출력되면 앞으로 1칸 이동
        }
      } // while
    } // for - T
    
    System.out.print(sb);
  }
}
