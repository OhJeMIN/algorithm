import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int nineHeightSum = 0;
        for (int i = 0; i < 9; i++) {
            int num = scanner.nextInt();
            list.add(num);
            nineHeightSum += num;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (nineHeightSum - list.get(i) - list.get(j) == 100) {
                    list.remove(i);
                    list.remove(j - 1);
                    Collections.sort(list);
                    for (int a : list) {
                        System.out.println(a);
                    }
                    return;
                }
            }
        }
    }
}
