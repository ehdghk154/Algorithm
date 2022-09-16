/*
 * 2217 ����
 */
import java.io.*;
import java.util.Arrays;
// �迭 ���� �� �� ��� ���
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); 
    int[] weight = new int[N];
    int max = 0;
    for(int i = 0; i < N; i++) {
      weight[i] = Integer.parseInt(br.readLine());
    }
    
    Arrays.sort(weight);
    
    for(int i = 0; i < N; i++) {
      int maxW = weight[i] * (N-i);
      
      max = Math.max(max, maxW);
    }
    
    System.out.print(max);
  }
}

/*
import java.io.*;
// �迭�� �ε����� �̿��� ���
 
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); 
    int[] weight = new int[10001];
    int max = 0;
    for(int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());
      weight[num]++;
      max = Math.max(max, num);
    }
    
    for(int i = max, j = 0; i > 0; i--) {
      j += weight[i];
      int maxW = i*j;
      
      max = Math.max(max, maxW);
    }
    
    System.out.print(max);
  }
} 
 */
