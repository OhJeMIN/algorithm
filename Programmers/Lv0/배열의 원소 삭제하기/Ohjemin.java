import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = Arrays.stream(arr)
                                   .boxed()
                                   .collect(Collectors.toList());
        for(int a : delete_list){
            for(int i=0;i<list.size();i++){
                if(list.get(i) == a) list.remove(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
