package com.ll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int players = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();

        for(int i=0;i<players;i++){
            list.add(scanner.nextLine());
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<list.size();i++){
            char sung = list.get(i).charAt(0);
            if(!map.containsKey(sung)){
                map.put(sung,1);
            }
            else{
                map.put(sung,map.get(sung)+1);
            }
        }
        List<Character> keySet = new ArrayList<>(map.keySet());
        boolean flag = false;
        for(Character key : keySet){
            if(map.get(key)>=5) {
                System.out.print(key);
                flag = true;
            }
        }
        if(!flag) System.out.println("PREDAJA");
    }
}
