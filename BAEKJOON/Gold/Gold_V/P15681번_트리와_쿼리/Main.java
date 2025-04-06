package BAEKJOON.Gold.Gold_V.P15681번_트리와_쿼리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    protected static List<Integer>[] list;
    protected static List<Integer>[] tree;
    protected static int[] size;
    protected static int[] nodeParent;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int R = Integer.parseInt(input[1]);
        int Q = Integer.parseInt(input[2]);
        list = new ArrayList[N + 1];
        tree = new ArrayList[N + 1];
        size = new int[N + 1];
        nodeParent = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            list[i] = new ArrayList<>();
            tree[i] = new ArrayList<>();
        }
        for (int i = 1; i < N; i++) {
            input = br.readLine().split(" ");
            int U = Integer.parseInt(input[0]);
            int V = Integer.parseInt(input[1]);
            list[U].add(V);
            list[V].add(U);
        }
        makeTree(R, -1);
        countSubtreeNodes(R);
        for (int i = 0; i < Q; i++) {
            int U = Integer.parseInt(br.readLine());
            sb.append(size[U]).append('\n');
        }
        System.out.println(sb.toString().trim());
    }

    public static void makeTree(int currentNode, int parent) {
        for (int node : list[currentNode]) {
            if (node != parent) {
                tree[currentNode].add(node);
                nodeParent[node] = currentNode;
                makeTree(node, currentNode);
            }
        }
    }

    public static void countSubtreeNodes(int currentNode) {
        size[currentNode] = 1; // 자신도 자신을 루트로 하는 서브트리에 포함되므로 0이 아닌 1에서 시작한다.
        for (int node : tree[currentNode]) {
            countSubtreeNodes(node);
            size[currentNode] += size[node];
        }
    }
}