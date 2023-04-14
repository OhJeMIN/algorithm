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

        System.out.println(Math.min(Paint_cost(N- 1, Red), Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue))));
        System.out.println(Arrays.deepToString((dp)));
    }
    static int Paint_cost(int N, int color) {

        // 만약 탐색하지 않은 배열이라면
        if(dp[N][color] == 0) {

            // color의 색에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 DP에 저장한다
            // 메모이제이션
            if(color == Red) {
                dp[N][Red] = Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue)) + house[N][Red];
            }
            else if(color == Green) {
                dp[N][Green] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Blue)) + house[N][Green];
            }
            else {
                dp[N][Blue] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Green)) + house[N][Blue];
            }

        }

        return dp[N][color];
    }
}
