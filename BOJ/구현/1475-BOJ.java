/*
 * 1475 ¹æ ¹øÈ£
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine();
    int[] num = new int[10];
    int max = 0;
    int maxNum = 0;
    for(int i = 0; i < N.length(); i++) {
      int n = N.charAt(i) - '0';
      num[n]++;
      if(n != 6 && n != 9 && max < num[n]) {
        max = num[n];
        maxNum = n;
      }
    }
    double sn = Math.ceil((float)(num[9]+num[6])/2);
    if(sn <= num[maxNum]) {
      System.out.print(num[maxNum]);
    }else {
      System.out.print((int)sn);
    }
  }
}
