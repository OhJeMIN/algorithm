import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();
        for(int i=0;i<id_list.length;i++){
            String name = id_list[i];
            map.put(name,new HashSet<>());
            idxMap.put(name,i);
        }
        
        for(String rn : report){
            String[] reportName = rn.split(" ");
            String from = reportName[0];
            String to = reportName[1];
            map.get(to).add(from);
        }
        
        for(int i=0;i< id_list.length;i++){
            HashSet<String> reportEmail = map.get(id_list[i]);
            if(reportEmail.size() >=k){
                for(String name : reportEmail){
                    answer[idxMap.get(name)]++;
                }
            }
        }
        return answer;
    }
}
