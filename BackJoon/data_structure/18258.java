package org.example;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        Long count = Long.parseLong(br.readLine());
        selfMadeQueue(count, br, st);
    }

    public static void selfMadeQueue(Long count, BufferedReader br, StringBuilder st) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        if(count != 0){
            for(int i=0; i<count; i++){
                String orderLine = br.readLine();
                String[] order = orderLine.split(" ");
                if(order[0].equals("push")) deque = push(deque,Integer.parseInt(order[1]));
                else if(order[0].equals("pop")) deque = pop(deque, st);
                else if(order[0].equals("size")) size(deque, st);
                else if(order[0].equals("empty")) isEmpty(deque, st);
                else if(order[0].equals("front")) front(deque, st);
                else back(deque, st);
            }
        }
        System.out.print(st);
    }

    public static Deque push(Deque<Integer> deque, int order){
        deque.add(order);
        return deque;
    }

    public static Deque pop(Deque<Integer> deque, StringBuilder st){
        if(deque.isEmpty()) {
            st.append(-1);
            st.append("\n");
        }
        else {
            st.append(deque.peek());
            st.append("\n");
            deque.remove();
        }
        return deque;
    }

    public static void size(Deque<Integer> deque,StringBuilder st){
        st.append(deque.size());
        st.append("\n");
    }

    public static void isEmpty(Deque<Integer> deque,StringBuilder st){
        if(deque.isEmpty()) {
            st.append(1);
            st.append("\n");
        }
        else {
            st.append(0);
            st.append("\n");
        }
    }

    public static void front(Deque<Integer> deque, StringBuilder st){
        if(deque.isEmpty()) {
            st.append(-1);
            st.append("\n");
        }
        else {
            st.append(deque.peek());
            st.append("\n");
        }
    }

    public static void back(Deque<Integer> deque, StringBuilder st){
        if(deque.isEmpty()) {
            st.append(-1);
            st.append("\n");
        }
        else {
            st.append(deque.peekLast());
            st.append("\n");
        }
    }
}
