/**
 * 1620 나는야 포켓몬 마스터 이다솜
 */
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    String[] nameBook = new String[N];
    HashMap<String, Integer> numBookMap = new HashMap<>();
    
    for(int i = 0; i < N; i++) {
      nameBook[i] = br.readLine();
      numBookMap.put(nameBook[i], i);
    }
    
    for(int i = 0; i < M; i++) {
      String quiz = br.readLine();
      if(quiz.charAt(0) <= 57) { // 번호로 포켓몬이름 출력
        bw.write(nameBook[Integer.parseInt(quiz)-1]);
        bw.newLine();
      } else { // 포켓몬이름으로 번호 출력
        bw.write(String.valueOf(numBookMap.get(quiz)+1));
        bw.newLine();
      }
    }
    bw.flush();
    bw.close();
  }
}