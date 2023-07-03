class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        int limits = p.length();
        for(int i=0;i<=t.length()-limits;i++){
            String tmp = t.substring(i,i+limits);
            if(pNum >= Long.parseLong(tmp)) answer++;
        }
        return answer;
    }
}
