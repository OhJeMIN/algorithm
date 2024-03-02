import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = Arrays.stream(array).max().orElse(-1);  
        answer[0] = max;
        for(int i=0;i<array.length;i++){
            if(array[i] == max) answer[1] = i;
        }
        return answer;
    }
}
