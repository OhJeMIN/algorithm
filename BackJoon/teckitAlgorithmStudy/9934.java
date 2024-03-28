import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static String[] Node;
    private static int[][] Tree;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.nextLine();
        Node = sc.nextLine().split(" ");
        Tree = new int[Node.length][Node.length];
        findParentNode(0, Node.length-1, 0);
        for(int y=0;y<K;y++){
            for(int x = 0;x < Tree[y].length;x++){
                if(Tree[y][x] > 0) System.out.print(Tree[y][x] + " ");
            }
            System.out.println();
        }
    }

    private static void findParentNode(int start, int len, int level) {
        int divided = len - start;

        if(divided > 3){
            int center = divided/2 + start;
            Tree[level][center] = Integer.parseInt(Node[center]);
            findParentNode(start,center-1, level+1);
            findParentNode(center+1, len, level+1);
        }else{
            int center = divided/2 + start;
            Tree[level][center] = Integer.parseInt(Node[center]);
            Tree[level+1][center-1] = Integer.parseInt(Node[center-1]);
            Tree[level+1][center+1] = Integer.parseInt(Node[center+1]);

        }
    }

}



