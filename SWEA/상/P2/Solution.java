package SWEA.상.P2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    protected static int N;
    protected static int visitedCount;
    protected static boolean[][] isBoom;
    protected static boolean[][] visited;

    protected static int[] dx = { 0, 1, 0, -1, 1, -1, 1, -1 };
    protected static int[] dy = { 1, 0, -1, 0, 1, -1, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            sb.append('#').append(i).append(' ');
            N = Integer.parseInt(br.readLine());
            isBoom = new boolean[N][N];
            visited = new boolean[N][N];
            visitedCount = 0;
            for (int n1 = 0; n1 < N; n1++) {
                String line = br.readLine();
                for (int n2 = 0; n2 < N; n2++) {
                    if (line.charAt(n2) == '*') {
                        isBoom[n1][n2] = (line.charAt(n2) == '*');
                        visited[n1][n2] = true;
                        visitedCount++;
                    }
                }
            }
            int clickCount = 0;
            for (int n1 = 0; n1 < N; n1++) {
                for (int n2 = 0; n2 < N; n2++) {
                    if (!visited[n1][n2] && isZero(n1, n2)) {
                        bfs(n1, n2);
                        clickCount++;
                    }
                }
            }
            clickCount += ((N * N) - visitedCount);
            sb.append(clickCount).append('\n');
        }
        System.out.println(sb);
    }

    public static boolean isZero(int x, int y) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int nextX = x + dx[i];
                int nextY = y + dy[j];
                if (0 <= nextX && nextX < N && 0 <= nextY && nextY < N) {
                    if (isBoom[nextX][nextY]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void bfs(int x, int y) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] { x, y });
        visited[x][y] = true;
        visitedCount++;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int cx = curr[0];
            int cy = curr[1];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    int nextX = cx + dx[i];
                    int nextY = cy + dy[j];
                    if (0 <= nextX && nextX < N && 0 <= nextY && nextY < N) {
                        if (!visited[nextX][nextY]) {
                            visited[nextX][nextY] = true;
                            visitedCount++;
                            if (isZero(nextX, nextY)) {
                                queue.add(new int[] { nextX, nextY });
                            }
                        }
                    }
                }
            }
        }
    }
}