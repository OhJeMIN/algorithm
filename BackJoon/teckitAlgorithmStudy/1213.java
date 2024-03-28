import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> answers = new ArrayList<>();
        String testCase = br.readLine();
        int[] alpabet = new int[26];
        for (int i = 0; i < testCase.length(); i++) {
            alpabet[testCase.charAt(i) - 'A']++;
        }
        String center = "";
        for (int i = 0; i < alpabet.length; i++) {
            if (alpabet[i] % 2 != 0) {
                center += (char) (i + 'A');
            }
        }
        if (center.length() > 1 || (center.length() == 1 && testCase.length() % 2 == 0)) {
            System.out.println("I'm Sorry Hansoo");
            return;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < alpabet.length; i++) {
                for (int j = 0; j < alpabet[i] / 2; j++) {
                    sb.append((char) (i + 'A'));
                }
            }
            StringBuffer tmp = new StringBuffer(sb.toString());
            if (center.length() == 1) {
                sb.append(center);
            }
            System.out.println(sb.toString() + tmp.reverse());
        }
    }
}
