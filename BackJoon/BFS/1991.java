package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class backJoon1991 {

    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];
        graph = new ArrayList[N+1];
        for(int i=1;i<N+1;i++) graph[i] = new ArrayList<Integer>();

        int firstNode = 0;
        for(int i=1;i<N+1;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = st.nextToken().charAt(0) - 64;
            int leftChild = st.nextToken().charAt(0) - 64;
            int rightChild = st.nextToken().charAt(0) - 64;
            if(i ==1) firstNode = parent;
            graph[parent].add(leftChild);
            graph[parent].add(rightChild);
        }
        //전위 순회
        Queue<Integer> q = new ArrayDeque<>();
        q.add(firstNode);
        sb.append((char) ((char)firstNode + 64));
        while(!q.isEmpty()){
            int n = q.poll();
            for(int k : graph[n]){
                if(k>0){
                    if(!visited[k]){
                        q.add(k);
                        visited[n] = true;
                        sb.append((char) ((char)k + 64));

                    }
                }
            }
        }
        sb.append("\n");
        //중위 순회
        Arrays.fill(visited,false);
        for(int i=1;i<N+1;i++){
            if(!visited[i]){
                inOrderLeft(i);
                sb.append((char) ((char)i + 64));
                inOrderRight(i);
            }
        }
        sb.append("\n");
        //후위 순회
        Arrays.fill(visited,false);
        for(int i=1;i<N+1;i++){
            if(!visited[i]){
                DFS(i);
                sb.append((char) ((char)i + 64));
            }
        }
        System.out.println(sb);
    }

    private static void inOrderRight(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;
        int left = graph[v].get(0);
        if(left > 0) inOrderLeft(v);
        int right = graph[v].get(1);
        if(right >0){
            if(!visited[right]){
                inOrderLeft(right);
                sb.append((char) ((char)right + 64));
            }
        }
    }

    private static void inOrderLeft(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;
        int left = graph[v].get(0);
        if(left >0){
            if(!visited[left]){
                inOrderLeft(left);
                sb.append((char) ((char)left + 64));
            }
        }
    }

    static public void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : graph[v]){
            if(i>0){
                if(!visited[i]){
                    DFS(i);
                    sb.append((char) ((char)i + 64));
                }
            }
        }
    }
}
