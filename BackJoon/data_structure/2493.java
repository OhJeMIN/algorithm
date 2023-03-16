package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class backJoon2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] input = new int[N];
        String[] str = br.readLine().split(" ");
        for(int i=0;i<input.length;i++){
            input[i] = Integer.parseInt(str[i]);
        }
        chkQueue(input);
    }
    public static void chkQueue(int[] input){
        Deque<Integer> st = new ArrayDeque<Integer>();
        Deque<Integer> order = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        int result = -1;
        for(int i=0;i<input.length;i++){
            System.out.println(i+"번째");
            sb.append( razorPlace(st, order,input[i], i+1));
            result = -1;

        }
        System.out.println(sb);
    }

    public static int razorPlace(Deque<Integer> st, Deque<Integer> order, int input, int orderNum){
        int result = 0 , stLast = st.peekLast() !=null ? st.peekLast() : 0;
        if(stLast - input > 0){
            result = order.peekLast() !=null ? order.peekLast() : 0;
        }
        else{
            st.pollLast();
            order.pollLast();
        }
        st.add(input);
        order.add(orderNum);
        System.out.println("input ==" + input);
        System.out.println("st ==" + st);
        System.out.println("result ==" + result);
        return result;
    }
}
