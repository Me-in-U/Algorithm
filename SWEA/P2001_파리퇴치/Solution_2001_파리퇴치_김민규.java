package SWEA.P2001_파리퇴치;

/**
 * SW Expert Academy
 * 2001번 파리 퇴치 D2
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-21
 * JAVA8 : 메모리 24,960 KB, 시간 83ms
 */

import java.io.IOException;

public class Solution_2001_파리퇴치_김민규 {
    private static int max;
    private static int N;
    private static int M;
    private static int[][] flyMap;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int i = 1; i <= T; i++) {
            // 입력 및 초기화
            max = 0;
            N = readInt();
            M = readInt();
            flyMap = new int[N][N];

            // 2D 배열 입력
            for (int x = 0; x < N; x++)
                for (int y = 0; y < N; y++)
                    flyMap[x][y] = readInt();

            // 슬라이딩 윈도우 방식으로 최대 파리 수 찾기
            slideDown();
            sb.append('#').append(i).append(' ').append(max).append('\n');
        }
        System.out.print(sb.toString());
    }

    /** 슬라이딩 윈도우 방식 적용 */
    private static void slideDown() {
        int sum = 0;

        // 첫 번째 M×M 블록의 합 계산 (O(M²))
        for (int x = 0; x < M; x++)
            for (int y = 0; y < M; y++)
                sum += flyMap[x][y];

        // 첫 행의 최대값을 갱신한 후, slideRight() 수행
        for (int x = 0; x <= N - M; x++) {
            slideRight(x, sum);

            // 아래로 이동하면서 슬라이딩 윈도우 적용
            if ((x + M) < N) {
                for (int y = 0; y < M; y++) {
                    sum -= flyMap[x][y]; // 위쪽 행 제거
                    sum += flyMap[x + M][y]; // 아래쪽 행 추가
                }
            }
        }
    }

    /**
     * 오른쪽으로 슬라이딩하면서 값 갱신
     * 
     * @param x   최상단 행 index
     * @param sum 최초 블럭의 파리 수 합
     */
    private static void slideRight(int x, int sum) {
        for (int y = 0; y <= N - M; y++) {
            max = Math.max(max, sum); // 현재 블록의 최대값 갱신

            // 오른쪽으로 이동하면서 슬라이딩 윈도우
            if ((y + M) < N) {
                for (int i = 0; i < M; i++) {
                    sum -= flyMap[x + i][y]; // 왼쪽 열 제거
                    sum += flyMap[x + i][y + M]; // 오른쪽 열 추가
                }
            }
        }
    }

    public static int readInt() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
