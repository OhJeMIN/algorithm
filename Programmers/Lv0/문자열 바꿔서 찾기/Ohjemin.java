class Solution {
    public int solution(String myString, String pat) {
        boolean[] visited = new boolean[myString.length()];
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i) == 'B'){
                visited[i] = true;
            }
        }
        String tmp = "";
        for(int i=0;i<visited.length;i++){
            if(visited[i]) tmp+="A";
            else tmp+="B";
            
        }
        return tmp.contains(pat) ? 1 : 0;
    }
}
