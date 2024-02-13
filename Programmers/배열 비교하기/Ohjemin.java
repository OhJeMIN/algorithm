import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length == arr2.length){
            int sum1 = Arrays.stream(arr1).reduce(0, (a, b) -> a + b);
            int sum2 = Arrays.stream(arr2).reduce(0, (a, b) -> a + b);
            if(sum1 == sum2) answer = 0;
            else answer = sum1 > sum2 ? 1 : -1;
        }
        else answer = arr1.length > arr2.length ? 1 : -1;
        return answer;
    }
}
