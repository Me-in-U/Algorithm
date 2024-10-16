package P1197번_최소_스패닝_트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    protected static int V;
    protected static int E;
    protected static int[] parent;
    protected static Edge[] edges;
    protected static int weight = 0; // weight 초기화

    public static class Edge implements Comparable<Edge> {
        int node1;
        int node2;
        int cost;

        Edge(int node1, int node2, int cost) {
            this.node1 = node1;
            this.node2 = node2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge e) {
            return this.cost - e.cost; // 비용을 기준으로 정렬
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        V = Integer.parseInt(input[0]);
        E = Integer.parseInt(input[1]);
        parent = new int[V + 1];
        edges = new Edge[E];
        for (int i = 1; i < V + 1; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < E; i++) {
            input = br.readLine().split(" ");
            int node1 = Integer.parseInt(input[0]);
            int node2 = Integer.parseInt(input[1]);
            int cost = Integer.parseInt(input[2]);
            edges[i] = new Edge(node1, node2, cost);
        }
        Arrays.sort(edges); // 간선을 비용 순으로 정렬
        for (int i = 0; i < E; i++) {
            Edge edge = edges[i];
            if (find(edge.node1) == find(edge.node2))
                continue;
            weight += edge.cost;
            union(edge.node1, edge.node2);
        }
        System.out.println(weight);
    }

    public static void union(int x, int y) {
        x = find(x); // 루트를 찾아서
        y = find(y); // 루트를 찾아서
        if (x > y)
            parent[x] = y;
        else
            parent[y] = x;
    }

    public static int find(int x) {
        if (parent[x] == x)
            return x;
        parent[x] = find(parent[x]);
        return parent[x];
    }
}