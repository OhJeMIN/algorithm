import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class backJoon1912 {
    static int[] sequence;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sequence = new int[n];
        dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(st.nextToken());
            sequence[i] = num;
        }
        dp[0] = sequence[0];
        int max = sequence[0];

        for(int i=1;i<n;i++){
            dp[i] = Math.max(dp[i-1] + sequence[i], sequence[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }
}
