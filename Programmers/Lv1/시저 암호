class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isWhitespace(c)){
                answer += c;
                continue;
            }
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
               if(Character.isUpperCase(c)){
                     if(c+n > 'Z') answer += (char)(c-26+n);
                    else answer += (char)(c+n);
                }
                else if(Character.isLowerCase(c)){
                    if(c+n > 'z') answer += (char)(c-26+n);
                    else answer += (char)(c+n);
                } 
            }    
        }        
        return answer;
    }
}
