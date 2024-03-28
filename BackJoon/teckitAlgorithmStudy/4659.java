package com.ll;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] gather = new String[]{"a", "e", "i", "o", "u"};
        //Consonant
        while (true) {
            String testCase = scanner.nextLine();
            if (testCase.equals("end")) break;
            boolean flag = false;
            for (int i = 0; i < gather.length; i++) {
                if (testCase.contains(gather[i])) flag = true;
            }
            if (testCase.length() >= 3) {
                for (int i = 0; i <= testCase.length() - 3; i++) {
                    int count = 0;
                    for (int j = 0; j < gather.length; j++) {
                        String tmp = testCase.substring(i, i + 3);
                        if (tmp.contains(gather[j])) {
                            count += tmp.length() - tmp.replace(gather[j], "").length();
                        }
                    }
                    if (count == 3 || count == 0) flag = false;
                }
            }
            if (testCase.length() >= 2) {
                for (int i = 0; i <= testCase.length() - 2; i++) {
                    int count = 0;
                    String tmp = testCase.substring(i, i + 2);
                    for (int j = 0; j < gather.length; j++) {
                        if (tmp.contains(gather[j])) {
                            count += tmp.length() - tmp.replace(gather[j], "").length();
                        }
                    }
                    if (count == 2 || count == 0) {
                        if(tmp.equals("ee") || tmp.equals("oo")){}
                        else if (tmp.equals("aa") || tmp.equals("ii") || tmp.equals("uu") || tmp.charAt(0) == tmp.charAt(1)) {
                            flag = false;
                        }
                    }
                }
            }
            if (flag) System.out.println("<" + testCase + "> is acceptable.");
            else System.out.println("<" + testCase + "> is not acceptable.");
        }
    }
}

