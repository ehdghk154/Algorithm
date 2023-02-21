/**
 * 15686 치킨 배달
 */
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Point {
  int x;
  int y;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
public class Main {
  static int N, M;
  static ArrayList<Point> house; // 집 좌표
  static ArrayList<Point> chicken; // 치킨집 좌표
  static boolean[] isOpen; // 치킨집 오픈판단
  static int answer = Integer.MAX_VALUE;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    
    house = new ArrayList<>();
    chicken = new ArrayList<>();
    
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < N; j++) {
        int num = Integer.parseInt(st.nextToken());
        if(num == 1)
          house.add(new Point(i, j));
        else if(num == 2)
          chicken.add(new Point(i, j));
      }
    }
    isOpen = new boolean[chicken.size()];
    
    dfs(0, 0);
    
    System.out.println(answer);
  }
  
  public static void dfs(int start, int count) {
    if(count == M) { // 오픈한 치킨집이 M개일 경우
      int result = 0;
      
      for(int i = 0; i < house.size(); i++) {
        int temp = Integer.MAX_VALUE;
        
        for(int j = 0; j < chicken.size(); j++) {
          if(isOpen[j]) {
            int distance = Math.abs(house.get(i).x - chicken.get(j).x)
                           + Math.abs(house.get(i).y - chicken.get(j).y);
            temp = Math.min(temp, distance); // 집에서 가장 가까운 치킨집 찾기
          }
        }
        result += temp; // 가장 가까운 치킨집 거리 더하기
      }
      answer = Math.min(answer, result); // M개의 치킨집으로 이루어진 가장 작은 치킨 거리
      return;
    }
    
    // 백트래킹
    // M개의 치킨집이 열렸을 경우에 그 이상 열지 않고 계산하기 위함
    for(int i = start; i < chicken.size(); i++) {
      isOpen[i] = true;
      dfs(i+1, count+1);
      isOpen[i] = false;
    }
  }
}