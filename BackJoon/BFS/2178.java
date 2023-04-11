import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    //상하좌우
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0 ,-1};
    //방문 체크
    static boolean visited[][];
    //데이터
    static int[][] graph;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0;i<N;i++){
            st =new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0;j<M;j++){
                graph[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);
        System.out.println(graph[N-1][M-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { i, j});
        while(!q.isEmpty()){
            int now[] = q.poll();
            visited[i][j] = true;
            for(int k=0;k<4;k++){ //상하좌우 판단
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x >= 0 && y >= 0 && x < N && y< M){
                    if(!visited[x][y] && graph[x][y] != 0){ //0이 아니고 방문한적이 없는 경우
                        visited[x][y] = true;
                        graph[x][y] = graph[now[0]][now[1]] +1; // 최단 거리를 graph에 저장
                        q.add(new int[]{ x, y});
                    }
                }
            }
        }
    }
}
