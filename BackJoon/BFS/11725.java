import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class backJoon11725 {

    static boolean[] visited;
    static ArrayList<Integer>[] List;
    static StringBuilder sb= new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];
        List = new ArrayList[N+1];
        for(int i=1;i<N+1;i++){
            List[i] = new ArrayList<Integer>();
        }
        for(int i=1;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            List[from].add(to);
            List[to].add(from);
        }
        int[] parentNode = new int[N+1];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        visited[1] = true;
        while(!q.isEmpty()){
            int v = q.poll();
            for(int i : List[v]){
                if(!visited[i]){
                    visited[i] =true;
                    q.add(i);
                    parentNode[i] = v;
                }
            }
        }
        for(int i = 2 ; i< N+1;i++){
            System.out.println(parentNode[i]);
        }
    }

}
