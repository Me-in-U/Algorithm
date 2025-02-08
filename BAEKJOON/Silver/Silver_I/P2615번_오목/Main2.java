package P2615번_오목;

import java.io.IOException;

public class Main2 {
    public static final int SIZE = 19;
    public static int[][] map = new int[SIZE][SIZE];
    public static final int[] dx = { 1, 1, 0, -1 };
    public static final int[] dy = { 0, 1, 1, 1 };

    public static void main(String[] args) throws IOException {
        int total = SIZE * SIZE;
        int read = 0;
        while (read < total) {
            int ch = System.in.read();
            if (ch == '0' || ch == '1' || ch == '2') {
                int num = ch - '0';
                map[read / SIZE][read % SIZE] = num;
                read++;
            }
        }
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (map[x][y] != 0) {
                    int color = map[x][y];
                    for (int d = 0; d < 4; d++) {
                        int count = 1;
                        // 역방향 탐색
                        int nx = x - dx[d], ny = y - dy[d];
                        while (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE && map[nx][ny] == color) {
                            count++;
                            nx -= dx[d];
                            ny -= dy[d];
                        }
                        int startX = nx + dx[d], startY = ny + dy[d];
                        // 순방향 탐색
                        nx = x + dx[d];
                        ny = y + dy[d];
                        while (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE && map[nx][ny] == color) {
                            count++;
                            nx += dx[d];
                            ny += dy[d];
                        }
                        if (count == 5) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(color).append('\n').append(startX + 1).append(' ').append(startY + 1);
                            System.out.print(sb);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(0);
    }
}
