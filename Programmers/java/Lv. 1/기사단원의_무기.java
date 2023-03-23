class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int result = 0;

        for(int i = 1; i <= number; i++) {
            result = dmg(i);
            if(result > limit) {
                answer += power;
            }else {
                answer += result;
            }
        }

        return answer;
    }

    static int dmg(int n) {
        int i = 2;
        int num = 1;
        int count = 0;
        while(true) {
            if(n == 1) {
                num *= count+1;
                break;
            }

            if(n % i == 0) {
                count++;
                n /= i;
            }else {
                num *= count+1;
                count = 0;
                i++;
            }
        }

        return num;
    }
}


/*
class Solution {
    public int solution(int number, int limit, int power) {
        int[] dmg = new int[number+1];
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= number / i; j++) {
                dmg[i*j]++;
            }
        }
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            if(dmg[i] > limit)
                answer += power;
            else
                answer += dmg[i];
        }
        
        
        return answer;
    }
}

*/