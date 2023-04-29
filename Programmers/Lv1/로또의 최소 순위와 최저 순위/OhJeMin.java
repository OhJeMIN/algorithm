import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correctNum = 0;
        int undefinedNum = 0;
        List<Integer> winNum = new ArrayList<Integer>();
        for(int num : win_nums) winNum.add(num);        
        for(int lotto : lottos){
            if(winNum.contains(lotto)) correctNum++;
            if(lotto == 0) undefinedNum ++;
        }
        answer[0] = lottoWin(correctNum+undefinedNum);
        answer[1] = lottoWin(correctNum);
        return answer;
    }
    public static int lottoWin(int num){
        if(num == 6) return 1;
        else if(num == 5) return 2;
        else if(num == 4) return 3;
        else if(num == 3) return 4;
        else if(num == 2) return 5;
        else return 6;
    }
}
