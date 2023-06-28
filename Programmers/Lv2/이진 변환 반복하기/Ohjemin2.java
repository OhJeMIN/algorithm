class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")){
            String replacedS = s.replace("0", "");
            int Count = s.length() - replacedS.length();
            answer[1] += Count;
            String num = Integer.toString(replacedS.length(), 2);
            s = num;
            answer[0] ++;
        }
        return answer;
    }
}
