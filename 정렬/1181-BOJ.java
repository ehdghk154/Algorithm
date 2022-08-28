/*
 * 1181 단어 정렬
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] words = new String[N];
    
    for(int i=0; i<N; i++) {
      words[i] = br.readLine();
    }
    
    Arrays.sort(words, (s1, s2) -> {
      if(s1.length() == s2.length())
        return s1.compareTo(s2);
      else
        return s1.length() - s2.length();
    });
    
    StringBuilder sb = new StringBuilder();
    sb.append(words[0]).append("\n");
    
    for(int i=1; i<N; i++)
      if(!words[i].equals(words[i-1]))
        sb.append(words[i]).append("\n");
    
    System.out.println(sb);
  }
}
