/**
 * 5086 배수와 약수
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
 public static void main(String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   StringTokenizer st;
   StringBuilder sb = new StringBuilder();
   
   while(true) {
     st = new StringTokenizer(br.readLine());
     int a = Integer.parseInt(st.nextToken());
     int b = Integer.parseInt(st.nextToken());
     if(a == 0)
       break;
     
     if(a > b) {
       if(a%b == 0)
         sb.append("multiple");
       else
         sb.append("neither");
     }
     else {
       if(b%a == 0)
         sb.append("factor");
       else
         sb.append("neither");
     }
     sb.append("\n");
   }
   
   System.out.print(sb);
 }
}