/*
 * 5543 상근날드
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int burger = 2000;
    int drink = 2000;
    
    for(int i = 0; i < 3; i++) {
      int menu = Integer.parseInt(br.readLine());
      burger = burger > menu ? menu : burger;
    }
    
    for(int i = 3; i < 5; i++) {
      int menu = Integer.parseInt(br.readLine());
      drink = drink > menu ? menu : drink;
    }
    
    System.out.print(burger + drink - 50);
  }
}
