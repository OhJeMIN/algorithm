import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class backJoon2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int result = 0;
        for(int i=0;i<N;i++){
            String[] input = br.readLine().split(" ");
            for(int k=0;k<input.length;k++){
                pq.add(Integer.parseInt(input[k]));
            }
        }
        for(int i=0;i<N;i++){
            if(i == N-1) result = pq.poll();
            pq.poll();
        }
        System.out.print(result);
    }
}
