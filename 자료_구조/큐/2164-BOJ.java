/*
 * 2164 카드2
 */
import java.io.*;
// 배열 인덱스를 이용한 풀이
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] q = new int[2*N];
    for(int i=1; i<=N; i++) {
      q[i] = i;
    }
    int prev_index = 1;
    int last_index = N;
    while(N-- > 1) {
      prev_index++; // 첫 번째 원소를 삭제하지 않고 인덱스가 가리키는 원소(첫 번째 원소)를 다음 원소로 변경
      q[last_index+1] = q[prev_index]; // 마지막 원소 뒤에 현재 첫 번째 원소 저장
      prev_index++; // 첫 번째 원소를 마지막으로 보냈으므로 인덱스 1 증가
      last_index++; // 마지막 원소가 추가되었으므로 인덱스 1 증가
    }
    
    // 마지막 남은 원소 출력
    System.out.print(q[prev_index]);
  }
}

/*
import java.io.*;
import java.util.*;
// 큐를 이용한 풀이
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Queue<Integer> q = new LinkedList<>();
    for(int i=1; i<=N; i++) {
      q.offer(i);
    }
    
    while(q.size() != 1) {
      q.poll();
      q.offer(q.poll());
    }
    
    System.out.print(q.poll());
  }
}
*/
