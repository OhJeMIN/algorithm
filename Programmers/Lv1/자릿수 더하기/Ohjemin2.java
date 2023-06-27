import java.util.*;
public class Solution {
    public int solution(int n) {
        int answer = 0;
        String sN = Integer.toString(n);
        String[] arr = sN.split("");
        for(String num : arr){
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}
