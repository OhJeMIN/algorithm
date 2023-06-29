import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        List<Integer> result = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Arrays.sort(arr);
        result.remove(result.indexOf(arr[0]));
        return result.stream().mapToInt(x->x).toArray();
    }
}
