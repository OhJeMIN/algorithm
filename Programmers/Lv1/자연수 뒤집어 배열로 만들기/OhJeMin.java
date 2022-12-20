class Solution {
    public int[] solution(long n) {
        int cnt = 0 ,i = 0;
        long num = n;
        while(n > 0){
            n /= 10;
            cnt++;
        }      
        int[] answer = new int[cnt];
        while(num > 0) {
            answer[i] = (int)(num % 10);
            i++; 
            num /= 10;
        }        
        return answer;
    }
}
