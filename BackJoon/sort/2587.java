
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.valueOf(sc.nextLine()));
        }
        System.out.println((int) list.stream().mapToInt(Integer::intValue).average().getAsDouble());
        Collections.sort(list);
        System.out.println(list.get(list.size()/2));
    }
}
