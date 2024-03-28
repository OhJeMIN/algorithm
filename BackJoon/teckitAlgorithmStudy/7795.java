
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] aGraph, bGraph;
    static int A ,B;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            aGraph = new int[A];
            for (int j = 0; j < A; j++) {
                aGraph[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(aGraph);
            st = new StringTokenizer(br.readLine());
            bGraph = new int[B];
            for (int j = 0; j < B; j++) {
                bGraph[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(bGraph);

            int count = 0;
            for(int j=0;j<A;j++){
                for(int k=0;k<B;k++){
                    if(aGraph[j] <= bGraph[k]) break;
                    else count++;
                }
            }
            System.out.println(count);
        }
    }

}
