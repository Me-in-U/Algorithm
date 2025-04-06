package BAEKJOON.Platinum.Platinum_V.P1761번_정점들의_거리;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static int N;// 트리의 정점 개수
    private static int logN;
    private static int[] depth; // 루트(1번 정점)로부터 각 정점까지의 깊이
    private static int[] dist; // 루트(1번 정점)로부터 각 정점까지의 누적 가중치 거리
    private static int[][] ancestors;
    private static ArrayList<Edge>[] adjList;

    public static class Edge {
        int to;
        int weight;

        /**
         * Edge 객체를 생성
         *
         * @param to     간선의 도착 정점
         * @param weight 간선의 가중치
         */
        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        // 정점의 개수 입력
        N = readInt();
        logN = (int) Math.ceil(Math.log(N) / Math.log(2));

        // 배열 및 인접 리스트 초기화
        depth = new int[N + 1];
        dist = new int[N + 1];
        ancestors = new int[N + 1][logN + 1];
        adjList = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        // 트리의 간선 정보 입력
        for (int i = 0; i < N - 1; i++) {
            int u = readInt();
            int v = readInt();
            int weight = readInt();
            adjList[u].add(new Edge(v, weight));
            adjList[v].add(new Edge(u, weight));
        }

        // DFS를 이용해 깊이, 누적 가중치, 부모(ancestors[][0])를 구함
        dfs(1, 0);

        // 조상 테이블 구축
        setAncestors();

        int M = readInt();
        while (M-- > 0) {
            int u = readInt();
            int v = readInt();
            int lca = findLCA(u, v);
            int distanceBetweenNodes = dist[u] + dist[v] - 2 * dist[lca];
            sb.append(distanceBetweenNodes).append('\n');
        }
        System.out.print(sb.toString());
    }

    /**
     * DFS를 이용해 깊이, 누적 가중치, 부모(ancestors[][0])를 구함
     *
     * @param current 현재 방문 중인 정점.
     * @param parent  current의 부모 정점.
     */
    public static void dfs(int current, int parent) {
        // current 정점의 바로 위 부모를 설정.
        ancestors[current][0] = parent;
        // 인접한 정점을 방문하면서 깊이와 누적 거리를 갱신.
        for (Edge edge : adjList[current]) {
            if (edge.to != parent) {
                depth[edge.to] = depth[current] + 1;
                dist[edge.to] = dist[current] + edge.weight;
                dfs(edge.to, current);
            }
        }
    }

    // 조상테이블 구축
    public static void setAncestors() {
        for (int j = 1; j <= logN; j++)
            for (int i = 1; i <= N; i++)
                if (ancestors[i][j - 1] != 0)
                    ancestors[i][j] = ancestors[ancestors[i][j - 1]][j - 1];
    }

    /**
     * 두 정점 u와 v의 최소 공통 조상(LCA)을 이진 도약 방식으로 찾습니다.
     *
     * @param u 첫 번째 정점.
     * @param v 두 번째 정점.
     * @return 정점 u와 v의 최소 공통 조상.
     */
    public static int findLCA(int u, int v) {
        // 먼저, 더 깊은 노드가 u가 되도록 맞춘다.
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        // u를 v와 같은 깊이로 올린다.
        for (int i = logN; i >= 0; i--)
            if (depth[u] - depth[v] >= (1 << i))
                u = ancestors[u][i];
        if (u == v)
            return u;

        // 두 정점을 동시에 올리며 LCA를 찾는다.
        for (int i = logN; i >= 0; i--) {
            if (ancestors[u][i] != ancestors[v][i]) {
                u = ancestors[u][i];
                v = ancestors[v][i];
            }
        }
        return ancestors[u][0];
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = n * 10 + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
