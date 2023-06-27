import java.util.*;
class Solution {
    public int[] solution(long n) {        
        String sN = Long.toString(n);
        String[] arr = sN.split("");
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<sN.length();i++){
            st.push(Integer.parseInt(arr[i]));
        }
        int size = st.size();
        int[] answer = new int[size];
        for(int i=0;i<size;i++){
            answer[i] = st.pop();
        }
        return answer;
    }
}
