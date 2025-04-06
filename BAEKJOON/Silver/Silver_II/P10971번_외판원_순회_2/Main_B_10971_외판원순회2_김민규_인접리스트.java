package BAEKJOON.Silver.Silver_II.P10971번_외판원_순회_2;

/**
 * BAEKJOON 10971번 외판원 순회 2
 * 
 * @author KIM MINGYU jun3021303@gmail.com
 * @since 2025-03-05 JAVA8 : 메모리 17,624 KB, 시간 144ms
 * @since 2025-03-05 JAVA11 : 메모리 20,972 KB, 시간 196ms
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main_B_10971_외판원순회2_김민규_인접리스트 {
    private static boolean[] visited;
    private static int minCost = Integer.MAX_VALUE;
    private static int N;
    private static List<int[]>[] graph;
    private static int startEndPoint;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        // 입력 및 초기화
        N = readInt();
        graph = new ArrayList[N];
        for (int from = 0; from < N; from++) {
            graph[from] = new ArrayList<>();
            for (int to = 0; to < N; to++) {
                int weight = readInt();
                if (weight != 0) {
                    graph[from].add(new int[] { to, weight });
                }
            }
        }

        // DFS 시작
        for (int start = 0; start < N; start++) {
            visited = new boolean[N];
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
        if (depth == N - 1) {
            for (int[] node : graph[start]) {
                if (node[0] == startEndPoint) {
                    minCost = Math.min(minCost, costSum + node[1]);
                    return;
                }
            }
            return;
        }
        // 방문한적 없고 다음 지점으로 길이 있으면 dfs 진행
        for (int[] node : graph[start]) {
            int next = node[0];
            int weight = node[1];
            if (!visited[next]) {
                visited[next] = true;
                dfs(next, depth + 1, costSum + weight);
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
