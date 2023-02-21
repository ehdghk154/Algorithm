/**
 * 5086 배수와 약수
 */
import java.io.*;
import java.util.StringTokenizer;
// for문을 통한 거듭제곱의 나머지 (수학)
public class Main {
 public static void main(String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   StringTokenizer st;
   StringBuilder sb = new StringBuilder();
   int T = Integer.parseInt(br.readLine());
   
   for(int i = 0; i < T; i++) {
     st = new StringTokenizer(br.readLine());
     int a = Integer.parseInt(st.nextToken());
     int b = Integer.parseInt(st.nextToken());
     
     int com = 1;
     for(int j = 0; j < b; j++) {
       com *= a;
       com %= 10;
     }
     
     if(com == 0)
       com = 10;
     
     sb.append(com).append("\n");
   }
   
   System.out.print(sb);
 }
}
/** 거듭 제곱의 첫째 자리 수가 반복되는 것을 이용한 풀이 (구현)
import java.io.*;
import java.util.StringTokenizer;

public class Main {
 public static void main(String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   StringTokenizer st;
   StringBuilder sb = new StringBuilder();
   int T = Integer.parseInt(br.readLine());
   
   for(int i = 0; i < T; i++) {
     st = new StringTokenizer(br.readLine());
     String temp = st.nextToken();
     int b = Integer.parseInt(st.nextToken());
     int a = temp.charAt(temp.length()-1) - '0';
     
     if(a == 0) {
       sb.append(10).append("\n");
     }
     else if(a == 1 || a == 5 || a == 6) {
       sb.append(a).append("\n");
     }
     else if(a == 2) {
       if(b%4 == 0)
         sb.append(6).append("\n");
       else if(b%4 == 1)
         sb.append(2).append("\n");
       else if(b%4 == 2)
         sb.append(4).append("\n");
       else if(b%4 == 3)
         sb.append(8).append("\n");
     }
     else if(a == 3) {
       if(b%4 == 0)
         sb.append(1).append("\n");
       else if(b%4 == 1)
         sb.append(3).append("\n");
       else if(b%4 == 2)
         sb.append(9).append("\n");
       else if(b%4 == 3)
         sb.append(7).append("\n");
     }
     else if(a == 7) {
       if(b%4 == 0)
         sb.append(1).append("\n");
       else if(b%4 == 1)
         sb.append(7).append("\n");
       else if(b%4 == 2)
         sb.append(9).append("\n");
       else if(b%4 == 3)
         sb.append(3).append("\n");
     }
     else if(a == 8) {
       if(b%4 == 0)
         sb.append(6).append("\n");
       else if(b%4 == 1)
         sb.append(8).append("\n");
       else if(b%4 == 2)
         sb.append(4).append("\n");
       else if(b%4 == 3)
         sb.append(2).append("\n");
     }
     else if(a == 4) {
       if(b%2 == 0)
         sb.append(6).append("\n");
       else
         sb.append(4).append("\n");
     }
     else if(a == 9) {
       if(b%2 == 0)
         sb.append(1).append("\n");
       else
         sb.append(9).append("\n");
     }
   }
   
   System.out.print(sb);
 }
}
 */