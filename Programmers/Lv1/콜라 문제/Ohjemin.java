import java.util.*;
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int drinked = n/a;
            answer += (drinked*b);
            n = n - drinked*a + drinked*b;
        }
        return answer;
    }
}
