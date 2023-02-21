import java.io.*;
/*
 * 11719 그대로 출력하기2
 */
public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String out = br.readLine();
    
    while(out != null) {
      sb.append(out).append("\n");
      out = br.readLine();
    }
    
    System.out.println(sb);
  }
}
