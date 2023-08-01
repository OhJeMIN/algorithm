import java.util.*;
class Solution {
    static int[][] arr;
    public int[] solution(int n) {
        int[] answer = {};
        arr = new int[n][n];
        arr[0][0] = 1;
        fillIN(n,arr[0][0]);
        for(int[] a : arr){
             System.out.println(Arrays.toString(a));
        }
        return answer;
    }
    public static void fillIN(int n,int start){
        for(int i=1;i<n;i++) {
            arr[i][0] = ++start;
        }        
        for(int j=1;j<n;j++) arr[n-1][j] = arr[n-1][j-1]+1;        
        for(int k=n-1;0<k;k--){
            if(arr[n-2][k-1] > 0) break;
            arr[n-2][k-1] = arr[n-1][k] +1;
            n--;
        }
        return;
    }
}
