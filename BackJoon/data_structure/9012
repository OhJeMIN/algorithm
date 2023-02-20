package backjoonStudy;
import java.io.*;
import java.util.*;

public class backJoon9012 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int order = Integer.parseInt(br.readLine());		 		 
		 for(int i = 0; i< order; i++) {			 
			 String[] ps = br.readLine().split("");			 
			 recognizeVps(ps);
		 }
		 br.close();
	}
	public static void recognizeVps(String[] ps) {
		Stack<String> stack = new Stack<>();
		stack.push(ps[0]);
		for(int k = 1; k < ps.length; k++) {			
			 if(stack.empty()) stack.push(ps[k]);
			 else if(stack.peek().equals(ps[k])) stack.push(ps[k]);
			 else if(stack.peek().equals(")") && ps[k].equals("(")) stack.push(ps[k]);
			 else stack.pop();			 
		 }
		if(stack.empty()) System.out.println("YES");
		else System.out.println("NO");
	}

}
