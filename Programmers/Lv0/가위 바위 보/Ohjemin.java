import java.util.*;
class Solution {
    public String solution(String rsp) {
        String answer = "";
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(2, 0);
        map.put(0, 5);
        map.put(5 ,2);
        
        for(int i=0;i<rsp.length();i++){
            String s = rsp.substring(i,i+1);
            answer += map.get(Integer.parseInt(s));
        }
        return answer;
    }
}
