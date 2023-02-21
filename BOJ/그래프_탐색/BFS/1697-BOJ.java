import java.io.*;
import java.util.*;
/*
 * 1697 숨바꼭질
 */
public class Main {
    static int[] checked;
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        checked = new int[100001]; // 0~100000
        if(N == K) {
        	System.out.println("0");
            return;
        }
        bfs(N, K);
        System.out.println(checked[K]);
    }
    public static void bfs(int N, int K) {
        Queue<Integer> que = new LinkedList<Integer>();
        checked[N] = 0;
        que.offer(N);
        while(!que.isEmpty()) {
        	int x = que.poll();
        	if(checked[K] != 0) break;
        	
        	if((x-1) >= 0 && checked[x-1] == 0) {
        		que.offer(x-1);
        		checked[x-1] = checked[x] + 1;
        	}
        	if((x+1) < checked.length && checked[x+1] == 0) {
        		que.offer(x+1);
        		checked[x+1] = checked[x] + 1;
        	}
        	if((x*2) < checked.length && checked[x*2] == 0) {
        		que.offer(x*2);
        		checked[x*2] = checked[x] + 1;
        	}
        }
    }
}
