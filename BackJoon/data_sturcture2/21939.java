import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

class Problem implements Comparable<Problem>{
    int num,level;

    Problem(int num, int level){
        this.num = num;
        this.level = level;
    }

    @Override
    public int compareTo(Problem o) {
        if(level == o.level) return num-o.num;
        else return level - o.level;
    }
}

public class backJoon21939 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static TreeSet<Problem> treeSet = new TreeSet<Problem>();
    static int[] problem = new int[100010];
    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String[] input = br.readLine().split(" ");
            treeSet.add(new Problem(Integer.parseInt(input[0]),Integer.parseInt(input[1])));
            problem[Integer.parseInt(input[0])] = Integer.parseInt(input[1]);
        }
        int M = Integer.parseInt(br.readLine());
        for(int i=0;i<M;i++){
            String[] input = br.readLine().split(" ");
            if(input[0].equals("add")){
                treeSet.add(new Problem(Integer.parseInt(input[1]),Integer.parseInt(input[2])));
                problem[Integer.parseInt(input[1])] = Integer.parseInt(input[2]);
            }
            else if(input[0].equals("solved")){
                treeSet.remove(new Problem(Integer.parseInt(input[1]),problem[Integer.parseInt(input[1])]));
            }
            else{
                if(Integer.parseInt(input[1]) == 1) System.out.println(treeSet.last().num);
                else System.out.println(treeSet.first().num);
            }
        }
    }
}
