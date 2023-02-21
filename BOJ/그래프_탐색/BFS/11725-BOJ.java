/**
 * 11725 트리의 부모 찾기
 */
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
  static boolean[] visited;
  static int[] ans;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());
    ans = new int[N+1];
    visited = new boolean[N+1];
    
    for(int i = 0; i <= N; i++) {
      list.add(new ArrayList<Integer>()); // 0번인덱스에 리스트1개, 1번인덱스에 리스트1개, ...
    }
    
    for(int i = 1; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int w = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      list.get(w).add(v); // w번 인덱스에 있는 리스트에 v추가
      list.get(v).add(w); // v번 인덱스에 있는 리스트에 w추가
    }
    
    bfs();
    
    for(int i = 2; i <= N; i++) {
      sb.append(ans[i]).append("\n");
    }
    
    System.out.print(sb);
  }
  public static void bfs() {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    
    while(!q.isEmpty()) {
      int w = q.poll();
      
      for(int n : list.get(w)) { // w번 인덱스에 있는 리스트에서 숫자 꺼내오기
        if(!visited[n]) {
          visited[n] = true;
          ans[n] = w; // n의 부모노드는 w
          q.add(n);
        }
      }
    }
  }
}