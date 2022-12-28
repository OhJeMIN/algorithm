class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if( a - b > 0){
            for(int i = 0 ; i <= (a-b); i++){
                answer += (b+i);
            }
        }
        else if( a - b < 0){
            for(int i = 0 ; i <= (b-a); i++){
                answer += (a+i);
            }
        }
        else answer = a;
        return answer;
    }
}
