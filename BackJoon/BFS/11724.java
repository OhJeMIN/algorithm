package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class backJoon11724 {
    static boolean visited[];
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer>[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        arr = new ArrayList[n+1];
        for(int i=1;i<n+1;i++){
            arr[i] = new ArrayList<Integer>();
        }
        //인접 리스트(Graph)
        for(int i=0;i<v;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }
        int count = 0;
        // 방문 여부 확인
        for(int i=1;i<n+1;i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(sb);
        System.out.println(count);
    }

    private static void DFS(int v) {
        if(visited[v]){ //방문했다면 return
            return;
        }
        visited[v] = true;
        for(int i : arr[v]){ //만약 그 다음 깊이가 있다고 방문 하지 않았다면 DFS
            if(!visited[i]){
                DFS(i);
            }
        }
    }

}
