import java.util.*;
class Solution {
    public int solution(int n) {
        String triangulation = Integer.toString(n,3); // String 형식으로 3진법 전환
        String reverse_triangulation = "";
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<triangulation.length();i++){
            st.push(triangulation.charAt(i));            
        }
        int stackSize = st.size();
        for(int i=0;i<stackSize;i++){
            reverse_triangulation +=st.pop();
        }        
        return Integer.parseInt(reverse_triangulation,3); // 10진법 int 형으로 변환
    }
}
