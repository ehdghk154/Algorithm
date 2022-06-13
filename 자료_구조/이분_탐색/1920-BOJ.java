import java.io.*;
import java.util.*;
/*
 * 1920 수 찾기
 */
public class Main {
  private static int[] A;
  
  static int binarySearch(int key, int low, int high) {
    int mid;
    
    if(low <= high) {
      mid = (low+high)/2;
      
      if(key == A[mid]) {
        return 1;
      }else if(key < A[mid]) {
        return binarySearch(key, low, mid-1);
      }else {
        return binarySearch(key, mid+1, high);
      }
    }
    return 0;
  }
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    int N = Integer.parseInt(br.readLine());
    A = new int[N];
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(A);
    StringBuilder sb = new StringBuilder();
    int M = Integer.parseInt(br.readLine());
    int[] B = new int[M];
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<M; i++) {
      B[i] = Integer.parseInt(st.nextToken());
      sb.append(binarySearch(B[i], 0, N-1)).append("\n");
    }
    System.out.println(sb);
  }
}
