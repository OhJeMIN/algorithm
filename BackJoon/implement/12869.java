import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static boolean[][][] visited = new boolean[61][61][61];
    private static int[] SCV;
    private static int[] attack = new int[]{9, 3, 1};
    private static int n;
    private static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        SCV = new int[3];
        for (int i = 0; i < n; i++) {
            SCV[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = n; i < 3; i++) {
            SCV[i] = 0;
        }
        mutalAttack(SCV[0], SCV[1], SCV[2], 0);
        System.out.println(result);
    }

    private static void mutalAttack(int i, int i1, int i2, int count) {
        i = Math.max(0, i);
        i1 = Math.max(0, i1);
        i2 = Math.max(0, i2);

        if (i == 0 && i1 == 0 && i2 == 0){
            result = Math.min(result,count);
            return;
        }

        int[] sorting = {i,i1,i2};
        Arrays.sort(sorting);
        i = sorting[2];
        i1 = sorting[1];
        i2 = sorting[0];

        if(visited[i][i1][i2]){
            return;
        }
        else{
            visited[i][i1][i2] = true;
        }

        mutalAttack(i-9, i1-3, i2-1, count+1);
        mutalAttack(i-9, i1-1, i2-3, count+1);
        mutalAttack(i-3, i1-9, i2-1, count+1);
        mutalAttack(i-3, i1-1, i2-9, count+1);
        mutalAttack(i-1, i1-3, i2-9, count+1);
        mutalAttack(i-1, i1-9, i2-3, count+1);

        return;
    }

}


