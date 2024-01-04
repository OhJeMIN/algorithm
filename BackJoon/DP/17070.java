package com.ll;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] map;
    static int[][][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        dp = new int[N][N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][1][0] = 1;  // 시작점 설정. (0,1) 위치에서 가로 방향으로 이동하는 경우의 수는 1가지

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                move(x, y);
            }
        }

        // (N-1, N-1) 위치에 도달하는 모든 경우의 수를 합하여 출력
        System.out.print(dp[N-1][N-1][0] + dp[N-1][N-1][1] + dp[N-1][N-1][2]);
    }

    // 0: 가로 방향으로 이동
    // 1: 세로 방향으로 이동
    // 2: 대각선 방향으로 이동
    private static void move(int x, int y) {
        if (y + 1 < N && map[x][y + 1] == 0) {
            dp[x][y + 1][0] += dp[x][y][0] + dp[x][y][2];
        }

        if (x + 1 < N && map[x + 1][y] == 0) {
            dp[x + 1][y][1] += dp[x][y][1] + dp[x][y][2];
        }

        if (x + 1 < N && y + 1 < N && map[x + 1][y] == 0 && map[x][y + 1] == 0 && map[x + 1][y + 1] == 0) {
            dp[x + 1][y + 1][2] += dp[x][y][0] + dp[x][y][1] + dp[x][y][2];
        }
    }
}
