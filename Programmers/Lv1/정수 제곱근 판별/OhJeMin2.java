class Solution {
    public long solution(long n) {
        double multiAnswer = Math.sqrt(n);
        if (multiAnswer % 1 == 0 ) {
           return ((int)multiAnswer+1) * ((int)multiAnswer+1) ;
        }else{
            return -1;
        }
    }
}
