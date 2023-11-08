package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int len = Integer.parseInt(input[0]);
        int size = Integer.parseInt(input[1]);
        int[] ondo = new int[len + 1];
        int Max = 0;
        for (int i = 1; i <= len; i++) {
            ondo[i] = ondo[i-1]+Integer.parseInt(String.valueOf(scanner.nextInt()));
        }
        int max = -100000;
        for(int i =size; i<= len;i++){
            int sum = ondo[i] - ondo[i-size];
            if(sum > max) max = sum;
        }
        System.out.println(max);
    }
}
