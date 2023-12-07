package com.ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int[][] graph;
    private static boolean[][] visited;
    private static int room = 0; // 방의 개수
    private static int maxRoom = 0; // 가장 넓은 방 넓이
    private static int roomSum = 0; // 벽 제거 후 가장 넓은 방 크기
    private static int[] dx = {0, -1, 0, 1};
    private static int[] dy = {-1, 0, 1, 0};
    private static int N;
    private static int M;
    private static int[][][] dividedRoom; // [0] 방 구분, [1] 이어진 방 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[M][N];
        visited = new boolean[M][N];
        dividedRoom = new int[M][N][2];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, room);
                    room++;
                }
            }
        }
        sumRoom();
        System.out.println(room);
        System.out.println(maxRoom);
        System.out.println(roomSum);

    }

    private static void bfs(int x, int y, int room) {
        Queue<node> q = new LinkedList<>();
        q.add(new node(x, y));
        visited[x][y] = true;
        int count = 0;
        ArrayList<node> roomNumber = new ArrayList<>();
        while (!q.isEmpty()) {
            node now = q.poll();
            count++;
            roomNumber.add(new node(now.x, now.y));
            for (int i = 0; i < 4; i++) {
                int moveX = now.x + dx[i];
                int moveY = now.y + dy[i];
                if ((graph[now.x][now.y] & (1 << i)) == 0) {
                    if (!visited[moveX][moveY] && M > moveX && N > moveY && moveY >= 0 && moveX >= 0) {
                        visited[moveX][moveY] = true;
                        q.add(new node(moveX, moveY));
                    }
                }
            }
        }
        maxRoom = Math.max(maxRoom, count);
        for (node n : roomNumber) {
            dividedRoom[n.x][n.y][0] = room;
            dividedRoom[n.x][n.y][1] = count;
        }
    }

    private static void sumRoom() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 4; k++) {
                    int moveX = i + dx[k];
                    int moveY = j + dy[k];
                    if (moveX < M && moveY < N && moveY >= 0 && moveX >= 0) {
                        if (dividedRoom[moveX][moveY][0] != dividedRoom[i][j][0]) {
                            roomSum = Math.max(roomSum, dividedRoom[moveX][moveY][1] + dividedRoom[i][j][1]);
                        }
                    }
                }
            }
        }
    }


    static class node {
        int x;
        int y;

        node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

