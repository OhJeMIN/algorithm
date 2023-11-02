import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        boolean flag = num_list.length >= 11 ? true : false;
        return flag ? Arrays.stream(num_list).sum() : Arrays.stream(num_list).boxed().reduce(1, (a, b) -> a * b);
        
    }
}
