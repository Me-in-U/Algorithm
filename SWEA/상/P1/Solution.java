package SWEA.상.P1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
    protected static int N;
    protected static int[][] map;
    protected static boolean[][] visited;
    protected static int[] dx = { 0, 1, 0, -1 };
    protected static int[] dy = { 1, 0, -1, 0 };
    protected static int[] startPoint;
    protected static int[] endPoint;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            sb.append('#').append(t).append(' ');
            N = Integer.parseInt(br.readLine());
            map = new int[N][N];
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                String[] line = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(line[j]);
                }
            }
            String[] temp = br.readLine().split(" ");
            startPoint = new int[] { Integer.parseInt(temp[0]), Integer.parseInt(temp[1]) };
            temp = br.readLine().split(" ");
            endPoint = new int[] { Integer.parseInt(temp[0]), Integer.parseInt(temp[1]) };
            sb.append(bfs()).append('\n');
        }
        System.out.print(sb.toString());
    }

    public static int bfs() {
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[] { startPoint[0], startPoint[1], 0 });
        visited[startPoint[0]][startPoint[1]] = true;
        while (!deque.isEmpty()) {
            int[] current = deque.poll();
            int nowX = current[0];
            int nowY = current[1];
            int time = current[2];
            if (nowX == endPoint[0] && nowY == endPoint[1]) {
                return time;
            }
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (0 <= nextX && nextX < N && 0 <= nextY && nextY < N && !visited[nextX][nextY]) {
                    if (map[nextX][nextY] == 0) {
                        visited[nextX][nextY] = true;
                        deque.add(new int[] { nextX, nextY, time + 1 });
                    } else if (map[nextX][nextY] == 2) {
                        if (time % 3 == 2) {
                            visited[nextX][nextY] = true;
                            deque.add(new int[] { nextX, nextY, time + 1 });
                        } else {
                            deque.add(new int[] { nowX, nowY, time + 1 });
                        }
                    }
                }
            }
        }
        return -1;
    }
}
