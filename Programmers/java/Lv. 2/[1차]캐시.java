/**
 * [1차]캐시(Lv. 2) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/17680
 */

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        // cacheSize가 0일 경우 모두 miss 판정
        if(cacheSize == 0) {
            return cities.length*5;
        }
        
        String[] save = new String[cacheSize]; // 캐시
        
        for(int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase(); // 대소문자 구분X
            for(int j = 0; j < cacheSize; j++) {
            	// 캐시 공간에 cities[i]가 있다면
                if(save[j].equals(cities[i])) {
                    while(j-- > 0) { // 0번부터 j-1번까지 한 칸 뒤로 이동
                        save[j+1] = save[j];
                    }
                    save[0] = cities[i]; // 0번에 cities[i] 입력
                    answer += 1; // cache hit이므로 1 추가
                    break;
                 // 캐시 공간에 cities[i]가 없다면
                }else if(j == cacheSize-1) {
                    while(j-- > 0) { // 0번부터 쭉 한 칸 뒤로 이동
                        save[j+1] = save[j];
                    }
                    save[0] = cities[i]; // 0번에 cities[i] 입력
                    answer += 5; // cache miss이므로 5 추가
                    break;
                }
            }
        }
        
        return answer;
    }
}