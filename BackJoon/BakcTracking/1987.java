import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    private static Character[][] Count;
    private static int N, M;
    private static int max = Integer.MIN_VALUE;
    private static HashSet<Character> hs;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Count = new Character[N][M];
        hs = new HashSet<>();
        for (int y = 0; y < N; y++) {
            String place = br.readLine();
            for (int x = 0; x < M; x++) {
                char val = place.charAt(x);
                Count[y][x] = val;
            }
        }
        backTracking(0, 0);
        System.out.println(max);
    }

    private static void backTracking(int y, int x) {
        if (hs.contains(Count[y][x])) return;
        hs.add(Count[y][x]);
        max = Math.max(max, hs.size());
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (ny < 0 || ny >= N || nx < 0 || nx >= M) continue;
            if (hs.contains(Count[ny][nx])) continue;
            backTracking(ny, nx);
            hs.remove(Count[ny][nx]);
        }
    }
}
