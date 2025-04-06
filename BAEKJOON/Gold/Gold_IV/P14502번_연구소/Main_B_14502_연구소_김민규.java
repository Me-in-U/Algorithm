package BAEKJOON.Gold.Gold_IV.P14502번_연구소;

/**
 * <h1>BAEKJOON 14502번 연구소</h1>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-07
 *        <p>
 *        JAVA8 : 메모리 68,512 KB, 시간 196ms <br>
 *        JAVA11 : 메모리 72,836 KB, 시간 272ms
 *        </p>
 */

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main_B_14502_연구소_김민규 {
    private static final int[] dx = { 1, -1, 0, 0 };
    private static final int[] dy = { 0, 0, 1, -1 };
    private static int[][] lab;
    private static int[][] virusPosition = new int[10][];
    private static int N;
    private static int M;
    private static int virusCount;

    public static void main(String[] args) throws IOException {
        // !입력 및 초기화
        N = readInt();
        M = readInt();
        lab = new int[N + 2][M + 2];
        // 바깥쪽 경계를 벽(1)으로 채움
        for (int i = 0; i < N + 2; i++) {
            lab[i][0] = 1;
            lab[i][M + 1] = 1;
        }
        for (int j = 0; j < M + 2; j++) {
            lab[0][j] = 1;
            lab[N + 1][j] = 1;
        }
        // lab 배열 저장, 바이러스 위치 저장
        for (int x = 1; x <= N; x++) {
            for (int y = 1; y <= M; y++) {
                int num = lab[x][y] = readInt();
                if (num == 2) {
                    virusPosition[virusCount] = new int[] { x, y };
                    virusCount++;
                }
            }
        }

        // !벽 세우고 바이러스 퍼뜨리기
        int max = build3Walls();

        // !출력
        System.out.print(max);
    }

    public static int build3Walls() {
        int max = 0;
        int totalCells = N * M;
        // !첫 번째 벽 위치 (i)(x1, y1)
        for (int i = 0; i < totalCells - 2; i++) {
            int x1 = (i / M) + 1;
            int y1 = (i % M) + 1;
            if (lab[x1][y1] == 0) {
                lab[x1][y1] = 1; // 첫 번째 벽 설치
                // !두 번째 벽 위치 (i)(x2, y2)
                for (int j = i + 1; j < totalCells - 1; j++) {
                    int x2 = (j / M) + 1;
                    int y2 = (j % M) + 1;
                    if (lab[x2][y2] == 0) {
                        lab[x2][y2] = 1;// 두 번째 벽 설치
                        // !세 번째 벽 위치 (k)(x3, y3)
                        for (int k = j + 1; k < totalCells; k++) {
                            int x3 = (k / M) + 1;
                            int y3 = (k % M) + 1;
                            if (lab[x3][y3] == 0) {
                                lab[x3][y3] = 1; // 세 번째 벽 설치
                                max = Math.max(max, spreadVirus()); // 바이러스 확산
                                lab[x3][y3] = 0; // 세 번째 벽 원복
                            }
                        }
                        lab[x2][y2] = 0; // 두 번째 벽 원복
                    }
                }
                lab[x1][y1] = 0;// 첫 번째 벽 원복
            }
        }
        return max;
    }

    public static int spreadVirus() {
        int tempSafeZoneCount = 0;
        // 바이러스를 큐에 추가
        Deque<int[]> queueVirus = new ArrayDeque<>();
        for (int vc = 0; vc < virusCount; vc++) {
            queueVirus.add(virusPosition[vc]);
        }
        // 바이러스 퍼뜨리기(빈 공간일때만 고려)
        while (!queueVirus.isEmpty()) {
            int[] now = queueVirus.poll();
            int cx = now[0];
            int cy = now[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (lab[nx][ny] == 0) {
                    lab[nx][ny]--;
                    queueVirus.add(new int[] { nx, ny });
                }
            }
        }
        // 안전구역 개수 세기, 바이러스 퍼진곳 원복
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (lab[i][j] == 0) {
                    tempSafeZoneCount++;
                } else if (lab[i][j] == -1) {
                    lab[i][j] = 0;
                }
            }
        }
        return tempSafeZoneCount;
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