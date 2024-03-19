class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        for(char s : arr){
            if((int)'l' > (int)s) answer+="l";
            else answer+=(s+"");
        }
        return answer;
    }
}
