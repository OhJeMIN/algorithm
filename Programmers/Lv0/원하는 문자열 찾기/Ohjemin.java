class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.toLowerCase();
        String patStr = pat.toLowerCase();
        return str.contains(patStr) ? 1 : 0;
    }
}
