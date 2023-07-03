import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(String s : strings) list.add(s.charAt(n)+s);
        Collections.sort(list);
        answer = new String[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i).substring(1,list.get(i).length());
        }
        
        return answer;
    }
}
