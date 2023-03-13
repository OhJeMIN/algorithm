package org.example;
import java.io.*;
import java.util.*;

public class backJoon2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        calculator(input);
    }
    public static void calculator(String[] input) {
        Stack<String> st = new Stack<>();
        int result = 1, answer = 0;
        Boolean wrong = true;
        String previousInput = "X";
        for (int i = 0; i < input.length; i++) {
            if(i>0) previousInput = input[i-1];
            if (input[i].equals("(") || input[i].equals("[")) {
                result = openBracket(input[i],st, result);
            }
            else{ // input == ) or ]
                if(st.isEmpty()) {
                    wrong = false;
                    break;
                }
                if(input[i].equals(")")){
                    if(previousInput.equals(")") || previousInput.equals("]")){
                        result /=2;
                        st.pop();

                    }
                    else{
                        int correct = closeBracket(input[i],st,answer,result);
                        if( correct>0) answer = correct;
                        else {
                            wrong = false;
                            break;
                        }
                        result /=2;
                    }
                }
                else if(input[i].equals("]")){//input == ]
                    if(previousInput.equals("]") || previousInput.equals(")")){
                        result /=3;
                        st.pop();

                    }
                    else{
                        int correct = closeBigBracket(input[i],st,answer,result);
                        if( correct>0) answer = correct;
                        else {
                            wrong = false;
                            break;
                        }
                        result /=3;
                    }
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
            st.add("(");
            result *=2;
        }
        else { // [
            st.add("[");
            result *=3;
        }
        return result;
    }
    public static int closeBracket(String input, Stack<String> st, int answer, int result){
        int wrong = -1;
        if(input.equals(")")){
            if(st.isEmpty() || !st.peek().equals("(")){
                wrong = 0;
            }
            if(st.peek().equals("(")) {
                answer +=result;
            }
        }
        if(!st.isEmpty()) st.pop();
        if(wrong == 0) answer = wrong;
        return answer;
    }

    public static int closeBigBracket(String input, Stack<String> st, int answer, int result){
        int wrong = -1;
        if(input.equals("]")){
            if(st.isEmpty() || !st.peek().equals("[")){
                wrong = 0;
            }
            if(st.peek().equals("[")) {
                answer +=result;
            }
        }
        if(!st.isEmpty()) st.pop();
        if(wrong == 0) answer = wrong;
        return answer;
    }
}
