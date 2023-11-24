import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String[] Sign;
    private static boolean[] Visited;
    private static ArrayList<String> Answer = new ArrayList<>();
    private static int K;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        sc.nextLine();
        Sign = sc.nextLine().split(" ");
        Visited = new boolean[10];

        dfs("" , 0);
        System.out.println(Answer.get(Answer.size()-1));
        System.out.println(Answer.get(0));
    }

    private static void dfs(String nums, int idx) {
        if (idx == K+1) {
            Answer.add(nums);
            return;
        }
        for (int i = 0; i < 10; i++){
            if(Visited[i]) continue;

            if(idx == 0 || check(nums.charAt(idx-1) - '0' ,i , Sign[idx-1])){
                Visited[i] = true;
                dfs(nums+i, idx+1);
                Visited[i] = false;

            }
        }
    }

    private static boolean check(int a, int b, String c){
        if(c.equals(">")){
            if(a > b) return true;
        }else{
            if(a < b) return true;
        }
        return false;
    }
}
