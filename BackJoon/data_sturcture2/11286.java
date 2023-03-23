import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class backJoon11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st =new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1,o2) : Integer.compare(Math.abs(o1),Math.abs(o2));
            }
        });
        /*PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) ->
                Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1,o2) : Integer.compare(Math.abs(o1),Math.abs(o2))
        );*/
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
