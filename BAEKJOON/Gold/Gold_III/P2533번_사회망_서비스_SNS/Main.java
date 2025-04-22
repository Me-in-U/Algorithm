package BAEKJOON.Gold.Gold_III.P2533번_사회망_서비스_SNS;

import java.io.IOException;

public class Main {
    private static class Node {
        int id;
        Node nextChild;

        Node(int id, Node nextChild) {
            this.id = id;
            this.nextChild = nextChild;
        }
    }

    private static int N;
    private static int[][] dp;
    private static Node[] nodes;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        N = readInt();
        dp = new int[N + 1][2];
        nodes = new Node[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i < N; i++) {
            int u = readInt();
            int v = readInt();
            nodes[u] = new Node(v, nodes[u]);
            nodes[v] = new Node(u, nodes[v]);
        }
        dfs(1);
        System.out.print(Math.min(dp[1][0], dp[1][1]));
    }

    private static void dfs(int u) {
        visited[u] = true;
        // 초기값 설정
        dp[u][0] = 0; // 얼리 어답터가 아닌 경우
        dp[u][1] = 1; // 얼리 어답터인 경우 (자신 포함)
        for (Node child = nodes[u]; child != null; child = child.nextChild) {
            int v = child.id;
            // 이미 방문한 노드는 건너뜀(부모랑 방문한 자식)
            if (visited[v])
                continue;
            dfs(v);
            // u가 얼리 더답터가 아니면 v는 얼리 어답터여야 함
            // v가 얼리 어답터일 경우 최적값 누적
            dp[u][0] += dp[v][1];
            // u가 얼리 어답터인 경우 v는 얼리 어답터일 수도 있고 아닐 수도 있음
            // v가 얼리 어답터이거나 아닌 경우중 최소 최적값 누적
            dp[u][1] += Math.min(dp[v][0], dp[v][1]);
        }
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
