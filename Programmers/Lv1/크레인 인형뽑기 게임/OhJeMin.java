
import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int s : moves){             
            for(int j=0; j< board.length; j++){
                if(board[j][s-1] !=0){
                    if(st.peek() == board[j][s-1]){
                        st.pop();
                        answer +=2;
                    }
                    else st.push(board[j][s-1]);
                    board[j][s-1] = 0;
                    break;
                }                    
            }
            
        }
        return answer;
    }
}
