/**
 * 2455 지능형 기차
 */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
 public static void main(String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   StringTokenizer st;
   int max = 0;
   int p = 0;
   for(int i = 0; i < 4; i++) {
     st = new StringTokenizer(br.readLine());
     int goff = Integer.parseInt(st.nextToken()); // 내린 사람 수
     int gon = Integer.parseInt(st.nextToken()); // 탄 사람 수
     p -= goff;
     p += gon;
     
     if(max < p) max = p;
   }
   
   System.out.print(max);
 }
}
