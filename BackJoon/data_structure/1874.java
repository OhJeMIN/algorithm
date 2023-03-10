package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class backJoon1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> input = new Stack<>();
        int[] num = new int[n];
        for(int i= 0;i <n; i++) num[i]= Integer.parseInt(br.readLine());
        int chkAscend = 0;
        for(int i=1;i <=n; i++){
            input.add(i);
            st.append("+");
            st.append("\n");
            while(!input.isEmpty()){
                if(num[chkAscend] != input.peek()){
                    break;
                }
                else{
                    input.pop();
                    st.append("-");
                    st.append("\n");
                    chkAscend++;
                }
            }
        }
        if(input.isEmpty()){
            System.out.print(st);
        }
        else System.out.println("NO");
    }
}
