class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<n+1;i++){
            int sumj = 0;
            for(int j=i;i<n+1;j++){
                sumj +=j;
                if(sumj == n){
                    answer ++;
                    break;
                }
                if(sumj > n) break;
            }
        }
        return answer;
    }
}
