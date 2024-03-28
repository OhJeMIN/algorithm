package com.ll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int[][] graph;
    private static HashMap<Integer, String> cd = new HashMap<>();
    private static int N, time;
    private static List<node> snake = new ArrayList<>();
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        graph = new int[N][N];
        int appleCount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < appleCount; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            sc.nextLine();
            graph[x][y] = 1; // 사과 위치
        }
        int cdCount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cdCount; i++) {
            String tmp = sc.nextLine();
            cd.put(Integer.parseInt(tmp.split(" ")[0]), tmp.split(" ")[1]);
        }

        move();
    }

    public static void move() {
        int x = 0;
        int y = 0;
        int idx = 0;
        time = 0;
        snake.add(new node(x, y));
        while (true) {
            time++;

            int nx = x + dx[idx];
            int ny = y + dy[idx];

            if (touchBodyOrWall(nx, ny)) {
                break;
            }
            if (graph[nx][ny] == 1) { // 사과 먹고 없앰
                graph[nx][ny] = 0;
                snake.add(new node(nx, ny));

            } else { // 사과가 없으면 몸길이 줄임
                snake.add(new node(nx, ny));
                snake.remove(0);
            }

            // 5. 방향을 바꿔주는 시간을 만날 때 방향 변경
            if (cd.containsKey(time)) {
                if (cd.get(time).equals("D")) {
                    idx += 1;
                    if (idx == 4)
                        idx = 0;
                } else {
                    idx -= 1;
                    if (idx == -1)
                        idx = 3;
                }
            }

            x = nx;
            y = ny;
        }
        System.out.println(time);
    }

    public static boolean touchBodyOrWall(int nx, int ny) {
        if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
            return true;
        }

        for (int i = 0; i < snake.size(); i++) {
            node now = snake.get(i);
            if (nx == now.x && ny == now.y)
                return true;
        }
        return false;
    }


    public static class node {
        int x;
        int y;

        node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

