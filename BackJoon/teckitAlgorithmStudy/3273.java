import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }
        st = new StringTokenizer(br.readLine());
        int goalNum = Integer.parseInt(st.nextToken());
        int count = 0;
        Collections.sort(list);

        Set<Integer> set = new HashSet<>();
        for (int num : list) {
            set.add(num);
        }
        for (int num : list) {
            int diff = goalNum - num;
            if (set.contains(diff)) {
                count++;
            }
        }
        System.out.println(count/2);
    }
}

