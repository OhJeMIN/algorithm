import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] dp = new int[sizes.length][2];
        for(int i=0;i<sizes.length;i++){
            int first = sizes[i][0];
            int second = sizes[i][1];
            dp[i][0] = first > second ? first : second;
            dp[i][1] = first > second ? second : first;
        }
        int maxX = dp[0][0];
        int maxY = dp[0][1];
        for(int i=1;i<dp.length;i++){            
            if(maxX < dp[i][0]) maxX = dp[i][0];
            if(maxY < dp[i][1]) maxY = dp[i][1];
        }
        return maxX*maxY;
    }
}
