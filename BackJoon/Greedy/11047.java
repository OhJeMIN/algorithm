package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class backJoon11047 {
    static int[] coin;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int sum = 0;
        int answer = 0;
        coin = new int[N];
        for(int i=0;i<N;i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        while(sum < K){
            int max = 0;
            for(int c : coin){
                if(c <= K) max =c;
            }
            K -= max;
            answer ++;
        }
        System.out.println(answer);
    }
}
