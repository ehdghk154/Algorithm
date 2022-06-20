/*
 * 1924 2007년
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int month = Integer.parseInt(st.nextToken());
    int day = Integer.parseInt(st.nextToken());
    int sum = 0;
    int[] monMax = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] w = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    for(int i = 0; i < month-1; i++) {
      sum += monMax[i];
    }
    sum += day;
    System.out.println(w[sum%7]);
  }
}
