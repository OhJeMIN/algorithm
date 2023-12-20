import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list)
                                   .boxed()
                                   .collect(Collectors.toList());
        
        int back = list.get(list.size()-1);
        int front = list.get(list.size()-2);
        int result = (back > front) ? back-front : back*2;
        list.add(result);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
