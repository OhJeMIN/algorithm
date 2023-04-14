import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backJoon11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] f = new int[1001]; // 1<= n <= 1000
        f[1] = 1; // N이 1일때
        f[2] = 2; // N이 2일때
        for(int i=3;i<=n;i++){
            f[i] = (f[i-1] + f[i-2]) % 10007;
        }
        System.out.println(f[n]);
    }
}
