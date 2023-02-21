/*
 * 10814 나이순 정렬
 */
import java.io.*;
import java.util.*;
// 직접 풀어본 코드 memory:48840KB time:652ms
class user {
  int age;
  int order;
  String name;
  
  user(){}
  
  user(int age, int order, String name) {
    this.age = age;
    this.order = order;
    this.name = name;
  }
}
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    List<user> list = new ArrayList<>();
    StringTokenizer st;
    
    for(int i=0; i<N; i++) {
      st = new StringTokenizer(br.readLine());
      list.add(new user(Integer.parseInt(st.nextToken()), i, st.nextToken()));
    }
    
    list.sort((e1, e2) -> { // sort함수를 이용한 정렬
      if(e1.age == e2.age) // 나이가 같을 경우
        return e1.order - e2.order; // 먼저 들어온 순서대로 정렬
      else
        return e1.age - e2.age;
      
    });
    
    for(int i=0; i<N; i++)
      sb.append(list.get(i).age).append(" ").append(list.get(i).name).append("\n");
    
    System.out.println(sb);
  }
}

/* 다른 맞힌 사람들 중 순위에 있는 풀이 memory:38900KB time:452ms
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder[] sb = new StringBuilder[201];
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    
    for(int i=0; i<sb.length; i++) {
      sb[i] = new StringBuilder();
    }
    for(int i=0; i<N; i++) { // 인덱스를 이용한 정렬
      st = new StringTokenizer(br.readLine());
      int age = Integer.parseInt(st.nextToken());
      sb[age].append(age).append(" ").append(st.nextToken()).append("\n");
    }
    
    for(StringBuilder s : sb) {
      bw.write(s.toString());
    }
    
    bw.flush();
    bw.close();
    br.close();
  }
}
*/
