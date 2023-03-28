package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class backJoon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        /*int[] arr = new int[input.length];*/
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<input.length;i++){
            pq.add(Integer.parseInt(input[i]));
        }
        for(int i=0;i<input.length;i++){
            System.out.print(pq.poll());
        }
        /*
        //선택정렬
        for(int i=0;i< arr.length;i++){
            for(int j=0;j+i<arr.length-1;j++){
                if(arr[j+1]>arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }*/


    }
}
