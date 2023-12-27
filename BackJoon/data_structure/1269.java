import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashSet<Integer> aSet = new HashSet<>();
        HashSet<Integer> bSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }
        for (int num : aSet) {
            if (bSet.contains(num)) {
                B--;
            }
        }

        for (int num : bSet) {
            if (aSet.contains(num)) {
                A--;
            }
        }
        System.out.println(A + B);

    }

}
