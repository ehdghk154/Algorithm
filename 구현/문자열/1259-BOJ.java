/*
 * 1259 ÆÓ¸°µå·Ò¼ö
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    while(true) {
      String num = br.readLine();
      String ans = "yes";
      
      if(Integer.parseInt(num) == 0) break;
      
      for(int i = 0; i < num.length()/2; i++) {
        if(num.charAt(i) != num.charAt(num.length()-i-1)) {
          ans = "no";
          break;
        }
      }
      
      System.out.println(ans);
    }
  }
}