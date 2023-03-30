import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        PriorityQueue<Integer> pqlux = new PriorityQueue<>();
        PriorityQueue<Integer> pqluy = new PriorityQueue<>();
        PriorityQueue<Integer> pqrdx = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqrdy = new PriorityQueue<>(Collections.reverseOrder());
        String y = wallpaper[0];
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j< y.length();j++){
                if(wallpaper[i].charAt(j) == '#'){
                    pqlux.add(i);
                    pqluy.add(j);
                    pqrdx.add(i+1);
                    pqrdy.add(j+1);
                }
            }
        }
        int[] answer = new int[4];
        answer[0] = pqlux.poll();
        answer[1] = pqluy.poll();
        answer[2] = pqrdx.poll();
        answer[3] = pqrdy.poll();
        return answer;
    }
}
