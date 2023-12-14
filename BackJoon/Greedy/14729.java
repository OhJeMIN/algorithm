import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        PriorityQueue<Float> pq  = new PriorityQueue<>();

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            Float score = Float.parseFloat(st.nextToken());
            pq .add(score);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i < 7;i++){
            sb.append(String.format("%.3f", pq.poll()));
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}

