import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] word = s.split("");
        int index = 0;
        for(String words : word){
            index = words.contains(" ") ? 0 : index+1;
            answer += index%2==0 ? words.toLowerCase() : words.toUpperCase();
        }
        return answer;
    }
}
