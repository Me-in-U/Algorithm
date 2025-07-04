package SWEA.P파핑파핑_지뢰찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    private static final int[] DX = { -1, -1, -1, 0, 0, 1, 1, 1 };
    private static final int[] DY = { -1, 0, 1, -1, 1, -1, 0, 1 };
    private static int N;
    private static char[][] map;
    private static int[][] adjMineCount;
    private static boolean[][] isClicked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            // 입력 및 초기화
            N = Integer.parseInt(br.readLine());
            map = new char[N][N];
            adjMineCount = new int[N][N];
            isClicked = new boolean[N][N];
            for (int x = 0; x < N; x++)
                map[x] = br.readLine().toCharArray();

            // 인접한 지뢰 카운트
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    if (map[x][y] == '.') {
                        int count = 0;
                        for (int d = 0; d < 8; d++) {
                            int nx = x + DX[d];
                            int ny = y + DY[d];
                            if (0 <= nx && nx < N && 0 <= ny && ny < N && map[nx][ny] == '*') {
                                count++;
                            }
                        }
                        adjMineCount[x][y] = count;
                    }
                }
            }

            // 주변 지뢰가 없는 빈 공간 클릭
            int clickCount = 0;
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    if (map[x][y] == '.' && adjMineCount[x][y] == 0 && !isClicked[x][y]) {
                        clickCount++;
                        bfs(x, y);
                    }
                }
            }

            // 클릭하지 않은 빈 공간 카운트
            for (int x = 0; x < N; x++)
                for (int y = 0; y < N; y++)
                    if (map[x][y] == '.' && !isClicked[x][y])
                        clickCount++;

            // 출력
            sb.append("#").append(tc).append(" ").append(clickCount).append("\n");
        }
        System.out.print(sb);
    }

    private static void bfs(int startX, int startY) {
        Deque<int[]> queue = new ArrayDeque<>();
        isClicked[startX][startY] = true;
        queue.addLast(new int[] { startX, startY });

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            for (int d = 0; d < 8; d++) {
                int nx = x + DX[d];
                int ny = y + DY[d];
                if (nx < 0 || nx >= N || ny < 0 || ny >= N)
                    continue;
                if (map[nx][ny] == '*' || isClicked[nx][ny])
                    continue;
                isClicked[nx][ny] = true;
                if (adjMineCount[nx][ny] == 0) {
                    queue.addLast(new int[] { nx, ny });
                }
            }
        }
    }
}
