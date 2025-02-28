package SWEA.P1861번_정사각형_방;

/**
 * SW Expert Academy 1861번 정사각형 방 D4
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-27 JAVA8 : 메모리 28,032 KB, 시간 94ms
 */

import java.io.IOException;

public class Solution_1861_정사각형방_김민규 {
    private static int N;
    private static int[][] map;
    private static int[][] count;
    private static final int dx[] = { 1, 0, -1, 0 };
    private static final int dy[] = { 0, 1, 0, -1 };

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            N = readInt();
            map = new int[N][N];
            count = new int[N][N];
            for (int x = 0; x < N; x++)
                for (int y = 0; y < N; y++)
                    map[x][y] = readInt();
            int minNumber = Integer.MAX_VALUE;
            int maxCount = Integer.MIN_VALUE;

            // 모든 방 탐색
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    // 탐색하지 않은 방이라면 recursion()
                    if (count[x][y] == 0) {
                        int count = recursion(x, y);
                        // 탐색할 수 있는 더 큰 방의 수를 찾으면
                        if (maxCount < count) {
                            maxCount = count;
                            minNumber = map[x][y];
                        } // 최대 탐색 크기가 같은데, 방 번호가 작으면
                        else if (maxCount == count && map[x][y] < minNumber) {
                            minNumber = map[x][y];
                        }
                    }
                }
            }
            sb.append("#").append(t).append(" ").append(minNumber).append(" ").append(maxCount).append("\n");
        }
        System.out.print(sb.toString());
    }

    /**
     * @param x 현재 x좌표
     * @param y 현재 y좌표
     * @return int: 현재좌표의 숫자에서 최대한 이동할 수 있는 방의 수
     */
    private static int recursion(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            // 현재방 번호보다 1 큰 좌표 탐색
            if (isValid(nx, ny) && map[x][y] + 1 == map[nx][ny]) {
                // 다음 좌표를 아직 탐색하지 않았으면 recursion()
                if (count[nx][ny] == 0)
                    return count[x][y] = 1 + recursion(nx, ny);
                // 다음 좌표를 탐색했었으면
                // return (현재위치 방 하나) + 다음 좌표의 최대한 이동 할 수 있는 방의 수
                return count[x][y] = 1 + count[nx][ny];
            }
        }
        // 이동 할 경로가 없음 (현재위치 방 하나)
        return count[x][y] = 1;
    }

    /**
     * @param x x 좌표
     * @param y y 좌표
     * @return boolean: 각 param이 0보다 크거나 같고 N보다 작은지
     */
    private static boolean isValid(int x, int y) {
        return (0 <= x && x < N) && (0 <= y && y < N);
    }

    // 빠른 정수 읽기 (불필요한 공백 CR LF tab 제거)
    private static int readInt() throws IOException {
        int c = System.in.read();
        while (c != -1 && (c == ' ' || c == '\n' || c == '\r' || c == '\t')) {
            c = System.in.read();
        }
        int n = 0;
        while (c != -1 && '0' <= c && c <= '9') {
            n = n * 10 + (c - '0');
            c = System.in.read();
        }
        return n;
    }
}
