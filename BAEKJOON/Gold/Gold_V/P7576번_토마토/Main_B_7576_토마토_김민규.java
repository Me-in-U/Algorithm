package BAEKJOON.Gold.Gold_V.P7576번_토마토;

/**
 * BAEKJOON 7565번 토마토
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-06 JAVA8 : 메모리 44,744KB, 시간 228ms
 * @since 2025-03-06 JAVA11 : 메모리 49,964 KB, 시간 296ms
 */

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main_B_7576_토마토_김민규 {
    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        final int[] dx = { -1, 1, 0, 0 };
        final int[] dy = { 0, 0, -1, 1 };
        final int M = readInt();
        final int N = readInt();
        int days = 0;
        int[][] storage = new int[N][M];
        Deque<int[]> tomatoes = new ArrayDeque<>();
        for (int x = 0; x < N; x++)
            for (int y = 0; y < M; y++)
                // 토마토를 위치를 큐에 넣음
                if ((storage[x][y] = readInt()) == 1)
                    tomatoes.addLast(new int[] { x, y });

        // BFS 시작: 현재 큐의 원소 수 만큼만 한 날에 처리
        while (!tomatoes.isEmpty()) {
            int size = tomatoes.size();
            while (size-- > 0) {
                int[] tomato = tomatoes.poll();
                // 상하좌우로 탐색
                for (int d = 0; d < 4; d++) {
                    int nx = tomato[0] + dx[d];
                    int ny = tomato[1] + dy[d];
                    // 해당 인덱스가 배열을 넘어가면 안됨
                    if (0 <= nx && nx < N && 0 <= ny && ny < M) {
                        // 익지않은 토마토 발견
                        if (storage[nx][ny] == 0) {
                            storage[nx][ny]++;
                            tomatoes.add(new int[] { nx, ny });
                        }
                    }
                }
            }
            if (!tomatoes.isEmpty())
                days++;
        }

        // 익지 않은 토마토가 있는지 확인
        boolean zeroExist = false;
        first: for (int[] line : storage) {
            for (int i : line) {
                if (i == 0) {
                    zeroExist = true;
                    break first;
                }
            }
        }
        // 토마토가 모두 익지 않았으면 -1
        System.out.println(zeroExist ? -1 : days);
    }

    // +정수 읽기
    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        // if (c == 13)
        // System.in.read();
        return n;
    }
}