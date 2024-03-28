package com.ll;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static Integer[] TestCase;
    private static Stack<Integer> st;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        TestCase = new Integer[N];
        for (int i = 0; i < N; i++) {
            TestCase[i] = scanner.nextInt();
        }
        st = new Stack<>();
        for(int i=0;i<N;i++){
            while(!st.isEmpty() && TestCase[st.peek()] < TestCase[i]) {
                TestCase[st.pop()] = TestCase[i];
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            TestCase[st.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(TestCase[i]).append(' ');
        }

        System.out.println(sb);
    }


}


