package backjoonStudy;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int orderTime = sc.nextInt();
		StringBuilder out = new StringBuilder();
		for (int i = 0; i <= orderTime; i++) {
			String[] input = sc.nextLine().split(" ");
			if (input[0].equals("pop")) {
				if (stack.size() > 0) {
					result = stack.pop();
					out.append(result);
					out.append("\n");
				} else {
					out.append(-1);
					out.append("\n");
				}
				
			} 
			else if (input[0].equals("size")) {
				out.append(stack.size() + "\n");
			} 
			else if (input[0].equals("empty")) {
				if (stack.size() > 0) out.append(0);
				else out.append(1);
				out.append("\n");
			} 
			else if (input[0].equals("top")) {
				if (stack.size() > 0) out.append(stack.peek() + "\n");
				else out.append("-1\n");
			} 
			else if(input[0].equals("push")) {
				stack.push(Integer.parseInt(input[1]));			
			}
		}
		System.out.print(out);
	}
}
