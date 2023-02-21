/*
 * 3053 택시 기하학
 */
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int R = Integer.parseInt(br.readLine());
    double euclide = Math.pow(R,2)*Math.PI;
    double taxi = Math.pow(R,2)*2;
    
    System.out.println(Math.round(euclide*1000000)/1000000.0);
    System.out.println(taxi);
  }
}
