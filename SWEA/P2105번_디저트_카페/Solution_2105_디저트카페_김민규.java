package SWEA.P2105번_디저트_카페;

/**
 * <h1>SW Expert Academy 2105번 디저트 카페</h1>
 * <p>
 * JAVA 8 : 메모리 26,752 KB, 시간 108ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-01
 */

import java.io.IOException;

public class Solution_2105_디저트카페_김민규 {
    private static int N, max;
    private static int[][] data;
    private static boolean[] visited;
    private static int[] dx = { 1, 1, -1, -1 };
    private static int[] dy = { 1, -1, -1, 1 };

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            N = readInt();
            max = -1;
            data = new int[N][N];
            visited = new boolean[101];
            for (int x = 0; x < N; x++)
                for (int y = 0; y < N; y++)
                    data[x][y] = readInt();

            // 사각형 모양을 못만드는 시작지점을 제외하고 탐색
            for (int x = 0; x < N - 2; x++)
                for (int y = 1; y < N - 1; y++)
                    dfs(x, y, x, y, 0, 0);

            // 출력
            sb.append("#").append(t).append(" ").append(max).append("\n");
        }
        System.out.print(sb.toString());
    }

    /**
     * 시계방향으로 탐색, 같은 숫자 디저트 카페 방문 x, 사각형을 이뤄 방문할 때, 최대 카페 방문 수 업데이트
     * 
     * @param startX 처음 시작 좌표 x
     * @param startY 처음 시작 좌표 y
     * @param cx     현재 좌표 x
     * @param cy     현재 좌표 y
     * @param dir    현재 방향 인덱스[우하, 좌하, 좌상, 우상]
     * @param count  방문한 카페 수
     */

    private static void dfs(int startX, int startY, int cx, int cy, int dir, int count) {
        // 오른쪽 위 방향이고 시작위치로 돌아온 경우
        if (dir == 3 && startX == cx && startY == cy) {
            max = Math.max(max, count);
            return;
        }
        int nx = cx + dx[dir];
        int ny = cy + dy[dir];
        // 탐색 시작 x위치 보다 크고(아래쪽) 배열 범위 내
        if (startX <= nx && isInRange(nx, ny)) {
            if (!visited[data[nx][ny]]) {
                visited[data[nx][ny]] = true;
                // 같은 방향
                dfs(startX, startY, nx, ny, dir, count + 1);
                // 다음 시계 방향(처음 위치로 돌아올때는 항상 오른쪽 위 방향)
                if (dir + 1 < 4)
                    dfs(startX, startY, nx, ny, dir + 1, count + 1);
                visited[data[nx][ny]] = false;
            }
        }
    }

    /**
     * 배열 범위 내에 있는가
     * 
     * @param x 좌표 x
     * @param y 좌표 y
     * @return
     */
    private static boolean isInRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        while ((c = System.in.read()) > 47)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
