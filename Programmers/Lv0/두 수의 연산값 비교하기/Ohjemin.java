class Solution {
    public int solution(int a, int b) {
        String stringNum =  a+""  +  b+"" ;
        return Integer.parseInt(stringNum) >= 2 *a *b ? Integer.parseInt(stringNum) : 2 *a *b;
    }
}
