import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Character[][] graph = new Character[n][n];
        int index = 0;
        String form = "%0"+ n +"d";
        for(int num : arr1){
            //n의 길이만큼 이진수를 표현
            Long xLong= new Long(num);
            String binary = String.format(form, Long.parseLong(Long.toBinaryString(xLong)));            
            for(int i =0; i< binary.length(); i++){
                if(binary.charAt(i) == '1') graph[index][i] = '#';
                else graph[index][i] = ' ';
            }
            index++;
        }
        index = 0;
        for(int num : arr2){
            Long xLong= new Long(num);
            String binary = String.format(form, Long.parseLong(Long.toBinaryString(xLong)));
            for(int i =0; i< binary.length(); i++){
                if(binary.charAt(i) == '1') graph[index][i] = '#';
            }
            index++;
        }
        for(int i=0;i<n;i++){
            String output = "";
            for(int j=0;j<n;j++) output += graph[i][j];
            answer[i] = output;
        }
        return answer;
    }
}
