import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        int[][] DP = new int[len][triangle[len-1].length];        
        DP[0][0] = triangle[0][0];
        DP[1][0] = triangle[0][0] + triangle[1][0];
        DP[1][1] = triangle[0][0] + triangle[1][1];
        for(int y=2;y<len;y++){
            DP[y][0] = triangle[y][0] + DP[y-1][0];
            DP[y][triangle[y].length-1] = triangle[y][triangle[y].length-1] + DP[y-1][triangle[y].length-2];
            for(int x=0;x<triangle[y].length;x++){                
                if(DP[y][x] == 0){
                    DP[y][x] = triangle[y][x] + Math.max(DP[y-1][x-1],DP[y-1][x]);
                }
            }            
        }
        Arrays.sort(DP[len-1]);        
        return DP[len-1][DP[len-1].length-1];
    }
}
