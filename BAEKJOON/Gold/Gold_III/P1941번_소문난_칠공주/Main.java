package BAEKJOON.Gold.Gold_III.P1941번_소문난_칠공주;

/**
 * <h1>BAEKJOON 1941번 소문난 칠공주</h1>
 * <p>
 * JAVA 8 : 메모리 44,592KB, 시간 88ms <br>
 * JAVA11 : 메모리 47,196KB, 시간 120ms
 * </p>
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-04-07
 */
import java.io.IOException;

public class Main {
    // 자리배치 5×5, 총 25칸
    private static final int N = 5;
    private static final int SIZE = 25;
    private static boolean[][] isS = new boolean[N][N];
    // 4방 탐색
    private static final int[] dx = { 1, -1, 0, 0 };
    private static final int[] dy = { 0, 0, 1, -1 };
    // 25칸이므로 2^25가지 조합
    private static boolean[] visited = new boolean[1 << SIZE];
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        // 입력: 'S' -> true, 'Y' -> false
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                isS[x][y] = (System.in.read() == 'S');
            }
            System.in.read();
            // System.in.read();
        }

        // 'S'를 시작점으로 DFS
        for (int i = 0; i < SIZE; i++) {
            int x = i / N;
            int y = i % N;
            if (isS[x][y]) {
                // bitmask는 자리를 선택하는 조합
                int mask = 1 << i;
                visited[mask] = true;
                dfs(1, 1, mask);
            }
        }
        System.out.println(count);
    }

    /**
     * DFS를 사용해 7명의 연결된 조합을 탐색하는 메서드
     * 
     * @param depth   현재까지 선택된 칸의 개수
     * @param sCount  선택된 칸 중 'S'인 칸의 개수
     * @param bitmask 현재 선택된 칸들의 위치를 비트로 표현 (1이면 선택됨)
     */
    private static void dfs(int depth, int sCount, int bitmask) {
        // 가지치기: 남은 칸이 전부 S여도 4개 미만이면 탈락
        if (7 - depth + sCount < 4)
            return;

        // 조건 만족: 7명 선택 완료 && S가 4명 이상이면 정답 카운트 증가
        if (depth == 7 && 4 <= sCount) {
            count++;
            return;
        }

        // 현재 bitmask에 포함된 모든 자리를 순회
        for (int i = 0; i < SIZE; i++) {
            // 조합에서 선택 안된 자리는 스킵
            if ((bitmask & (1 << i)) == 0)
                continue;

            // 현재 자리의 2차원 좌표
            int x = i / N;
            int y = i % N;
            // 4방 탐색
            for (int d = 0; d < 4; d++) {
                // 다음 자리
                int nx = x + dx[d];
                int ny = y + dy[d];

                // outOfIndex 확인
                if (nx < 0 || ny < 0 || nx >= N || ny >= N)
                    continue;

                // 선택한 자리는 스킵
                int next = nx * N + ny;
                if ((bitmask & (1 << next)) != 0)
                    continue;

                // 현재 조합에 다음 자리를 추가
                int nextMask = bitmask | (1 << next);
                // 해당 조합을 아직 탐색하지 않았다면 재귀
                if (!visited[nextMask]) {
                    visited[nextMask] = true;
                    dfs(depth + 1, sCount + (isS[nx][ny] ? 1 : 0), nextMask);
                }
            }
        }
    }
}
