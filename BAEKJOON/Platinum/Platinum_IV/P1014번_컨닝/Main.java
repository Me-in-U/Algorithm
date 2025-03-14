package P1014번_컨닝;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int[][] memo;
    private static int rows;
    private static int cols;
    private static List<Integer>[] validSeats;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        while (T-- > 0) {
            rows = readInt();
            cols = readInt();
            int[] classRoom = new int[rows];
            for (int i = 0; i < rows; i++) {
                for (int j = cols - 1; j >= 0; j--) {
                    int c = System.in.read();
                    // 앉을 수 없는 자리 => 1
                    if (c == 'x') {
                        classRoom[i] += (1 << j);
                    }
                }
                // System.in.read(); // CR
                System.in.read(); // LF
            }
            // 각 행별로 가능한 모든 학생 배치 경우
            validSeats = new ArrayList[rows];
            for (int i = 0; i < rows; i++) {
                validSeats[i] = new ArrayList<>();
                // 0부터 (1<<cols)-1까지 모든 비트마스크를 체크
                for (int mask = 0; mask < (1 << cols); mask++) {
                    // 배치 가능 조건
                    // 조건1: mask와 classroom[i]가 겹치면 안 됨(부숴진 책상에 배치 안됨)
                    // 조건2: 인접한 자리에도 학생이 동시에 배치되면 안 됨
                    if (((mask & classRoom[i]) != 0) || ((mask & (mask << 1)) != 0)) {
                        continue;
                    }
                    validSeats[i].add(mask);
                }
            }
            // 메모이제이션 배열 초기화: 각 행별로 가능한 mask 개수는 1 << cols
            memo = new int[rows][1 << cols];
            // 첫 번째 행부터 DFS(백트래킹)로 최대 학생 배치 수 계산
            for (int seatBit1 : validSeats[0]) {
                dfs(0, seatBit1);
            }
            // 첫 행에서 가능한 모든 배치 중 최대값을 결과로 선택
            int maxResult = 0;
            for (int mask = 0; mask < (1 << cols); mask++) {
                maxResult = Math.max(maxResult, memo[0][mask]);
            }
            sb.append(maxResult).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static void dfs(int row, int currentMask) {
        // 이미 계산된 값이 있으면 중복 계산을 방지
        if (memo[row][currentMask] != 0) {
            return;
        }
        // 마지막 행인 경우, 해당 행에서 배치된 학생 수가 결과
        if (row == rows - 1) {
            memo[row][currentMask] = Integer.bitCount(currentMask);
            return;
        }
        // 다음 행(idx+1)에서 가능한 모든 배치에 대해 확인.
        for (int nextMask : validSeats[row + 1]) {
            // 대각으로 겹치는 비트 탐색
            // 상단행 & 하단행 왼쪽으로 움직이기
            // 상단행 & 하단행 오른쪽으로 움직이기
            if (((currentMask & (nextMask << 1)) != 0) || ((currentMask & nextMask >> 1) != 0)) {
                continue;
            }
            // 다음 행에 대해 재귀 호출하여
            dfs(row + 1, nextMask);
            // 현재 행의 배치 수와 다음 행부터 얻은 최대 배치 수의 합으로 dp 값을 갱신
            int dpUpdate = memo[row + 1][nextMask] + Integer.bitCount(currentMask);
            if (memo[row][currentMask] < dpUpdate) {
                memo[row][currentMask] = dpUpdate;
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
