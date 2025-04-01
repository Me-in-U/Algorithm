package SWEA.P2115번_벌꿀채취;

/**
 * <h1>SW Expert Academy 2115번 벌꿀채취</h1>
 * <p>
 * JAVA 8 : 메모리 26,112 KB, 시간 87ms <br>
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-01
 */

import java.io.IOException;

public class Solution_2115_벌꿀채취_김민규 {
    private static int N, M, C;
    private static int[][] map;
    private static int[][] max;
    private static int[] squareData;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // 제곱수 미리 계산
        squareData = new int[10];
        for (int i = 1; i < 10; i++)
            squareData[i] = i * i;

        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            N = readInt();
            M = readInt(); // 각 일꾼이 선택할 가로로 연속된 벌통 수
            C = readInt(); // 각 일꾼이 채취할 수 있는 꿀의 최대 양
            int section = N - M + 1;
            map = new int[N][N];
            max = new int[N][section]; // 각 행에서 연속 M개 벌통 구간에 대해 최대 이익
            for (int x = 0; x < N; x++)
                for (int y = 0; y < N; y++)
                    map[x][y] = readInt();

            // 각 행, 각 구간에 대해 최대 이익 계산
            int result = 0;
            for (int x = 0; x < N; x++) {
                for (int y = 0; y <= N - M; y++) {
                    // 구간 [y, y+M-1]에 대해 바로 최대 이익 계산
                    for (int mask = 1; mask < (1 << M); mask++) {
                        int sum = 0;
                        int profit = 0;
                        for (int i = 0; i < M; i++) {
                            if ((mask & (1 << i)) != 0) {
                                sum += map[x][y + i];
                                profit += squareData[map[x][y + i]];
                            }
                        }
                        if (sum <= C) {
                            max[x][y] = Math.max(max[x][y], profit);
                        }
                    }
                }
            }
            // 두 일꾼의 선택 조합에 대해 최대 이익 계산
            for (int x1 = 0; x1 < N; x1++) {
                for (int y1 = 0; y1 < section; y1++) {
                    int worker1 = max[x1][y1];
                    int worker2;
                    // 같은 행에서 구간이 겹치지 않게 M 칸 이후부터 탐색
                    for (int y2 = y1 + M; y2 < section; y2++) {
                        worker2 = max[x1][y2];
                        result = Math.max(result, worker1 + worker2);
                    }
                    // 다른 행은 모든 구간 탐색
                    for (int x2 = x1 + 1; x2 < N; x2++) {
                        for (int y2 = 0; y2 < section; y2++) {
                            worker2 = max[x2][y2];
                            result = Math.max(result, worker1 + worker2);
                        }
                    }
                }
            }
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        while ((c = System.in.read()) > 47)
            n = (n * 10) + (c & 15);
        return n;
    }
}
