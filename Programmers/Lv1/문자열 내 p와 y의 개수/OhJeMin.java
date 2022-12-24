class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int Pnum =0 ,Ynum =0;
        Pnum = s.length() - s.replace("p", "").length() - s.replace("P", "").length();
        Ynum = s.length() - s.replace("y", "").length() - s.replace("Y", "").length();
        if(Pnum != Ynum) answer = false;
        return answer;
    }
}
