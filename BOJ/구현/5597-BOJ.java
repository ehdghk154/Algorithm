/**
 * 5597 과제 안 내신 분..?
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] studentNumber = new int[31];
    for(int i = 0; i < 28; i++) {
      studentNumber[Integer.parseInt(br.readLine())]++;
    }
    
    for(int i = 1; i <= 30; i++) {
      if(studentNumber[i] < 1)
        System.out.println(i);
    }
  }
}