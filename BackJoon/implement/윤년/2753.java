import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean flag = (num%4==0 && num%100!=0 || num%400==0) ? true : false;
        if (flag) System.out.println(1);
        else System.out.println(0);
    }
}
