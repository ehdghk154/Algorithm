/*
 * 2447 별 찍기 - 10
 */
import java.io.*;
import java.util.*;

public class Main {
  static char[][] arr;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    //StringBuilder sb = new StringBuilder();
    arr = new char[N][N];
    
    star(N, 0, 0, false);
    
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        bw.write(arr[i][j]);
        //sb.append(arr[i][j]);
      }
      bw.write('\n');
      //sb.append('\n');
    }
    
    //System.out.print(sb);
    bw.flush();
    bw.close();
  }
  
  public static void star(int N, int a, int b, boolean blank) {
    // 공백칸일 경우
    if(blank) {
      for(int i = a; i < a+N; i++) {
        for(int j = b; j < b+N; j++) {
          arr[i][j] = ' ';
        }
      }
      return;
    }
    
    //최소 블록칸 일 경우
    if(N == 1) {
      arr[a][b] = '*';
      return;
    }
    
    /* 
    N=27 일 경우 한 블록의 사이즈는 9이고,
    N=9 일 경우 한 블록의 사이즈는 3이듯
    해당 블록의 한 칸을 담을 변수를 의미 size
      
    count 는 별 출력 누적 합을 의미하는 변수다.
    -Stranger's LAB 블로그-
    */
    
    int size = N/3;
    int count = 0;
    for(int i = a; i < a + N; i += size) {
      for(int j = b; j < b + N; j += size) {
        count++;
        
        if(count == 5)
          star(size, i, j, true);
        else
          star(size, i, j, false);
      }
    }
  }
}
