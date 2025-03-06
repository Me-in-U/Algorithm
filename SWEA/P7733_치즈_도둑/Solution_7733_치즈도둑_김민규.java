package SWEA.P7733_치즈_도둑;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * SWEA 7733번 치즈 도둑
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-06 JAVA8 : 메모리 93,696 KB, 시간 299ms
 */

public class Solution_7733_치즈도둑_김민규 {
    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };
    private static int[][] map;
    private static int N;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            N = readInt();
            map = new int[N][N];
            for (int x = 0; x < N; x++)
                for (int y = 0; y < N; y++)
                    map[x][y] = readInt();

            // 0일부터 100일까지
            int max = 0;
            for (int day = 0; day <= 100; day++)
                max = Math.max(max, getMungtangEAmount(day));

            // 출력
            sb.append("#").append(t).append(" ").append(max).append("\n");
        }
        System.out.print(sb);
    }

    /**
     * X번째날 요정이 치즈를 먹을때 생기는 덩어리 수 알아내기
     * 
     * @param tasteValue ?번째 날, ?인 칸을 먹어버린다
     * @return int: bfs 시도 횟수
     */
    private static int getMungtangEAmount(int tasteValue) {
        int count = 0;
        boolean[][] visited = new boolean[N][N];
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (!visited[x][y] && tasteValue < map[x][y]) {
                    bfs(x, y, visited, tasteValue);
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * bfs로 tasteValue보다 큰곳을 방문처리
     * 
     * @param x          탐색할 x 좌표
     * @param y          탐색할 x 좌표
     * @param visited    방문했는지 확인할 배열
     * @param tasteValue ?번째 날, ?인 칸을 먹어버린다
     */
    private static void bfs(int x, int y, boolean[][] visited, int tasteValue) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] { x, y });
        visited[x][y] = true;
        while (!queue.isEmpty()) {
            int[] cp = queue.poll();
            for (int d = 0; d < 4; d++) {
                int nx = cp[0] + dx[d];
                int ny = cp[1] + dy[d];
                if (0 <= nx && nx < N && 0 <= ny && ny < N && !visited[nx][ny]) {
                    if (tasteValue < map[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[] { nx, ny });
                    }
                }
            }
        }
    }

    // +정수 읽기
    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
