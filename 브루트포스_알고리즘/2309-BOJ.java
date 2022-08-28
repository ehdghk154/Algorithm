/*
 * 2309 일곱 난쟁이
 */
import java.io.*;
import java.util.*;

public class Main {
  static int sum = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] nums = new int[9];
    int sum = 0;
    
    for(int i = 0; i < 9; i++) {
      nums[i] = Integer.parseInt(br.readLine());
      sum += nums[i];
    }
    Arrays.sort(nums);
    
    loopOut:
    for(int i = 0; i < 8; i++) {
      for(int j = i+1; j < 9; j++) {
        if(nums[i] + nums[j] == sum - 100) {
          for(int k = 0; k < 9; k++) {
            if(k != i && k != j)
              sb.append(nums[k]).append("\n");
          }
          break loopOut;
        }
      }
    }
    
    System.out.println(sb);
  }
}
