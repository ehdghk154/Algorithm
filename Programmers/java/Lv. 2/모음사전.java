/**
 * 모음사전(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/84512
 */

class Solution {
    static final String[] vowel = {"A","E","I","O","U"};
    static boolean flag = false; // 단어를 찾은 후 메소드 중단을 위한 flag
    static int count = 0; // 사전에서 단어의 번호
    public int solution(String word) {
        int answer = 0;
        
        dfs(word, "", 0);
        
        answer = count;
        
        return answer;
    }
    
    static void dfs(String ansWord, String curWord, int end) {
    	// 단어를 찾았다면 flag = true
        if(ansWord.equals(curWord)) flag = true;
        // 단어 길이 제한
        if(end == 5) return;
        
        String temp = curWord; // 현재 단어 저장
        for(int i = 0; i < 5; i++) {
            if(flag) return; // true이면 메소드 중단
            temp += vowel[i]; // 현재 단어에 i에 해당하는 모음 추가
            count++; // 단어 번호 증가
            //System.out.println(count+" temp: "+temp);
            dfs(ansWord, temp, end+1);
            temp = curWord; // 다시 현재 단어로 초기화
        }
    }
}