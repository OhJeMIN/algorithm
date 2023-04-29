import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> dq = new ArrayDeque<>();
        int index = 0;
        for(int i : arr){
            if(dq.isEmpty()) dq.add(i);
            else{
               if(dq.peekLast() != i) dq.add(i);  
            }                       
        }
        int dqSize = dq.size();
        int[] answer = new int[dqSize];        
        for(int i=0;i<dqSize;i++){
            answer[i] = dq.poll();
        }
        return answer;
    }
}
