import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class backJoon10451 {
    static boolean visited[];
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            visited = new boolean[N+1];
            graph = new ArrayList[N+1];
            for(int j=1;j<N+1;j++){
                graph[j] = new ArrayList<Integer>();
            }
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1;j<N+1;j++){
                graph[j].add(Integer.parseInt(st.nextToken()));
            }
            for(int j=1;j<N+1;j++){
                if(!visited[j]){
                    count++;
                    DFS(j);
                }
            }
            System.out.println(count);
        }
    }
    public static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : graph[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}
