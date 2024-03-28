package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] secretWord = scanner.nextLine().split(" ");
        for (int k = 0; k < secretWord.length; k++) {
            String word = secretWord[k];
            StringBuilder st = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                    st.append((char) ((word.charAt(i) - 'a' + 13) % 26 + 'a'));
                } else if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    st.append((char) ((word.charAt(i) - 'A' + 13) % 26 + 'A'));
                } else if (Character.isDigit(word.charAt(i))) st.append(word.charAt(i));
            }
            secretWord[k] = st.toString();
        }
        for (String s : secretWord) {
            System.out.print(s + " ");
        }
    }
}
