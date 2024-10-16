package P11438번_LCA_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {
    protected static int N, LOG;
    protected static List<List<Integer>> tree = new ArrayList<>();
    protected static int[][] parent;
    protected static int[] depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        LOG = (int) Math.ceil(Math.log(N) / Math.log(2));
        parent = new int[N + 1][LOG + 1];
        depth = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            tree.get(u).add(v);
            tree.get(v).add(u);
        }

        dfs(1, 0);

        for (int j = 1; j <= LOG; j++) {
            for (int i = 1; i <= N; i++) {
                if (parent[i][j - 1] != 0) {
                    parent[i][j] = parent[parent[i][j - 1]][j - 1];
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            sb.append(lca(u, v)).append('\n');
        }
        System.out.print(sb.toString());
    }

    static void dfs(int node, int par) {
        depth[node] = depth[par] + 1;
        parent[node][0] = par;
        for (int next : tree.get(node)) {
            if (next != par) {
                dfs(next, node);
            }
        }
    }

    static int lca(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        for (int i = LOG; i >= 0; i--) {
            if (depth[u] - depth[v] >= (1 << i)) {
                u = parent[u][i];
            }
        }

        if (u == v) {
            return u;
        }

        for (int i = LOG; i >= 0; i--) {
            if (parent[u][i] != parent[v][i]) {
                u = parent[u][i];
                v = parent[v][i];
            }
        }

        return parent[u][0];
    }
}
