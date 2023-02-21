/*
 * 10816 숫자 카드 2
 */
import java.io.*;
import java.util.*;
// 해쉬맵을 이용한 풀이 -> 메모리를 배열보다 덜 쓰지만 속도는 느림
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T1 = Integer.parseInt(br.readLine());
    HashMap<Integer, Integer> map = new HashMap<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < T1; i++) {
      int N = Integer.parseInt(st.nextToken());
      if(map.get(N) != null) {
        map.put(N, map.get(N)+1);
      }else {
        map.put(N, 1);
      }
    }
    
    int T2 = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    
    for(int i = 0; i < T2; i++) {
      int N = Integer.parseInt(st.nextToken());
      if(map.get(N) != null)
        sb.append(map.get(N)).append(' ');
      else
        sb.append(0).append(' ');
    }
    
    System.out.print(sb);
  }
}

/* 배열을 이용한 풀이 -> 메모리를 해쉬맵보다 더 쓰는 대신 속도가 더 빠름
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T1 = Integer.parseInt(br.readLine());
    int[] card = new int[20000001];
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < T1; i++) {
      int N = Integer.parseInt(st.nextToken());
      card[N+10000000]++;
    }
    
    int T2 = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    
    for(int i = 0; i < T2; i++) {
      int N = Integer.parseInt(st.nextToken());
      sb.append(card[N+10000000]).append(' ');
    }
    
    System.out.print(sb);
  }
}
*/
