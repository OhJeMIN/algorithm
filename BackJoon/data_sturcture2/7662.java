import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        TreeMap<Integer, Integer> que = new TreeMap<>();
        for(int i=0;i<K;i++){
            String[] input = br.readLine().split(" ");
            int N =Integer.parseInt(input[1]);
            if(input[0].equals("I")){
                que.put(N,que.getOrDefault(N, 0) + 1);
            }
            else{
                if(que.isEmpty()) continue;
                int num = 0;
                num =  N == 1 ? que.lastKey() : que.firstKey();
                if(que.put(num, que.get(num) -1) == 1){
                    que.remove(num);
                }
            }
        }
        if(que.isEmpty()) st.append("EMPTY" + "\n");
        else st.append(que.lastKey()+" "+que.firstKey()+"\n");
    }
}
