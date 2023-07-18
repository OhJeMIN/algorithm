import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<name.length;i++){
            map.put(name[i],yearning[i]);
        }
        for(String[] p : photo){
            int sum = 0;
            for(String s : p){
                if(map.getOrDefault(s,0)>0) sum+=map.get(s);
            }
            answer.add(sum);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
