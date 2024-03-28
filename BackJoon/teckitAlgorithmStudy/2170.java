package com.ll;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    private static ArrayList<node> list = new ArrayList<>();
    private static int minInt = Integer.MAX_VALUE;
    private static int count = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<node> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new node(x, 1)); // 시작점
            list.add(new node(y, -1)); // 끝점
        }

        Collections.sort(list, new Comparator<node>() {
            @Override
            public int compare(node o1, node o2) {
                if(o1.idx == o2.idx){
                    return o1.count - o2.count;
                }else{
                    return o1.idx - o2.idx;
                }
            }
        });

        int result = 0;
        int count = 0;
        int prev = 0;   // 이전 위치를 저장하는 변수를 추가했습니다.

        for(int i = 0; i < list.size(); i++) {
            node node = list.get(i);
            if(count > 0) {
                result += node.idx - prev;   // 이전 위치와 현재 위치의 차이를 계산하여 결과에 더함
            }
            count += node.count;  // 선의 시작점이면 count를 증가시키고, 끝점이면 감소
            prev = node.idx;   // 현재 위치를 이전 위치로 저장
        }

        System.out.println(result);
    }


    static class node{
        int idx;
        int count;

        node(int idx, int count){
            this.idx = idx;
            this.count = count;
        }
    }
}
