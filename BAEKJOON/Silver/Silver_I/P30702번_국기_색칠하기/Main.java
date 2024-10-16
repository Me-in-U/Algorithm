package P30702번_국기_색칠하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    protected static char[][] flagA;
    protected static char[][] flagB;
    protected static boolean[][] visited;
    protected static int N;
    protected static int M;
    protected static int[] dx = { 0, 0, 1, -1 };
    protected static int[] dy = { 1, -1, 0, 0 };
    protected static boolean able = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        flagA = new char[N][M];
        flagB = new char[N][M];
        for (int i = 0; i < N; i++)
            flagA[i] = br.readLine().toCharArray();
        for (int i = 0; i < N; i++)
            flagB[i] = br.readLine().toCharArray();
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    BFS(i, j);
                    if (!able) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        System.out.println("YES");
    }

    public static void BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { x, y });
        char flagACharacter = flagA[x][y];
        char flagBCharacter = flagB[x][y];
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = now[0] + dx[i];
                int nextY = now[1] + dy[i];
                if (0 <= nextX && nextX < N && 0 < nextY && nextY < M) {
                    if (!visited[nextX][nextY]) {
                        if (flagA[nextX][nextY] == flagACharacter && flagB[nextX][nextY] == flagBCharacter) {
                            visited[nextX][nextY] = true;
                            queue.add(new int[] { nextX, nextY });
                        } else if ((flagA[nextX][nextY] != flagACharacter && flagB[nextX][nextY] == flagBCharacter)
                                || (flagA[nextX][nextY] == flagACharacter && flagB[nextX][nextY] != flagBCharacter)) {
                            able = false;
                            break;
                        }
                    }
                }
            }
            if (!able)
                break;
        }
    }
}