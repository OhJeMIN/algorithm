import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class backJoon11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder st = new StringBuilder();
        for(int i=0;i<N;i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0) {
                st.append(pq.peek() != null ? pq.poll() : 0);
                st.append("\n");
            }
            else if(input >0) pq.add(input);
        }
        System.out.print(st);

    }
}
