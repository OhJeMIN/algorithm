package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*1
* 피연산자의 개수 nmbrOprnd, 후위표기식 postfixNotation 입력받는다.
*  후위연산자를 만들 queue 하나, 후위표기식을 만들 queue 두개 생성
* 세번째부터 변수들을 받아서 후위 표기식을 완성 시킴 -> generatePn
* 만든 후위 표기식으로 stack에 넣는 와중에 연산자를 넣을때 이미 넣은 stack 에서 2개를 pop 시키고 2개를 통해 연산 후 stack 에 push
* for문을 다 돌리고 stack에 제일 위에것 출력하는 함수 -> calculator
* */
public class backJoon1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        int oprndNmbr = Integer.parseInt(br.readLine());
        String postfixNotation = br.readLine();
        generatePn(postfixNotation, oprndNmbr, br);

    }

    public static void generatePn (String postfixNotation, int oprndNmbr, BufferedReader br) throws IOException {
        Queue<Integer> pnS= new LinkedList<>();
        Stack<Double> pnQs= new Stack<>();
        for(int i=0;i<oprndNmbr;i++) pnS.add(Integer.parseInt(br.readLine()));
        for(int i=0;i<postfixNotation.length();i++){
           if(postfixNotation.charAt(i) >= 'A' && postfixNotation.charAt(i) <= 'Z') {
               pnQs.add(Double.valueOf(pnS.poll()));
               System.out.println(pnQs);
           }
           else {
               pnQs.add(calculator(pnQs.pop(),pnQs.pop(),Character.toString(postfixNotation.charAt(i))));
           }
        }
        System.out.println(String.format("%.2f",pnQs.peek()));
    }

    public static double calculator(Double A, Double B, String operator){
        double result = 0;
        if(operator.equals("+")) result = B + A;
        else if(operator.equals("-")) result = B - A;
        else if(operator.equals("*")) result = B * A;
        else result = B / A;
        System.out.println("operator ==" + operator);
        System.out.println(result +" == " +A+" "+operator+" "+B);
        return result;
    }
}
