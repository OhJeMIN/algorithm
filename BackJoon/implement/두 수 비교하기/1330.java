import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        if(Integer.parseInt(nums[0]) < Integer.parseInt(nums[1])){
            System.out.println('<');
        }
        else if(Integer.parseInt(nums[0]) > Integer.parseInt(nums[1])){
            System.out.println('>');
        }
        else System.out.println("==");
    }
}
