import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int tmp = 0;
        tmp += a % 2 != 0 ? 1 : 0;
        tmp += b % 2 != 0 ? 1 : 0;
        
        if(tmp ==2) answer = a*a + b*b;
        else if(tmp == 1) answer = 2*(a+b);
        else answer = Math.abs(a - b);
        return answer;
    }
}
