class Solution {
    public long solution(long n) {
        if (Math.sqrt(n) == (long)Math.sqrt(n) ) {
            long multiAnswer = (long)Math.sqrt(n);
           return (multiAnswer+1) * (multiAnswer+1);
        }else{
            return -1;
        }
    }
}
