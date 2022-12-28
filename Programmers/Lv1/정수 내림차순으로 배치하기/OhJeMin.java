import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String strAnswer = "";
        for(String string : str) strAnswer += string;
        
        answer = Long.parseLong(strAnswer);
        return answer;
    }
}
