package com.ll;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for(int i=0;i<num;i++){
            Stack<String> st = new Stack<>();
            String[] word = scanner.nextLine().split("");
            for(int j =0;j<word.length;j++){
                if(st.isEmpty()) {
                    st.push(word[j]);
                    continue;
                }
                if(st.peek().equals(word[j])) st.pop();
                else st.push((word[j]));
            }
            if(st.size() == 0) count++;
        }
        System.out.println(count);
    }
}
