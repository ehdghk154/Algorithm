/*
 * 1026 보물
 */
import java.io.*;
import java.util.*;
// B를 정렬하지 않은 풀이
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    int[] A = new int[N];
    int[] B = new int[N];
    int sum = 0;
    int index = 0;
    boolean[] checked = new boolean[N];
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(A);
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++) {
      B[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 0; i < N; i++) {
      int max = 0; 
      
      for(int j = 0; j < N; j++) {
        if(max < B[j] && !checked[j]) {
          max = B[j];
          index = j;
        }
      }
      
      checked[index] = true;
      sum += A[i]*max;
    }
    
    System.out.print(sum);
  }
}

/* B를 정렬한 풀이
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    int[] A = new int[N];
    int[] B = new int[N];
    int sum = 0;
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++) {
      B[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(A);
    Arrays.sort(B);
    
    for(int i = 0; i < N; i++) {
      sum += A[i]*B[N-1-i];
    }
    
    System.out.print(sum);
  }
}
*/
