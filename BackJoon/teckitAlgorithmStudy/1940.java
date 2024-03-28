import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int sum = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        System.out.println(IntStream.range(0,nums.length).
                flatMap(i -> IntStream.range(i + 1, nums.length)
                        .filter(j -> Integer.parseInt(nums[i]) + Integer.parseInt(nums[j]) == sum))
                .count());
    }
}
