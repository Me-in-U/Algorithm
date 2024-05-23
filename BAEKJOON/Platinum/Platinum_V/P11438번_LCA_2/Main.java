package BAEKJOON.Platinum.Platinum_V.P11438번_LCA_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    protected static Map<Integer, Integer> parentMap = new HashMap<>();
    protected static Set<Integer> nodes = new HashSet<>();
    protected static int[] depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        nodes.add(1);
        int N = Integer.parseInt(br.readLine());
        depth = new int[N + 1];
        depth[1] = 1; // 루트 노드의 깊이를 1로 설정
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            if (nodes.contains(node1)) {
                nodes.add(node2);
                parentMap.put(node2, node1);
                depth[node2] = depth[node1] + 1;
            } else {
                nodes.add(node1);
                parentMap.put(node1, node2);
                depth[node1] = depth[node2] + 1;
            }
        }

        // 루트 노드(1)의 부모를 null로 설정
        parentMap.put(1, null);

        int M = Integer.parseInt(br.readLine());
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            int lca = findLCA(node1, node2);
            sb.append(lca).append('\n');
        }
        System.out.print(sb.toString());
    }

    private static int findLCA(int node1, int node2) {
        // 깊이를 맞춤
        if (depth[node1] < depth[node2]) {
            int temp = node1;
            node1 = node2;
            node2 = temp;
        }

        // node1을 node2의 깊이까지 올림
        while (depth[node1] > depth[node2]) {
            node1 = parentMap.get(node1);
        }

        // 공통 조상을 찾을 때까지 동시에 올림
        while (node1 != node2) {
            node1 = parentMap.get(node1);
            node2 = parentMap.get(node2);
        }

        return node1;
    }
}
