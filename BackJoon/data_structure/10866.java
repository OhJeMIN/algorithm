package org.example;
import java.io.*;
import java.util.*;

public class backJoon10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        int order =  Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0 ; i< order; i++){
            String[] input = br.readLine().split(" ");
            if(input[0].equals("push_front")) push_front(dq,Integer.parseInt(input[1]));
            else if(input[0].equals("push_back")) push_back(dq,Integer.parseInt(input[1]));
            else if(input[0].equals("pop_front")) pop_front(dq,st);
            else if(input[0].equals("pop_back")) pop_back(dq,st);
            else if(input[0].equals("size")) dqSize(dq,st);
            else if(input[0].equals("empty")) dqEmpty(dq,st);
            else if(input[0].equals("front")) front(dq,st);
            else back(dq,st);
        }
        System.out.print(st);
    }

    public static void push_front(Deque<Integer> dq , int input){
        dq.addFirst(input);
    }

    public static void push_back(Deque<Integer> dq , int input){
        dq.addLast(input);
    }

    public static void pop_front(Deque<Integer> dq , StringBuilder st){
        int dpPop = dq.peek() != null ? dq.pollFirst() : -1;
        st.append(dpPop);
        st.append("\n");
    }

    public static void pop_back(Deque<Integer> dq , StringBuilder st){
        int dpPop = dq.peekLast() != null ? dq.pollLast() : -1;
        st.append(dpPop);
        st.append("\n");
    }

    public static void dqSize(Deque<Integer> dq , StringBuilder st){
        st.append(dq.size());
        st.append("\n");
    }

    public static void dqEmpty(Deque<Integer> dq , StringBuilder st){
        if(dq.isEmpty()) st.append(1);
        else st.append(0);
        st.append("\n");
    }

    public static void front(Deque<Integer> dq , StringBuilder st){
        if(dq.isEmpty()) st.append(-1);
        else{
            int dqPeek = dq.peek() != null ? dq.peek() : -1;
            if(dqPeek > 0) st.append(dqPeek);
        }
        st.append("\n");
    }

    public static void back(Deque<Integer> dq , StringBuilder st){
        if(dq.isEmpty()) st.append(-1);
        else{
            int dqPeekLast = dq.peekLast() != null ? dq.peekLast() : -1;
            if(dqPeekLast > 0) st.append(dqPeekLast);
        }
        st.append("\n");
    }
}
