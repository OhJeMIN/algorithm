package com.ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    //상하좌우
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    //방문 체크
    static boolean visited[][];
    //데이터
    static int[][] graph;
    static int[][] graphOneZero;
    static int N;
    static int M;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        graph = new int[M + 1][N + 1];
        graphOneZero = new int[M][N];
        visited = new boolean[M][N];
        for (int i = 0; i < k; i++) {
            String[] rec = br.readLine().split(" ");
            for (int y = Integer.parseInt(rec[1]); y <= Integer.parseInt(rec[3]); y++) {
                for (int x = Integer.parseInt(rec[0]); x <= Integer.parseInt(rec[2]); x++) {
                    graph[y][x] = 1;
                }
            }
        }
        for (int y = 0; y < M; y++) {
            for (int x = 0; x < N; x++) {
                if(graph[y][x] == 1 && graph[y][x+1] ==1 && graph[y+1][x] == 1 && graph[y+1][x+1] ==1){
                    graphOneZero[y][x] =1;
                }
            }
        }
        List<Integer> answers = new ArrayList<>();
        for (int y = 0; y < M; y++) {
            for (int x = 0; x < N; x++) {
                if (!visited[y][x] && graphOneZero[y][x] != 1) {
                    int area = 1;
                    answers.add(BFS(x, y, area));
                }
            }
        }
        System.out.println(count);
        Collections.sort(answers);
        for(int area : answers) System.out.print(area + " ");
    }

    private static int BFS(int i, int j, int area) {
        Queue<int[]> q = new LinkedList<>();
        boolean flag = false;
        q.add(new int[]{i, j});
        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x < N && y < M && x >= 0 && y >= 0) {
                    if (!visited[y][x] && graphOneZero[y][x] != 1) {
                        visited[y][x] = true;
                        q.add(new int[]{x, y});
                        area++;
                        flag = true;
                    }
                }
            }
        }
        count++;
        return flag ? area-1 : area;
    }
}

