import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");
        calculator(input);
    }
    public static void calculator(String[] input) {
        Stack<String> st = new Stack<>();
        int result = 1, answer = 0, wrong = -1;
        String previousInput = "X";
        for (int i = 0; i < input.length; i++) {
            if(i>0) previousInput = input[i-1];
            if (input[i].equals("(") || input[i].equals("[")) {
                result = openBracket(input[i],st, result);
            }
            else{ // input == ) or ]
                if(input[i].equals(")")){
                    if(previousInput.equals(")") || previousInput.equals("]")){
                        result /=2;
                        if(!st.isEmpty()) st.pop();
                    }
                    else{
                        int correct = closeBracket(input[i],previousInput,st,answer,result);
                        if( correct>0) answer = correct;
                        else wrong = 0;
                        result /=2;
                    }
                }
                else{//input == ]
                    if(previousInput.equals("]") || previousInput.equals(")")){
                        result /=3;
                        if(!st.isEmpty()) st.pop();
                    }
                    else{
                        int correct = closeBigBracket(input[i],previousInput,st,answer,result);
                        if( correct>0) answer = correct;
                        else wrong = 0;
                        result /=3;
                    }
                }
            }
        }
        if(wrong == 0) System.out.println(wrong);
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
    public static int closeBracket(String input,String previousInput, Stack<String> st, int answer, int result){
        int wrong = -1;
        if(input.equals(")")){
            if(st.isEmpty() || previousInput.equals("[")){
                wrong = 0;
            }
            if(previousInput.equals("(")) {
                answer +=result;
            }
        }
        if(!st.isEmpty()) st.pop();
        if(wrong == 0) answer = wrong;
        return answer;
    }

    public static int closeBigBracket(String input,String previousInput, Stack<String> st, int answer, int result){
        int wrong = -1;
        if(input.equals("]")){
            if(st.isEmpty() || previousInput.equals("(")){
                wrong = 0;
            }
            if(previousInput.equals("[")) {
                answer +=result;
            }
        }
        if(!st.isEmpty()) st.pop();
        if(wrong == 0) answer = wrong;
        return answer;
    }
}
