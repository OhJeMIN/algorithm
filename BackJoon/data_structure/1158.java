package org.example;
import java.io.*;
import java.util.*;

public class backJoon1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> outputs = new ArrayList<>();
        int K, N = 0;
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        Queue<Integer> josephus = new LinkedList<>();
        Queue<Integer> josephusNew = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            josephus.add(i);
        }
        int carryK = 0;
        while (outputs.size() != N) {
            while (!josephus.isEmpty()) {
                if (carryK > 0) {
                    int carryKk = 0;
                    for (int i = 0; i < carryK; i++) {
                        if (i == carryK - 1) {
                            int popped = (josephus.peek() != null) ? josephus.poll() : -1;
                            if (popped != -1) outputs.add(popped);
                            else carryKk++;
                        } else {
                            int popped = (josephus.peek() != null) ? josephus.poll() : -1;
                            if (popped != -1) josephusNew.add(popped);
                            else carryKk++;
                        }
                    }
                    carryK = carryKk;
                } else {
                    int carryKk = 0;
                    for (int i = 0; i < K; i++) {
                        if (i == K - 1) {
                            int popped = (josephus.peek() != null) ? josephus.poll() : -1;
                            if (popped != -1) outputs.add(popped);
                            else carryKk++;
                        } else {
                            int popped = (josephus.peek() != null) ? josephus.poll() : -1;
                            if (popped != -1) josephusNew.add(popped);
                            else carryKk++;
                        }
                    }
                    carryK = carryKk;
                }
            }
            while (!josephusNew.isEmpty()) {
                if (carryK > 0) {
                    int carryKk = 0;
                    for (int i = 0; i < carryK; i++) {
                        if (i == carryK - 1) {
                            int popped = (josephusNew.peek() != null) ? josephusNew.poll() : -1;
                            if (popped != -1) outputs.add(popped);
                            else carryKk++;
                        } else {
                            int popped = (josephusNew.peek() != null) ? josephusNew.poll() : -1;
                            if (popped != -1) josephus.add(popped);
                            else carryKk++;
                        }
                    }
                    carryK = carryKk;
                } else {
                    int carryKk = 0;
                    for (int i = 0; i < K; i++) {
                        if (i == K - 1) {
                            int popped = (josephusNew.peek() != null) ? josephusNew.poll() : -1;
                            if (popped != -1) outputs.add(popped);
                            else carryKk++;
                        } else {
                            int popped = (josephusNew.peek() != null) ? josephusNew.poll() : -1;
                            if (popped != -1) josephus.add(popped);
                            else carryKk++;
                        }
                    }
                    carryK = carryKk;
                }
            }
        }
        System.out.print("<");
        for (int i = 0; i < outputs.size(); i++) {
            if (i == outputs.size() - 1) System.out.print(outputs.get(i));
            else {
                System.out.print(outputs.get(i));
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
