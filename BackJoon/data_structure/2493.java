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
        int result = -1, max =0;
        for(int i=0;i<input.length;i++){
            result = razorPlace(st, order,input[i], i+1 , max);
            if(result <0){
                while(result < 0){
                    result = razorPlace(st, order,input[i], i+1,max);
                }
            }
            sb.append(result);
            sb.append(" ");
            st.add(input[i]);
            order.add(i+1);
            if(st.peekLast() > max) max = st.peekLast();
        }
        System.out.print(sb);
    }

    public static int razorPlace(Deque<Integer> st, Deque<Integer> order, int input, int orderNum, int max){
        int result = 0 , stLast = st.peekLast() !=null ? st.peekLast() : 0;
        if(stLast - input > 0){
            result = order.peekLast() !=null ? order.peekLast() : 0;
        }
        else{
            st.pollLast();
            order.pollLast();
            if(max > input) result = -1;
        }
        return result;
    }
}
