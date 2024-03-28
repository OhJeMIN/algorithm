import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Character> list = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i< s.length();i++){
            list.add(s.charAt(i));
        }
        Collections.reverse(list);
        for(Character c : list) answer.append(c);
        System.out.println(s.contentEquals(answer) ? 1 : 0);
    }

}
