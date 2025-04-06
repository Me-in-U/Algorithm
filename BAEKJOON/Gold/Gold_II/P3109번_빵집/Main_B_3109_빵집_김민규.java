package BAEKJOON.Gold.Gold_II.P3109번_빵집;

/**
 * BAEKJOON 3109번 빵집
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-05 JAVA8 : 메모리 22,000 KB, 시간 208ms
 * @since 2025-03-05 JAVA11 : 메모리 24,304 KB, 시간 216ms
 */

import java.io.IOException;

public class Main_B_3109_빵집_김민규 {
    private static char[][] map;
    private static int[] dx = { -1, 0, 1 };
    private static int count = 0;
    private static int R;
    private static int C;

    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        R = readInt();
        C = readInt();
        map = new char[R][C];
        for (int x = 0; x < R; x++) {
            for (int y = 0; y < C; y++)
                map[x][y] = (char) System.in.read();
            while (System.in.read() != '\n')
                ;
        }

        // 맨 왼쪽(가스관) R개에 대해서 출발
        for (int x = 0; x < R; x++)
            dfs(x, 0);

        // 출력
        System.out.println(count);
    }

    /**
     * @param x x좌표
     * @param y y좌표
     * @return true: 맨 오른쪽(빵집)까지 도달 성공
     */
    private static boolean dfs(int x, int y) {
        // 맨 오른쪽(빵집)까지 도달했으면
        if (y == C - 1) {
            count++;
            return true;
        }
        // 오른쪽 위, 오른쪽, 오른쪽 아래 순서로 파이프 설치
        for (int d = 0; d < 3; d++) {
            int nx = x + dx[d];
            int ny = y + 1;
            if (0 <= nx && nx < R) {
                // 빈곳이면 바로 가스관 설치
                // 다시 되돌릴 필요는 없음, 이전에 시도된 길은 다른 출발지에서는 어차피 못감
                if (map[nx][ny] == '.') {
                    map[nx][ny] = 'x';
                    if (dfs(nx, ny))
                        return true;
                }
            }
        }
        return false;
    }

    // + 정수 빨리 읽기
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
