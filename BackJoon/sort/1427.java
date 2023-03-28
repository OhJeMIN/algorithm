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
        /*for(int i=0;i<input.length;i++){
            arr[i] = Integer.parseInt(input[i]);
        }*/
        /*
        //정렬 1
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
        }
        // 정렬 2
        for(int i=0;i< arr.length;i++){
            int Max = i;
            for(int j= i+1;i<arr.length;i++){
                if(arr[j] > arr[Max]){
                    Max = j; //최대값을 가리키는 index 저장
                }
            }
            if(arr[i] < arr[Max]){ //위에 for문에서 구한 Max와  원래 Max의 값을 비교해 스왑한다.
                int temp = arr[i];
                arr[i] = arr[Max];
                arr[Max] = temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }*/


    }
}
