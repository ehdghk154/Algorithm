/*
 * 6603 �ζ�
 */
import java.io.*;
import java.util.*;

public class Main {
  static int[] S, lt;
  static int k;
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    while(true) {
      st = new StringTokenizer(br.readLine());
      k = Integer.parseInt(st.nextToken()); // ���� S�� ������ ����
      S = new int[k]; // ���� S
      lt = new int[6]; // ������ �ζ� ��ȣ
      if(k == 0)  break; // 0 �Է� �� ����
      
      for(int i = 0; i < k; i++) {
        S[i] = Integer.parseInt(st.nextToken());
      }
      
      lotto(0, 0);
      
      sb.append("\n");
    }
    
    System.out.print(sb);
  }
  
  public static void lotto(int num, int count) {
    if(count == 6) { // �ζ� ��ȣ�� 6�� ����������
      for(int i = 0; i < 6; i++) // ������ 6�� �ζ� ��ȣ ���
        sb.append(lt[i]).append(" ");
      sb.append("\n");
      
      return;
    }
    
    for(int i = num+1; i <= k; i++) {
      lt[count] = S[i-1]; // ������ �ζ� ��ȣ�� ���� S�� ��ȣ�� ����� ������� ��� ��� �Է�
      lotto(i, count+1); // ���� �ζ� ��ȣ ����
    }
  }
}