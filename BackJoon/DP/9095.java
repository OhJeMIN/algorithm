import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backJoon9095 {
    static int[] f;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            f = new int[1001];
            f[1] = 1;
            f[2] = 2;
            f[3] = 4;
            for(int j=4;j<=n;j++){
                f[j] = f[j-1] + f[j-2] + f[j-3];
            }
            sb.append(f[n]+"\n");
        }
        System.out.print(sb);
    }
}
