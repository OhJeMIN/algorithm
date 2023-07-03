import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int N = numbers.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                int tmp = numbers[i] + numbers[j];
                if(list.contains(tmp)) continue;
                else list.add(tmp);
            }
        }
        return list.stream().mapToInt(x -> x).sorted().toArray();
    }
}
