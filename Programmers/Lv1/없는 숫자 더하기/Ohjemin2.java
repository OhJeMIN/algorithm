import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> number = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        for(int i=0;i<10;i++) if(!number.contains(i)) answer +=i;        
        return answer;
    }
}
