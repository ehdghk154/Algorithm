/*
 * 1764 듣보잡
 */
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int count = 0;
    HashMap<String, Integer> map = new HashMap<>();
    List<String> ans = new ArrayList<>();
    
    for(int i = 0; i < N; i++) {
      map.put(br.readLine(), 0);
    }
    
    for(int i = 0; i < M; i++) {
      String s = br.readLine();
      if(map.get(s) != null) {
        count++;
        ans.add(s);
      }
    }
    
    Collections.sort(ans);
    
    for(int i = 0; i < ans.size(); i++) {
      sb.append(ans.get(i)).append('\n');
    }
    
    System.out.println(count);
    System.out.print(sb);
  }
}

/*
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int count = 0;
    HashMap<String, Integer> map = new HashMap<>();
    
    
    for(int i = 0; i < N; i++) {
      map.put(br.readLine(), 0);
    }

    for(int i = 0; i < M; i++) {
      String s = br.readLine();
      if(map.containsKey(s)) {
        count++;
        map.put(s, map.get(s)+1);
      }
    }
    
    Object[] mapkey = map.keySet().toArray();
    Arrays.sort(mapkey);
    
    
    for(int i = 0; i < mapkey.length; i++) {
      if(map.get(mapkey[i]) == 1) {
        sb.append(mapkey[i]).append('\n');
      }
    }
    System.out.println(count);
    System.out.print(sb);
  }
}
*/
