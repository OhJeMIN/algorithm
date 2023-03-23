import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class backJoon7662 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder st = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            dualPriorityQueue(Integer.parseInt(br.readLine()));
        }
        System.out.print(st);
    }
    public static void dualPriorityQueue(int K) throws IOException{
        PriorityQueue<Integer> dqMax = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> dqMin = new PriorityQueue<>();
        for(int i=0;i<K;i++){
            String[] input = br.readLine().split(" ");
            int N =Integer.parseInt(input[1]);
            if(input[0].equals("I")){
                dqMax.add(N);
                dqMin.add(N);
            }
            else{
                if(dqMax.isEmpty() || dqMin.isEmpty()) continue;
                if(N >0){
                    int num = dqMax.poll();
                    dqMin.remove(num);
                }
                else{
                    int num = dqMin.poll();
                    dqMax.remove(num);
                }
            }
        }
        if(dqMax.isEmpty()) st.append("EMPTY" + "\n");
        else st.append(dqMax.peek()+" "+dqMin.peek()+"\n");
    }
}
