class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int len = my_string.length();
        for(int i=0;i<len;i++){
            if(Character.isDigit(my_string.charAt(i))) answer += Character.getNumericValue(my_string.charAt(i));;
        }
        return answer;
    }
}
