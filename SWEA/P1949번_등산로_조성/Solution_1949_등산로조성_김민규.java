package P1949번_등산로_조성;

/**
 * <h1>SW Expert Academy 1949번 등산로 조성</h1>
 * <p>
 * JAVA8 : 메모리 26,368 KB, 시간 87ms
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-04
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution_1949_등산로조성_김민규 {
    private static boolean[][] visited;
    private static int N, K, max;
    private static int[][] map;
    private static int[] dx = { -1, 1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            N = readInt();
            K = readInt();
            map = new int[N][N];
            visited = new boolean[N][N];
            max = 0;
            int highest = 0;
            List<int[]> starts = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = readInt();
                    if (map[i][j] > highest) {
                        highest = map[i][j];
                        starts.clear();
                        starts.add(new int[] { i, j });
                    } else if (map[i][j] == highest) {
                        starts.add(new int[] { i, j });
                    }
                }
            }
            max = 0;
            for (int[] start : starts) {
                visited[start[0]][start[1]] = true;
                dfs(start[0], start[1], 1, false);
                visited[start[0]][start[1]] = false;
            }
            sb.append("#").append(t).append(" ").append(max).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static void dfs(int cx, int cy, int length, boolean used) {
        max = Math.max(max, length);
        for (int d = 0; d < 4; d++) {
            int nx = cx + dx[d];
            int ny = cy + dy[d];
            if (nx < 0 || nx >= N || ny < 0 || ny >= N || visited[nx][ny])
                continue;
            // 다음 가려는 곳이 낮은곳이면
            if (map[nx][ny] < map[cx][cy]) {
                visited[nx][ny] = true;
                dfs(nx, ny, length + 1, used);
                visited[nx][ny] = false;
            }
            // 지형깎기를 안썼고 K이내로 깎으면 현재보다 낮아질 수 있다면
            else if (!used && map[nx][ny] - K < map[cx][cy]) {
                int original = map[nx][ny]; // 원래 높이 저장
                map[nx][ny] = map[cx][cy] - 1;// 현재 위치보다 1낮게 깎기
                visited[nx][ny] = true;
                dfs(nx, ny, length + 1, true);
                visited[nx][ny] = false;
                map[nx][ny] = original; // 원상복구
            }
        }
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
        while (c <= ' ') {
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
