import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        String s;

        while (true) {
            s = in.nextLine();

            if (s.equals(".")) {
                break;
            }
            System.out.println(balance(s));
        }

    }

    private static String balance(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[') {
                st.push(c);
            }


            else if(c == ')') {

                if(st.empty() || st.peek() != '(') {
                    return "no";
                }
                else {
                    st.pop();
                }
            }

            else if(c == ']') {

                if(st.empty() || st.peek() != '[') {
                    return "no";
                }
                else {
                    st.pop();
                }
            }
        }
        if(st.empty()) {
            return "yes";
        }
        else {
            return "no";
        }
    }
}
