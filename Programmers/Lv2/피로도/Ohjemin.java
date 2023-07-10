import java.util.*;
class Solution {
    public int solution(int k, int[][] dungeons) {        
        int answer = 0;
        List<Integer> answerList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Integer> q = new ArrayDeque<>();
        for(int[] arr : dungeons){
            map.put(arr[0], arr[1]);
            q.add(arr[0]);
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        int Min = keySet.get(0);
        int idx = 0;
        while(true){
            System.out.println("q == " + q);
            int tmp = q.peek();
            System.out.println("tmp == " + tmp);
            if(q.isEmpty()) break;
            if(Min > tmp) {
                q.poll();
                answerList.add(answer);
                System.out.println(answer);
            }
            if(k >= tmp){
                q.poll();
                k -= map.get(tmp);
                System.out.println("k == " + k);
                answer++;
                q.add(k);
            }
            else{
                q.poll();
            }
            if(idx == 2) break;
            idx++;
        }
        System.out.println("q i == " + q);
        System.out.println(answerList);
        return answer;
    }
}
