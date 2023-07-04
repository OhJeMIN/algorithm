import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<String> q = new ArrayDeque<>();
        Deque<String> rotatedQ = new ArrayDeque<>();
        String[] arr = s.split("");
        for(String i : arr) q.add(i);
        for(int i=0;i<s.length();i++){
            for(int j =0;j<s.length();j++){
                String tmp = q.poll();
                if(rotatedQ.isEmpty()) rotatedQ.add(tmp);                
                else{
                    if(tmp.equals("]") && rotatedQ.peekLast().equals("[")) rotatedQ.pollLast();
                    else if(tmp.equals("}") && rotatedQ.peekLast().equals("{")) rotatedQ.pollLast();
                    else if(tmp.equals(")") && rotatedQ.peekLast().equals("(")) rotatedQ.pollLast();
                    else rotatedQ.add(tmp);
                }
                q.add(tmp);
            }
            q.add(q.poll());
            if(rotatedQ.isEmpty()) answer ++;
            rotatedQ.clear();
        }
        return answer;
    }
}
