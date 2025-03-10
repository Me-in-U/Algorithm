package P10026번_적록색약;

/**
 * <h1>BAEKJOON 10026번 적록색약</h1>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-07
 *        <p>
 *        JAVA8 : 메모리 12,672 KB, 시간 84ms <br>
 *        JAVA11 : 메모리 14,696 KB, 시간 116ms
 *        </p>
 */

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main_B_10026_적록색약_김민규 {
    private static int[] dx = { 0, 1, 0, -1 };
    private static int[] dy = { 1, 0, -1, 0 };

    private static char[][] arr;
    private static boolean[][] visited;

    private static int N;
    private static int normalCount;
    private static int redGreenCount;

    public static void main(String[] args) throws IOException {
        N = readInt();
        arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = (char) System.in.read();
            }
            System.in.read();
        }

        // 빨, 초, 파 구역 BFS
        visited = new boolean[N][N];
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (!visited[x][y]) {
                    BFS(x, y, arr[x][y]);
                    normalCount++;
                }
                // !적록색약 ON
                if (arr[x][y] == 'G')
                    arr[x][y] = 'R';
            }
        }

        // 빨-초, 파 구역 BFS
        visited = new boolean[N][N];
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (!visited[x][y]) {
                    BFS(x, y, arr[x][y]);
                    redGreenCount++;
                }
            }
        }
        System.out.print(new StringBuilder().append(normalCount).append(" ").append(redGreenCount));
    }

    /**
     * @param x     BFS 시작 x좌표
     * @param y     BFS 시작 y좌표
     * @param color BFS 시작 위치 색상
     */
    public static void BFS(int x, int y, char color) {
        Deque<int[]> temp = new ArrayDeque<>();
        temp.add(new int[] { x, y });
        visited[x][y] = true;
        while (!temp.isEmpty()) {
            int size = temp.size();
            while (size-- > 0) {
                int[] now = temp.poll();
                visited[now[0]][now[1]] = true;
                // 상하좌우로 탐색
                for (int k = 0; k < 4; k++) {
                    int nx = now[0] + dx[k];
                    int ny = now[1] + dy[k];
                    // 해당 인덱스가 배열을 넘어가면 안됨
                    if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                        // 색이 처음 BFS값과 같아야하고 방문한적 없어야함
                        if (arr[nx][ny] == color && !visited[nx][ny]) {
                            visited[nx][ny] = true;
                            temp.add(new int[] { nx, ny });
                        }
                    }
                }
            }
        }
    }

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