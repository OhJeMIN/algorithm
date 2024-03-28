import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        long a = Long.parseLong(num[0]);
        long b = Long.parseLong(num[1]);
        long c = Long.parseLong(num[2]);
        System.out.println(divide(a,b,c));
    }
    public static long divide(Long a, Long b, Long c){
        if(b == 0 ){
            return 1;
        }
        long tmp = divide(a, b/2 ,c);

        if(b % 2==1){
            return (tmp * tmp % c) * a %c;
        }
        else{
            return tmp * tmp % c;
        }
    }
}
