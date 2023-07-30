import java.util.*;
class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = {};
        String[][] repArr = new String[arr.length][arr.length];
        for(int i=0;i<repArr.length;i++){
            Arrays.fill(repArr[i], "X");
        }
        for(int y = 1;y<arr.length;y+=2){
            for(int x =1;x<arr[y].length;x++){
                int tmp = arr[y][x];
                if(tmp == arr[y-1][x-1] && tmp == arr[y][x-1] && tmp ==arr[y-1][x]){
                    repArr[y][x] = String.valueOf(tmp);
                }
            }
        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println("=======================");
        for(String[] a : repArr){
            System.out.println(Arrays.toString(a));
        }
        return answer;
    }
}
