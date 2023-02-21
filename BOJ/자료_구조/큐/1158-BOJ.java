/*
 * 1158 요세푸스 문제
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    List<Integer> list = new ArrayList<>();
    
    for(int i=1; i<=N; i++) {
      list.add(i);
    }
    
    int j=K-1;
    sb.append("<");
    // 리스트에서 K번째 자리의 인덱스 번호에 있는 값을 하나씩 뽑아내는 방식으로 풀이했지만
    // 다 풀고 보니 분류가 자료구조-큐 로 되어있었음
    while(!list.isEmpty()) { 
      sb.append(list.remove(j));
      
      if(!list.isEmpty()) {
        sb.append(", ");
      }
      j += K-1;
      
      while(j >= list.size()) {
        j -= list.size();
        
        if(list.size() == 0) {
          break;
        }
      }
    }
    sb.append(">");
    
    System.out.print(sb);
  }
}
