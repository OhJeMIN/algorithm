import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String[] nodes;
    private static int deleteNode;
    private static int root;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodeSize = Integer.parseInt(scanner.nextLine());
        nodes = scanner.nextLine().split(" ");
        deleteNode = scanner.nextInt();

        for (int i = 0; i < nodeSize; i++) {
            if (Integer.parseInt(nodes[i]) == -1) {
                root = i;
                break;
            }
        }

        if (deleteNode == root) {
            System.out.println(0);
            return;
        }

        int count = 0;
        nodes[deleteNode] = null;
        remove(deleteNode);

        boolean hasChild[] = new boolean[nodeSize];
        Arrays.fill(hasChild, false);

        for (int i = 0; i < nodeSize; i++) {
            if (nodes[i] != null) {
                int parentNode = Integer.parseInt(nodes[i]);
                if (parentNode >= 0 && parentNode < nodeSize) {
                    hasChild[parentNode] = true;
                }
            }
        }

        for (int i = 0; i < nodeSize; i++) {
            if (!hasChild[i] && nodes[i] != null)
                count++;
        }
        System.out.println(count);
    }

    public static void remove(int nodeIdx) {
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] != null) {
                int parentNode = Integer.parseInt(nodes[i]);
                if (parentNode == nodeIdx) {
                    nodes[i] = null;
                    remove(i);
                }
            }
        }
    }
}


