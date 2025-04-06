package BAEKJOON.Silver.Silver_II.P10971번_외판원_순회_2;

/**
 * BAEKJOON 10971번 외판원 순회 2
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-05 JAVA8 : 메모리 12,064KB, 시간 80ms
 * @since 2025-03-05 JAVA11 : 메모리 14,564KB, 시간 116ms
 */
import java.io.IOException;

public class Main_B_10971_외판원순회2_김민규_인접행렬 {
    private static boolean[] visited;
    private static int minCost = Integer.MAX_VALUE;
    private static int N;
    private static int[][] cost;
    private static int startEndPoint;

    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        N = readInt();
        cost = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                cost[i][j] = readInt();

        // DFS 시작
        for (int start = 0; start < N; start++) {
            visited = new boolean[N];
            // 처음 시작 지점 저장
            startEndPoint = start;
            visited[start] = true;
            dfs(start, 0, 0);
            visited[start] = false;
        }

        // 출력
        System.out.print(minCost);
    }

    /**
     * @param start   탐색 시작할 시작점
     * @param depth   방문한 지점 수
     * @param costSum 현재 총 비용
     */
    private static void dfs(int start, int depth, int costSum) {
        // 과정 중 이미 최소비용보다 커지면 return
        if (minCost <= costSum)
            return;
        // 마지막 지점에 도착하고
        // 마지막 지점에서 처음 출발지점으로 길이 있으면 최소값 업데이트
        if (depth == N - 1 && cost[start][startEndPoint] != 0) {
            minCost = Math.min(minCost, costSum + cost[start][startEndPoint]);
            return;
        }
        // 방문한적 없고 다음 지점으로 길이 있으면 dfs 진행
        for (int next = 0; next < N; next++) {
            if (!visited[next] && cost[start][next] != 0) {
                visited[next] = true;
                dfs(next, depth + 1, costSum + cost[start][next]);
                visited[next] = false;
            }
        }
    }

    // +정수 빨리 읽기
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
