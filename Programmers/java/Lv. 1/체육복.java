import java.util.Arrays;

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i++) {
        	for(int j = 0; j < reserve.length; j++) {
        		if(lost[i] == reserve[j]) {
        			lost[i] = reserve[j] = -1;
        		}
        	}
        }
        
        for(int i = 0; i < lost.length; i++) {
        	for(int j = 0; j < reserve.length; j++) {
        		if(lost[i] == reserve[j]-1) {
        			lost[i] = reserve[j] = -1;
        			break;
        		}else if(lost[i] == reserve[j]+1) {
        			lost[i] = reserve[j] = -1;
        			break;
        		}
        	}
        }
        for(int element : lost) {
        	if(element != -1) {
        		n--;
        	}
        }
        answer = n;
        
        return answer;
    }
}