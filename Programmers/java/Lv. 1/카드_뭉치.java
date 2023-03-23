class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0, idx2 = 0;
        boolean checked = true;
        for(int i = 0; i < goal.length; i++) {
            if(idx1 < cards1.length && goal[i].equals(cards1[idx1])) {
                idx1++;
            }else if(idx2 < cards2.length && goal[i].equals(cards2[idx2])) {
                idx2++;
            }else {
                checked = false;
                break;
            }
        }

        if(!checked) {
            answer = "No";
        }
        
        return answer;
    }
}