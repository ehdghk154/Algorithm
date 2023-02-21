/*
 * 9663 N-Queen
 */
import java.io.*;

public class Main {
  static int N, count;
  static int[] board;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    board = new int[N];
    /*
     * 1. 같은 행,열 불가
     * 2. 대각선 불가 -> abs(x1-x2) != abs(y1-y2)
     */
    count = 0;
    queen(0);
    
    
    System.out.print(count);
  }
  
  public static void queen(int depth) {
    
    if(depth == N) {
      count++;
      return;
    }
    
    for(int i = 0; i < N; i++) {
      board[depth] = i;
      // 해당 위치에 놓을 수 있으면 재귀 호출
      if(isPossible(depth)) {
        queen(depth + 1);
      }
    }
  }

  public static boolean isPossible(int depth) {
    // 놓을 수 있으면 true 없으면 false
    for(int i = 0; i < depth; i++) {
      if(board[depth] == board[i] || depth - i == Math.abs(board[depth] - board[i]))
        return false;
    }
    return true;
  }
}
