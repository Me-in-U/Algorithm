package SWEA.P1249번_보급로;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.setIn(
                new FileInputStream("C:\\Users\\SSAFY\\Documents\\GitHub\\Algorithm\\SWEA\\P1249번_보급로\\input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] map = new int[N][N];
            for (int x = 0; x < N; x++) {
                String line = br.readLine();
                for (int y = 0; y < N; y++) {
                    map[x][y] = line.charAt(y) - '0';
                }
            }
            int[][] dist = new int[N][N];
            for (int x = 0; x < N; x++) {
                Arrays.fill(dist[x], Integer.MAX_VALUE);
            }
            dist[0][0] = 0;
            int[] dx = { -1, 1, 0, 0 };
            int[] dy = { 0, 0, -1, 1 };
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
            pq.offer(new int[] { 0, 0, 0 });
            while (!pq.isEmpty()) {
                int[] cur = pq.poll();
                int time = cur[0];
                int x = cur[1];
                int y = cur[2];
                if (time > dist[x][y])
                    continue;
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    if (nx < 0 || nx >= N || ny < 0 || ny >= N)
                        continue;
                    int nCost = time + map[nx][ny];
                    if (nCost < dist[nx][ny]) {
                        dist[nx][ny] = nCost;
                        pq.offer(new int[] { nCost, nx, ny });
                    }
                }
            }
            sb.append("#").append(i).append(" ").append(dist[N - 1][N - 1]).append("\n");
        }
        System.out.print(sb.toString());
    }
}
