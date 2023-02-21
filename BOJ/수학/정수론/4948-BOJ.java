/*
 * 4948 베르트랑 공준
 */
import java.io.*;
// 미리 최대 범위까지 소수 개수를 구해놓고 값을 구하는 방식
public class Main {
  static int[] ans;
  static boolean[] checked;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    ans = new int[246913];
    checked = new boolean[246913];
    Prime();
    count();
    while(true) {
      int n = Integer.parseInt(br.readLine());
      
      if(n == 0)
        break;
      
      sb.append(ans[2*n] - ans[n]).append('\n');
    }
    
    System.out.print(sb);
  }
  
  static void Prime() {
    checked[1] = true;

    for(int i = 2; i*i <= checked.length; i++) {
      if(!checked[i]) { // 소수가 아닌 것들만 true체크, 소수는 변경없이 false로 유지
        for(int j=i*i; j < checked.length; j += i) { // i를 더하면 i의 배수이기 때문에 소수X
          checked[j] = true;
        }
      }
    }
  }
  
  static void count() {
    int count = 0;
    for(int i = 2; i < checked.length; i++) {
      if(!checked[i]) // false = 소수O, true = 소수X
        count++; // 소수일 경우 count 증가
      
      // i 까지의 소수 개수가 count 이므로
      // ans[i]에 count 저장
      ans[i] = count;
    }
  }
}

/*
import java.io.*;
// 범위의 모든 수마다 소수 개수를 구하는 방식
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringBuilder sb = new StringBuilder();
    int count = 0;
    while(true) {
      int n = Integer.parseInt(br.readLine());
      
      if(n == 0)
        break;
      
      for(int i=n+1; i <= 2*n; i++) {
        if(Prime(i)) {
          count++;
        }
      }
      
      sb.append(count).append('\n');
      count = 0;
    }
    
    System.out.print(sb);
  }
  
  static boolean Prime(int num) {
    if(num < 2)
      return false;

    // 시간복잡도 O(√N) √N번 조회
    for(int i = 2; i*i <= num; i++) {
      if(num%i == 0) {
        return false;
      }
    }
    return true;
  }
}
*/
