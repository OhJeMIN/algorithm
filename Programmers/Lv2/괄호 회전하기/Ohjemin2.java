import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<String> q = new ArrayDeque<>();
        String[] arr = s.split("");
        for(String i : arr) q.add(i);
        for(int i=0;i<s.length();i++){                      
            if(rotate(q)) answer++;
            q.add(q.poll());
        }
        return answer;
    }
    public static boolean rotate(Deque<String> q){
        String tmp = String.join("",q);  
        while(true){
            if(tmp.contains("()")) tmp = tmp.replace("()","");
            else if(tmp.contains("[]")) tmp = tmp.replace("[]","");
            else if(tmp.contains("{}")) tmp = tmp.replace("{}","");
            else return tmp.length() == 0 ? true : false;
        }
    }
}
