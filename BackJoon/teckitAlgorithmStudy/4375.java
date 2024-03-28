import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scaner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(scaner.hasNextInt()){
            int num = scaner.nextInt();
            sb.append(findNum(num,1, 1) + "\n");
        }
        System.out.println(sb);
    }

    public static int findNum(int num,int idx, int consistsOne) {
        if (consistsOne % num == 0) {
            return idx;
        }
        consistsOne = (consistsOne * 10 + 1) % num;
        return findNum(num,idx +1 ,consistsOne);
    }
}
