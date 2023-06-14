/**
 * 직사각형 별찍기 (Lv. 1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/12969
 */

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 열 개수
        int b = sc.nextInt(); // 행 개수
        for(int i = 0; i < b; i++) {
        	//"*"을 a만큼 반복
            System.out.println("*".repeat(a));
        }
    }
}