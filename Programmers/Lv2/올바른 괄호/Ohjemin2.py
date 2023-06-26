import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                if(!st.isEmpty()) st.pop();
                else answer = false;
            }
            else{
                st.push('(');
            }
        }
        if(st.size() != 0){
            answer = false;
        }
        return answer;
    }
}
