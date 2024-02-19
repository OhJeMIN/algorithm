class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] arr = {5,3,1};
        for(int i=0;i<arr.length;i++){
            while(hp >= arr[i]){
                hp -= arr[i];
                answer++;                
                if(hp < arr[i] || hp <= 0) break;
            }            
        }
        return answer;
    }
}
