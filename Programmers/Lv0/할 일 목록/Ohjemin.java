import java.util.*;
import java.util.stream.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0;i<finished.length;i++){
            if(!finished[i]){
                answer.add(todo_list[i]);
            }
        }
        String[] result = new String[answer.size()];
        for(int i=0;i<answer.size();i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}
