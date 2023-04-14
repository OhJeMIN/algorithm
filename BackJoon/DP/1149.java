import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class backJoon1149 {
    static int[][] house;
    static int[][] dp;

    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        house = new int[N][3];
        dp = new int[N][3];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            house[i][Red] =  Integer.parseInt(st.nextToken());
            house[i][Green] =  Integer.parseInt(st.nextToken());
            house[i][Blue] =  Integer.parseInt(st.nextToken());
        }
        dp[0][Red] = house[0][Red];
        dp[0][Green] = house[0][Green];
        dp[0][Blue] = house[0][Blue];

        System.out.println(Math.min(minCost(N-1, Red), Math.min(minCost(N-1, Green), minCost(N-1, Blue))));
    }
    public static int minCost(int N, int color) {
        //아직 방문하지 않은 집 확인
        if(dp[N][color] == 0) {
            //저장한 값을 불러와 최소값 저장
            if(color == Red) {
                dp[N][Red] = Math.min(minCost(N-1, Green), minCost(N-1, Blue)) + house[N][Red];
            }
            else if(color == Green) {
                dp[N][Green] = Math.min(minCost(N-1, Red), minCost(N-1, Blue)) + house[N][Green];
            }
            else {
                dp[N][Blue] = Math.min(minCost(N-1, Red), minCost(N-1, Green)) + house[N][Blue];
            }
        }
        return dp[N][color];
    }
}
