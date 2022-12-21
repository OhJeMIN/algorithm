class Solution {
    public long solution(long n) {
        double multiAnswer = Math.sqrt(n);
        if (multiAnswer == (int)multiAnswer ) {
           return ((int)multiAnswer+1) * ((int)multiAnswer+1) ;
        }else{
            return -1;
        }
    }
}
