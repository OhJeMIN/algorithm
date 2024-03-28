import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static boolean[] visited = new boolean[100001];
    private static int[] road = new int[100001];
    private static int subin;
    private static int brother;
    private static int count = 0;
    private static int fastestTime = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        subin = sc.nextInt();
        brother = sc.nextInt();

        if (subin >= brother) {
            System.out.println((subin - brother));
            System.out.println(1);
            return;
        }


        System.out.println(teleport(subin) -1);
        System.out.println(count);
    }


    private static int teleport(int idx) {
        Queue<Integer> q = new LinkedList<>();
        road[idx] = 1;
        q.add(idx);
        while (!q.isEmpty()) {
            int time = q.poll();

            if (time == brother) {
                count++;
            }

            if (time - 1 > 0 && time - 1 < 100001) {
								// 이미 방문한 곳이어도 같은 시간에 방문했다면 넣어준다.
                if (road[time - 1] == 0 || road[time - 1] == road[time] + 1) {
                    road[time - 1] = road[time] + 1;
                    q.add(time - 1);
                }
            }
            if (time + 1 > 0 && time + 1 < 100001) {
                if (road[time + 1] == 0 || road[time + 1] == road[time] + 1) {
                    road[time + 1] = road[time] + 1;
                    q.add(time + 1);
                }
            }
            if (time * 2 > 0 && time * 2 < 100001) {
                if (road[time * 2] == 0 || road[time * 2] == road[time] + 1) {
                    road[time * 2] = road[time] + 1;
                    q.add(time * 2);
                }
            }
        }
        return road[brother];
    }
}
