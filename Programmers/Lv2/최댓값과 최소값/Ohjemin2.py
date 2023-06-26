import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int max = 0;        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(Integer.parseInt(arr[j]) > Integer.parseInt(arr[j+1])){
                    String tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr[0]+" "+arr[arr.length-1];
    }
}
