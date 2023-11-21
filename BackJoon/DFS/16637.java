import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> nums = new ArrayList<>();
    private static ArrayList<Character> Operator = new ArrayList<>();
    private static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String test = br.readLine();
        for (int i = 0; i < test.length(); i++) {
            if (i % 2 == 0) nums.add(test.charAt(i) - '0');
            else Operator.add(test.charAt(i));
        }
        Dfs(nums.get(0), 0);
        System.out.println(answer);


    }

    private static void Dfs(int result, int idx) {
        if (idx >= Operator.size()) {
            answer = Math.max(answer, result);
            return;
        }

        int value = calcuator(result, nums.get(idx + 1), Operator.get(idx));
        Dfs(value, idx + 1);

        if (idx + 1 < Operator.size()) {
            int valueNext = calcuator(nums.get(idx + 1), nums.get(idx + 2), Operator.get(idx + 1));
            Dfs(calcuator(result, valueNext, Operator.get(idx)), idx + 2);
        }
    }

    private static int calcuator(int left, int right, Character oper) {
        switch (oper) {
            case '+':
                return left + right;
            case '-':
                return left - right;
            case '*':
                return left * right;
        }
        return -1;
    }
}


