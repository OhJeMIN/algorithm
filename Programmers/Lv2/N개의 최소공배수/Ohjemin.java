import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        Integer[] divided = new Integer[arr.length];
        Arrays.fill(divided,0); 
        Arrays.sort(arr);
        int Max = arr[arr.length-1];
        for(int i=1;i<=Max;i++){
            boolean flag = false;
            for(int j=0;j<arr.length;j++){
                flag = arr[j]%i==0 ? true : false;
                if(flag) divided[j] = 1;
            }
            if(!Arrays.asList(divided).contains(0)){ // 전부다 나눠 떨어지면 나눠주고 answer에 곱해둠
                answer *=i;
                for(int k=0;k<arr.length;k++) arr[k] /=i;
            }
            Arrays.fill(divided,0);
        }
        for(int i : arr){
            answer *=i;
        }
        return answer;
    }
}
