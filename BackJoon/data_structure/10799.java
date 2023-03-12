package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class backJoon10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        Deque<String> razor = new ArrayDeque<>();
        int result = 0;
        String previousInput = null;
        for(int i=0;i<input.length;i++) {
            if(i>0) {
                previousInput = input[i-1];
            }
            if(input[i].equals("(")) razor.add(input[i]);
            else{
                razor.pop();
                if(previousInput.equals(")")) result += 1;
                else result += razor.size();
            }
        }
        System.out.println(result);
    }
}
