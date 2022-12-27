class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int lengX = x, sum = 0;
        while( lengX != 0){
            sum += (lengX % 10);
              lengX /= 10;
         }
        if(x % sum != 0) answer = false;
        return answer;
    }
}
