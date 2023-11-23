import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    private static boolean[][] visited;
    private static int[][] Count;
    private static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Count = new int[N][M];
        visited = new boolean[N][M];

        st = new StringTokenizer(br.readLine());
        int junanY = Integer.parseInt(st.nextToken()) - 1;
        int junanX = Integer.parseInt(st.nextToken()) - 1;
        int BuminY = Integer.parseInt(st.nextToken()) - 1;
        int BuminX = Integer.parseInt(st.nextToken()) - 1;
        for (int y= 0; y < N; y++) {
            String place = br.readLine();
            for (int x = 0; x < M; x++) {
                char val = place.charAt(x);
                if (val == '#' || val == '*') continue;
                Count[y][x] = val - '0';
            }
        }
        Count[BuminY][BuminX] = 1;
        System.out.println(BFS(junanX, junanY, BuminY, BuminX));
    }

    private static int BFS(int junanX, int junanY, int BuminY, int BuminX) {
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(new Node(junanX, junanY, 0));
        visited[junanY][junanX] = true;
        while (!q.isEmpty()) {
            Node now = q.poll();
            if (now.x == BuminX && now.y == BuminY) return now.time;
            for (int k = 0; k < 4; k++) {
                int x = now.x + dx[k];
                int y = now.y + dy[k];
                if (x < 0 || x >= M || y < 0 || y >= N)
                    continue;

                if (visited[y][x]) continue;

                visited[y][x] = true;
                if (Count[y][x] == 0) {
                    q.offerFirst(new Node(x, y, now.time));
                } else {
                    q.offerLast(new Node(x, y, now.time+ 1));
                }
            }
        }
        return -1;
    }

    private static class Node {
        int x, y, time;

        public Node(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time= time;
        }
    }
}
