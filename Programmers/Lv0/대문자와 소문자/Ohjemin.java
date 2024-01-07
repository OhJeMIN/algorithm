import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            Character c = my_string.charAt(i);
            if(Character.isLowerCase(my_string.charAt(i))){
                answer+= Character.toUpperCase(c);
            }else{
                answer+= Character.toLowerCase(c);
            }
        }
        return answer;
    }
}
