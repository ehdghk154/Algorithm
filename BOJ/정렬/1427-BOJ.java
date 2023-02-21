/*
 * 1427 소트인사이드
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// 직접 숫자 값을 정렬하여 출력
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    Integer[] nums = new Integer[s.length()];
    for(int i=0; i<s.length(); i++) {
      nums[i] = (int)s.charAt(i)-48;
    }
    Arrays.sort(nums, Collections.reverseOrder());
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<nums.length; i++)
      sb.append(nums[i]);
    System.out.print(sb);
  }
}
/* 인덱스를 이용하여 출력
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int[] nums = new int[10];
    for(int i=0; i<s.length(); i++) {
      nums[s.charAt(i)-'0']++;
    }
    
    StringBuilder sb = new StringBuilder();
    for(int i=9; i>=0; i--) {
      while(nums[i] > 0) {
        sb.append(i);
        nums[i]--;
      }
    }
      
    System.out.print(sb);
  }
}
*/
