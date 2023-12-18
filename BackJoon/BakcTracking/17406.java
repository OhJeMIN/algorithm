package com.ll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph, tmpGraph;
    static ArrayList<node> rotate = new ArrayList<>();
    static int N, M, K;
    static int count = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        graph = new int[N + 1][M + 1];
        tmpGraph = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                tmpGraph[i][j] = graph[i][j];
            }
        }
        for (int i = 0; i < K; i++) {
            String[] tmp = br.readLine().split(" ");
            rotate.add(new node(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2])));
        }
        ArrayList<ArrayList<node>> allPermutations = new ArrayList<>();
        permutations(rotate, 0, rotate.size(), allPermutations);
        // 모든 순열 출력
        for (ArrayList<node> nodes : allPermutations) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    tmpGraph[i][j] = graph[i][j];
                }
            }

            for (node node : nodes) {
                int sX = node.r - node.s;
                int sY = node.c - node.s;
                int eX = node.r + node.s;
                int eY = node.c + node.s;
                moveNum(sX, sY, eX, eY);
            }
            for (int i = 1; i <= N; i++) {
                int sum = 0;
                for (int j = 1; j <= M; j++) {
                    sum += tmpGraph[i][j];
                }
                count = Math.min(count, sum);
            }
        }
        System.out.println(count);
    }

    private static void moveNum(int sX, int sY, int eX, int eY) {
        while (sX < eX && sY < eY) {
            int temp = tmpGraph[sX][sY];
            for (int i = sX; i < eX; i++) tmpGraph[i][sY] = tmpGraph[i + 1][sY];
            for (int i = sY; i < eY; i++) tmpGraph[eX][i] = tmpGraph[eX][i + 1];
            for (int i = eX; i > sX; i--) tmpGraph[i][eY] = tmpGraph[i - 1][eY];
            for (int i = eY; i > sY + 1; i--) tmpGraph[sX][i] = tmpGraph[sX][i - 1];
            tmpGraph[sX][sY + 1] = temp;
            sX++;
            sY++;
            eX--;
            eY--;
        }
    }


    static void permutations(ArrayList<node> arr, int depth, int n, ArrayList<ArrayList<node>> allPermutations) {
        if (depth == n) {
            allPermutations.add(new ArrayList<>(arr)); // 현재 순열을 결과에 추가
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutations(arr, depth + 1, n, allPermutations);
            swap(arr, depth, i); // 원래 상태로 복구
        }
    }

    // 두 노드의 위치를 변경하는 함수
    static void swap(ArrayList<node> arr, int i, int j) {
        node temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    static class node {
        int r;
        int c;
        int s;

        node(int r, int c, int s) {
            this.r = r;
            this.c = c;
            this.s = s;
        }
    }
}

