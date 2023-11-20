import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //상하좌우
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    private static boolean[][] visited;
    private static String[][] result;
    private static int[][] graph;
    static int row;
    static int column;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        column = Integer.parseInt(st.nextToken());
        result = new String[row+1][column+1];
        graph = new int[row+1][column+1];

        for(int i=0;i<row;i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0;j<column;j++){
                result[i][j] = line.substring(j,j+1);
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(result[i][j].equals("L")){
                    visited = new boolean[row+1][column+1];
                    graph = new int[row+1][column+1];
                    BFS(i,j);
                    int count = Arrays.stream(graph)
                            .flatMapToInt(Arrays::stream) // 이중 배열을 단일 스트림으로 펼침
                            .max().getAsInt();
                    max = Math.max(max,count);
                }
            }
        }
        System.out.println(max);



    }
    private static void BFS(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        visited[i][j] = true;
        q.add(new int[]{i, j});
        while (!q.isEmpty()) {
            int now[] = q.poll();
            visited[now[0]][now[1]] = true;
            for (int k = 0; k < 4; k++) { //상하좌우 판단
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < row && y < column) {
                    if (!visited[x][y] && result[x][y] != null && !result[x][y].equals("W")) { //0이 아니고 방문한적이 없는 경우
                        visited[x][y] = true;
                        graph[x][y] = graph[now[0]][now[1]] + 1;// 최단 거리를 graph에 저장
                        q.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
