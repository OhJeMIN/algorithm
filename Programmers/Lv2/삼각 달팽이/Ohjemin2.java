import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int[][] arr = new int[n][n];
        int x=-1,y=0,num=1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { 	
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                arr[x][y] = num++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int[] a :arr){
            for(int i=0;i<a.length;i++){
                if(a[i] != 0) list.add(a[i]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
