/**
 * 18870 좌표 압축
 */
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    Integer[] ans = new Integer[N];
    HashMap<Integer, Integer> map = new HashMap<>();
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++) {
      ans[i] = Integer.parseInt(st.nextToken());
    }
    
    // 중복 제거 & 정렬
    HashSet<Integer> hset = new HashSet<>(Arrays.asList(ans));
    Integer[] set = hset.toArray(new Integer[0]);
    Arrays.sort(set);
    
    for(int i = 0; i < set.length; i++) {
      map.put(set[i], i); // 숫자 크기별 번호 부여
    }

    for(int i = 0; i < N; i++) {
      sb.append(map.get(ans[i])).append(" ");
    }
    
    System.out.print(sb);
  }
}