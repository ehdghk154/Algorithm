/*
 * 10773 제로
 */
// 배열을 이용한 방법
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int K = Integer.parseInt(br.readLine());
    int[] nums = new int[K];
    int sum = 0;
    int point = 0;
    
    for(int i=0; i<K; i++) {
      int num = Integer.parseInt(br.readLine());
      if(num == 0) {
        point--;
      }else {
        nums[point] = num;
        point++;
      }
    }
    
    for(int i=0; i<point; i++) {
      sum += nums[i];
    }
    
    System.out.println(sum);
  }
}

/* 
// Stack 클래스를 이용한 방법
import java.io.*;
import java.util.*;

public class Main {
  static int sum = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int K = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    
    for(int i=0; i<K; i++) {
      int num = Integer.parseInt(br.readLine());
      if(num == 0) {
        stack.pop();
      }else {
        stack.push(num);
      }
    }
    //람다 안이 anonymous inner class(익명 내부 클래스)이기 때문에 자바 컴파일러가
    //e -> e과 같이 파라미터로 사용하는 변수와 로컬 변수를 구분을 하지 못하므로
    //클래스 단에서 sum을 선언하여 사용
    stack.forEach((e) -> {
      sum += e;
    });
    
    System.out.println(sum);
  }
}
*/
