class Solution {
    public int solution(int a, int b) {
        int first = a* (int)Math.pow(10, (int)(Math.log10(b)+1)) + b;
        int second = b* (int)Math.pow(10, (int)(Math.log10(a)+1)) + a;
        return first > second ? first : second;
    }
}
