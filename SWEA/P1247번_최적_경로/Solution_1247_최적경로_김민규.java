package SWEA.P1247번_최적_경로;

/**
 * SW Expert Academy
 * 1247번 최적 경로 D5
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-02-25
 * JAVA8 : 메모리 26,368 KB, 시간 988ms
 */

import java.io.IOException;

public class Solution_1247_최적경로_김민규 {
    private static class Position {
        int x;
        int y;
        int[] dist = null;

        public Position(int x, int y, int N) {
            this.x = x;
            this.y = y;
            dist = new int[N];
        }

        private void getDistance(Position[] customers) {
            for (int i = 0; i < customers.length; i++) {
                dist[i] = Math.abs(customers[i].x - this.x) + Math.abs(customers[i].y - this.y);
            }
        }
    }

    private static int N;
    private static boolean[] visited;
    private static Position company;
    private static Position[] customers;
    private static Position house;
    private static int minDistance;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int t = 1; t <= T; t++) {
            // 입력 및 초기화
            N = readInt();
            visited = new boolean[N];
            customers = new Position[N];
            company = new Position(readInt(), readInt(), N);
            house = new Position(readInt(), readInt(), N);
            for (int i = 0; i < N; i++)
                customers[i] = new Position(readInt(), readInt(), N);

            // 회사에서 고객 집까지 거리
            company.getDistance(customers);
            // 집에서 고객 집까지 거리
            house.getDistance(customers);
            // 각 고객끼리 거리
            for (int i = 0; i < N; i++)
                customers[i].getDistance(customers);

            // DFS로 회사를 시작으로 모든 고객 돌고 집으로
            minDistance = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                visited[i] = true;
                dfs(1, company.dist[i], i);
                visited[i] = false;
            }

            // 출력
            sb.append("#").append(t).append(" ").append(minDistance).append("\n");
        }
        System.out.print(sb.toString());
    }

    /**
     * @param cnt       방문한 고객 수
     * @param distSum   현재 경로의 거리
     * @param lastVisit 이전에 방문한 고객 index
     */
    private static void dfs(int cnt, int distSum, int lastVisit) {
        // 모든 고객 방문했으면 [마지막으로 방문한 고객 --> 집] 거리 더하기
        if (cnt == N) {
            minDistance = Math.min(minDistance, distSum + house.dist[lastVisit]);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                // [이전 고객(lastVisit) --> 현재 고객(i)] 거리 더하기
                dfs(cnt + 1, distSum + customers[i].dist[lastVisit], i);
                visited[i] = false;
            }
        }
    }

    // 빠른 정수 읽기
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