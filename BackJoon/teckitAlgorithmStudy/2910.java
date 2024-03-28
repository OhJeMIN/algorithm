package com.ll;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int C = scanner.nextInt();
        HashMap<Integer,Integer> order = new HashMap<>();
        HashMap<Integer,Integer> bindo = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<len;i++){
            int num = scanner.nextInt();
            list.add(num);
            order.putIfAbsent(num,i);
            bindo.put(num,bindo.getOrDefault(num,0)+1);
        }
        Collections.sort(list, new Comparator<>() {
            @Override
            public int compare(Integer a, Integer b) {
                int frequencyCompare = bindo.get(b).compareTo(bindo.get(a));
                int orderCompare = order.get(a).compareTo(order.get(b));

                if (frequencyCompare == 0) return orderCompare;
                else return frequencyCompare;
            }
        });
        for(int num : list)
            System.out.print(num+" ");
    }
}

