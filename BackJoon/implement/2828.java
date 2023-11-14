import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int left = 0, right = left + M - 1;

        int apple = sc.nextInt();
        int count = 0;
        for (int i = 0; i < apple; i++) {
            int idx =  sc.nextInt()-1;
            if (idx > right) {
                int distance = idx - right;
                count += distance;
                right += distance;
                left += distance;
            } else if (idx < left) {
                int distance = left - idx;
                count += distance;
                right -= distance;
                left -= distance;
            }
        }
        System.out.println(count);
    }
}

