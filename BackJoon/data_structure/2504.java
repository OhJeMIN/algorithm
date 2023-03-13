package org.example;
import java.io.*;
import java.util.*;

public class backJoon2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        if(input.length > 30 || input.length < 1){
            System.out.println(0);
        }else{
            calculator(input);
        }
    }
    public static void calculator(String[] input) {
        Stack<String> st = new Stack<>();
        int result = 1, answer = 0;
        Boolean wrong = true;
        String previousInput = null;
        for (int i = 0; i < input.length; i++) {
            if(i>0) previousInput = input[i-1];
            else previousInput = input[0];
            if (input[i].equals("(") || input[i].equals("[")) {
                result = openBracket(input[i],st, result);
            }
            else{ // input == ) or ]
                if(st.isEmpty()) {
                    wrong = false;
                    break;
                }
                if(input[i].equals(")")){
                    if(!st.peek().equals("(") || st.isEmpty()){
                        wrong = false;
                        break;
                    }
                    if(previousInput.equals("(")) {
                        answer += result;
                    }
                    st.pop();
                    result /=2;

                }
                else if(input[i].equals("]")){//input == ]
                    if(!st.peek().equals("[") || st.isEmpty()){
                        wrong = false;
                        break;
                    }
                    if(previousInput.equals("[")) {
                        answer +=result;
                    }
                    st.pop();
                    result /= 3;
                }
                else{
                    wrong = false;
                    break;
                }
            }
        }
        if(!wrong || !st.isEmpty()) System.out.println(0);
        else System.out.println(answer);
    }
    public static int openBracket(String input, Stack<String> st, int result){
        if(input.equals("(")){
            st.add(input);
            result *=2;
        }
        else if(input.equals("[")) { // [
            st.add(input);
            result *=3;
        }
        return result;
    }
}
