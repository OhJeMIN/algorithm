package com.ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    //상하좌우
    private static int dx[] = {0, 1, -1, 0};
    private static int dy[] = {1, 0, 0, -1};
    //방문 체크
    private static boolean visited[][];
    //데이터
    private static int[][] graph;
    private static int row;
    private static int column;
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCase = Integer.parseInt(st.nextToken());
        for (int i = 0; i < testCase; i++) {
            count = 0;
            st = new StringTokenizer(br.readLine());
            row = Integer.parseInt(st.nextToken());
            column = Integer.parseInt(st.nextToken());
            int cabbage = Integer.parseInt(st.nextToken());
            graph = new int[column][row];
            visited = new boolean[column][row];
            for (int j = 0; j < cabbage; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt((st.nextToken()));
                int y = Integer.parseInt((st.nextToken()));
                graph[y][x] = 1;
            }
            for (int y = 0; y < column; y++) {
                for (int x = 0; x < row; x++) {
                    if (!visited[y][x] && graph[y][x] == 1) {
                        BFS(x, y);
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void BFS(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x < row && y < column && x >= 0 && y >= 0) {
                    if (!visited[y][x] && graph[y][x] == 1) {
                        visited[y][x] = true;
                        q.add(new int[]{x, y});
                    }
                }
            }
        }
        count++;
    }
}
