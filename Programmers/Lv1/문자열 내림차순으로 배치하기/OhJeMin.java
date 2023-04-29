import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            list.add(c);
        }
        Collections.sort(list, Collections.reverseOrder());
        for(char c : list){
            answer += c;
        }
        return answer;
    }
}
