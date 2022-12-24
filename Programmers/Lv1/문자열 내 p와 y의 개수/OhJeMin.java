
import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int Pnum =0, Ynum = 0;
        Stack<String> stack = new Stack<>();
        String[] strArray = s.toLowerCase().split("");        
        for(int i = 0; i< s.length(); i++){            
            stack.push(strArray[i]);
        }
        for(int i = 0; i < s.length(); i++){  
            String popedFromStack = stack.pop();
            if(popedFromStack.equals("p"))Pnum +=1;
            else if(popedFromStack.equals("y"))Ynum +=1;
        }
        if(Ynum != Pnum) answer = false;
        return answer;
    }
}
