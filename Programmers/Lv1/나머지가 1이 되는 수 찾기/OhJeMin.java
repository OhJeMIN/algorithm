class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        while(n != 0){
           if( n % cnt == 1){
               answer = cnt;
               break;
           }
            cnt++;
        }
        return answer;
    }
}
