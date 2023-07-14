import java.util.*;
class Solution {
    static boolean[][] visited; 
    int solution(int[][] land) {
        int dy = land.length;
        int dx = land[0].length;       
        for(int i=1;i<dy;i++){            
            for(int j=0;j<dx;j++){
                land[i][j] += Math.max(Math.max(land[i-1][(j+1)%dx],land[i-1][(j+2)%dx]),land[i-1][(j+3)%dx]);
            }
        }
        Arrays.sort(land[dy-1]);
        return land[dy-1][dx-1];
    }
}
