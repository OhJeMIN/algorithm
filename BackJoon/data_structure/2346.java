package org.example;

import java.io.*;
import java.util.*;

/*
* 풍선 Deque balloon 생성 ->  이동에 양수 음수가 있어서
* 종이 Queue paperLink 생성
* */

public class backJoon2346 {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countBalloon = Integer.parseInt(br.readLine());
        String[] link = br.readLine().split(" ");
        Deque<Integer> balloon = new LinkedList<>();
        Queue<Integer> paperLink = new LinkedList<>();
        balloon = generateBalloon(countBalloon);
        paperLink = generatePaperLink(link);
    }
    public static Deque<Integer> generateBalloon(int count){
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 1;i<=count;i++) dq.add(i);
        return dq;
    }

    public static Queue<Integer> generatePaperLink(String[] link){
        Queue<Integer> dq = new LinkedList<>();
        for(int i = 0; i<link.length; i++) dq.add(Integer.parseInt(link[i]));
        return dq;
    }
}
