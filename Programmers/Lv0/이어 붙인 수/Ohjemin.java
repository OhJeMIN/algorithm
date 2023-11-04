import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] num_list) {
        return Integer.parseInt(Arrays.stream(num_list).filter(i -> (i % 2 != 0)).mapToObj(i->String.valueOf(i)).collect(Collectors.joining())) 
            + Integer.parseInt(Arrays.stream(num_list).filter(i -> (i % 2 == 0)).mapToObj(i->String.valueOf(i)).collect(Collectors.joining()));
    }
}
