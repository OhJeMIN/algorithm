import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<want.length;i++){
            map.put(want[i],number[i]);
        }
        for(int i=0;i<discount.length-9;i++){
            HashMap<String, Integer> mapChk = new HashMap<>();
            for(int j=i;j<10+i;j++){
                mapChk.put(discount[j],mapChk.getOrDefault(discount[j],0)+1);
            }
            boolean Flag = true;
            for(String key : map.keySet()){
                if(map.get(key) != mapChk.get(key)){
                    Flag = false;
                    break;
                }
            }
            answer += Flag ? 1 : 0;
        }
        return answer;
    }
}
