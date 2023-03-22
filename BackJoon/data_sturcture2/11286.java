import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class backJoon11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st =new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(((o1, o2) -> {
            int absO1 = Math.abs(o1);
            int absO2 = Math.abs(o2);
            if(absO1 == absO2) return o1 > o2 ? 1 : -1;
            return absO1- absO2;
        }));
        for(int i=0;i<N;i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0) {
               if(pq.isEmpty()) st.append("0" + "\n");
               else st.append(pq.poll() + "\n");
            }
            else pq.add(input);
        }
        System.out.print(st);
    }
}
