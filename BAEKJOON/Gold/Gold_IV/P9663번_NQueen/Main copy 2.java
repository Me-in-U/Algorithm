package BAEKJOON.Gold.Gold_IV.P9663번_NQueen;

import java.io.IOException;

public class Main {
    static int count = 0, N;

    public static void main(String[] args) throws IOException {
        N = readInt();
        solve(0, 0, 0, 0);
        System.out.println(new StringBuilder().append(count));
    }

    /**
     * 재귀적으로 각 행에 퀸을 놓으며 가능한 배치를 탐색합니다.
     *
     * @param row  현재 배치할 행 번호
     * @param cols 현재까지 배치된 퀸들이 점유한 열의 비트마스크
     * @param d1   현재까지 배치된 퀸들이 점유한 "/" 대각선의 비트마스크
     * @param d2   현재까지 배치된 퀸들이 점유한 "\" 대각선의 비트마스크
     */
    private static void solve(int row, int cols, int d1, int d2) {
        // 모든 행에 퀸을 배치했으면 유효한 배치 하나를 찾은 것입니다.
        if (row == N) {
            count++;
            return;
        }
        // 현재 행에서 배치 가능한 위치 계산
        // cols | d1 | d2:
        // 현재까지 퀸이 점유한 열과 두 대각선을 결합하여, 현재 행에서 퀸을 놓을 수 없는(공격받는) 위치를 표시합니다.
        // ~(cols | d1 | d2)
        // 공격받지 않는, 즉 퀸을 놓을 수 있는 위치를 1로 만든 마스크입니다.
        // available
        // 체스판의 유효한 열(하위 N비트) 중에서 아직 퀸을 놓을 수 있는 위치들을 나타냅니다.
        int available = ((1 << N) - 1) & ~(cols | d1 | d2);
        while (available != 0) {
            int pick = available & -available;
            available -= pick;
            // cols | pick:
            // 현재 선택한 열을 포함하여, 다음 행에서는 해당 열에 배치할 수 없게 합니다.
            // (d1 | pick) << 1:
            // "/" 방향 대각선 영역을 업데이트합니다. 현재 행에서 선택한 위치의 대각선은 다음 행에서는 한 칸 왼쪽으로 이동합니다.
            // (d2 | pick) >> 1:
            // "\" 방향 대각선 영역을 업데이트합니다. 현재 행에서 선택한 위치의 대각선은 다음 행에서는 한 칸 오른쪽으로 이동합니다.
            solve(row + 1, cols | pick, (d1 | pick) << 1, (d2 | pick) >> 1);
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
