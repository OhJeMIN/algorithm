import java.util.*;
class Solution {
    public long solution(long n) {
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String strAnswer = "";
        for(String string : str) strAnswer += string;
        
        return Long.parseLong(strAnswer);
        
    }
}
