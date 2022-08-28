/*
 * 1541 잃어버린 괄호
 */
import java.io.*;
import java.util.*;
// ArrayList를 사용하여 좀 더 깔끔하게 푼 풀이
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String exp = br.readLine();
    ArrayList<Integer> num = new ArrayList<>();
    ArrayList<Character> sign = new ArrayList<>();
    
    for(int i = 0; i < exp.length(); i++) {
      if(exp.charAt(i) == '-' || exp.charAt(i) == '+') {
        num.add(Integer.parseInt(sb.toString()));
        sign.add(exp.charAt(i));
        sb.delete(0, i);
      }else {
        sb.append(exp.charAt(i));
      }
    }
    num.add(Integer.parseInt(sb.toString()));
    
    for(int i = 0; i < sign.size(); i++) {
      if(sign.get(i) == '+') {
        int sum = num.get(i) + num.get(i+1);
        num.remove(i); // 더한 두 개의 값 제거
        num.remove(i);
        num.add(i, sum); // 현재 인덱스에 합한 값 추가하여 자리 유지
        sign.remove(i); // 사용한 '+' 기호 제거
        i--;
      }
    }
    //'-' 기호만 남았으므로 처음 값에 나머지 값들 빼기
    int dif = num.get(0);
    for(int i = 1; i < num.size(); i++) {
      dif -= num.get(i);
    }
    System.out.print(dif);
  }
}

/* 무식하게 문제의 조건만 보고 하나씩 맞춰가면서 푼 풀이
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String exp = br.readLine();
    int[] num = new int[(exp.length()/2)+1];
    boolean check1 = false, check2 = false;
    int j = 0;
    int cal = 0;
    int save = 0;
    boolean end = true;
    for(int i = 0; i < exp.length(); i++) {
      if(exp.charAt(i) == '-') {
        num[j] = Integer.parseInt(sb.toString());
        if(!check1) {
          cal += num[j];
        }else if(check2) {
          save += num[j];
          check2 = false;
        }else {
          cal -= num[j];
        }
        end = false;
        check1 = true;
        sb.delete(0, i);
        j++;
      }else if(exp.charAt(i) == '+'){
        num[j] = Integer.parseInt(sb.toString());
        if(check1) {
          save += num[j];
          check2 = true;
        }else {
          cal += num[j];
        }
        end = true;
        sb.delete(0, i);
        j++;
      }else {
        sb.append(exp.charAt(i));
      }
    }
    num[j] = Integer.parseInt(sb.toString());
    if(check2)
      save += num[j];
    else if(!end)
      cal -= num[j];
    else
      cal += num[j];
    
    cal -= save;
    System.out.print(cal);
  }
}
*/
