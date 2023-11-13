package com.ll;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //상하좌우
    private static int dx[] = {0, 1, -1, 0};
    private static int dy[] = {1, 0, 0, -1};
    //방문 체크
    private static boolean visited[][];
    //데이터
    private static int[][] graph;

    private static int rowColumn;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        rowColumn= Integer.parseInt(st.nextToken());
        graph = new int[rowColumn][rowColumn];
        int maxHeight = 0;
        for(int x=0;x<rowColumn;x++){
            st = new StringTokenizer(br.readLine());
            for(int y =0;y<rowColumn;y++){
                graph[x][y]  = Integer.parseInt(st.nextToken());
                if(graph[x][y] > maxHeight){
                    maxHeight = graph[x][y];
                }
            }
        }
        int max = 0;
        for(int i=0;i<=maxHeight;i++){
            visited = new boolean[rowColumn][rowColumn];
            int count = 0;
            for(int x=0;x<rowColumn;x++){
                for(int y =0;y<rowColumn;y++){
                    if (!visited[x][y] && graph[x][y] > i) {
                        count +=BFS(x, y, i);
                    }
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }

    private static int BFS(int x, int y, int height) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int k = 0; k < 4; k++) {
                int nextX = now[0] + dx[k];
                int nextY = now[1] + dy[k];
                if (nextX < rowColumn && nextY < rowColumn && nextX >= 0 && nextY >= 0) {
                    if (!visited[nextX][nextY] && graph[nextX][nextY] > height) {
                        visited[nextX][nextY] = true;
                        q.add(new int[]{nextX, nextY});
                    }
                }
            }
        }
        return 1;
    }
}
