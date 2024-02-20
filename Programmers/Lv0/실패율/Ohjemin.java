import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        double[] result = new double[N];
        List<Integer> list = Arrays.stream(stages).boxed().collect(Collectors.toList());
        int len = stages.length;        
        Map<Integer, Double> map = new HashMap<>();
        for(int i=1;i<=N;i++){
            int fail = Collections.frequency(list, i);
            double failRate = len > 0 ? (double) fail / len : 0;
            map.put(i, failRate);
            len -= fail;
        }
        int[] answer = map.entrySet().stream()
                          .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed()
                                   .thenComparing(Map.Entry.comparingByKey()))
                          .mapToInt(Map.Entry::getKey)
                          .toArray();
        return answer;
    }
}
