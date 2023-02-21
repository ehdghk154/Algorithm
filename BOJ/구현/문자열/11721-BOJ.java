/*
 * 11721 열 개씩 끊어 출력하기
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String word = br.readLine();
    if(word.length() <= 10) {
      System.out.print(word);
    }else {
      while(true) {
        if(word.length() > 10) {
          sb.append(word.substring(0, 10)).append("\n");
          word = word.substring(10);
        }
        else {
          sb.append(word).append("\n");
          break;
        }
      }
      System.out.print(sb);
    }
  }
}
