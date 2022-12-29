class Solution {
    public int solution(int num) {
        long n = num;
        int cnt = 0;
        while( n != 1){
            if(n % 2 == 0){
               n /= 2; 
            }            
            else{
                 n = (n * 3) +1;
            }
            cnt++;
            if(cnt > 500){
                cnt = -1;
                break;
            }
        }
        if(cnt == 1) cnt = 0;
        return cnt;
    }
}

# 입력받은 num값을 int형 그대로 쓰면 100번쨰 근처에서 오버 플로우가 나와서 음수로 한 번 바뀐다 그래서 결과가 488로 꼬인다.
