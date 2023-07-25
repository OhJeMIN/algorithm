import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        List<String> wantNum = new ArrayList<>();
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number[i];j++){
                wantNum.add(want[i]);
            }
        }
        for(int i=0;i<discount.length-10;i++){
            Deque<String> q = new ArrayDeque<>();
            for(int j=i;j<i+10;j++){
                q.add(discount[j]);
            }
            if(containsWant(wantNum,q)) answer++;
            q.clear();
        }
        return answer;
    }   
    public static boolean containsWant(List<String> wantNum, Deque<String> q){
        boolean flag = false;
        String poped = "";
        while(!q.isEmpty()){
            poped = q.poll();
            for(int i=0;i<wantNum.size();i++){
                if(wantNum.get(i).equals(poped)){
                    flag = true;
                }
            }
            if(!flag) return false;
        }        
        return true;
    }
}
