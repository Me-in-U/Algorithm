package BAEKJOON.Silver.Silver_I.P2178번_미로_탐색;

/**
 * BAEKJOON 2178번 미로 탐색
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-06 JAVA8 : 메모리 11,764 KB, 시간 76ms
 * @since 2025-03-06 JAVA11 : 메모리 14,320 KB, 시간 108ms
 */

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main_B_2178_미로탐색_김민규 {
    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        int[] dx = { 0, 1, 0, -1 };
        int[] dy = { 1, 0, -1, 0 };
        int N = readInt();
        int M = readInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = System.in.read() & 15;
            }
            // if (System.in.read() == 13) {
            System.in.read();
            // }
        }

        // BFS
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[] { 0, 0 });
        while (!q.isEmpty()) {
            int[] now = q.poll();
            for (int d = 0; d < 4; d++) {
                // 도착점에 도착하면 최소 칸 수 출력 후 리턴
                if (now[0] == N - 1 && now[1] == M - 1) {
                    System.out.print(arr[now[0]][now[1]]);
                    return;
                }
                int nx = now[0] + dx[d];
                int ny = now[1] + dy[d];
                // 해당 인덱스가 배열을 넘어가면 안됨
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    // 해당 인덱스가 1이면 진행
                    if (arr[nx][ny] == 1) {
                        // 다음칸은 현재칸 움직인 수 +1
                        arr[nx][ny] = arr[now[0]][now[1]] + 1;
                        q.add(new int[] { nx, ny });
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