package org.example;
import java.io.*;
import java.util.*;
/*
* 1~N번쨰 카드, N번째가 제일 아래 -> Queue 사용
* 함수 card2 제일 위에꺼 poll, 후 한번더 poll해서 다시 add
*
* */
public class backJoon2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input =  Integer.parseInt(br.readLine());
        Queue<Integer> cardPack = new LinkedList<>();        ;
        int result = card2(generateCardPack(cardPack, input));
        System.out.println(result);
    }
    public static Queue<Integer> generateCardPack(Queue<Integer> cardPack, int input){
        for(int i = 1; i<= input; i++){
            cardPack.add(i);
        }
        return cardPack;
    }
    public static int card2(Queue<Integer> cardPack){
        int result = 0, card = 0;
        while(!cardPack.isEmpty()){
            if(cardPack.size() == 1) result = cardPack.poll();
            cardPack.poll();
            card = (cardPack.peek() != null) ? cardPack.poll() : -1;
            if(card > 0) cardPack.add(card);
        }
        return result;
    }
}
