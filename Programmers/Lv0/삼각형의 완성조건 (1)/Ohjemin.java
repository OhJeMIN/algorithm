import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        List<Integer> list = Arrays.stream(sides).boxed()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        
        return list.get(0) < list.get(1)+list.get(2) ? 1 : 2;
    }
}
