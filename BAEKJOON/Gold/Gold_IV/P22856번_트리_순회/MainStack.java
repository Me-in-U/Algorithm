package P22856번_트리_순회;

import java.io.IOException;

public class MainStack {
    private static class Node {
        Node left, right;
    }

    public static void main(String[] args) throws IOException {
        int N = readInt();
        Node[] nodes = new Node[N + 1];
        for (int i = 1; i <= N; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < N; i++) {
            int a = readInt();
            int b = readInt();
            int c = readInt();
            if (b != -1)
                nodes[a].left = nodes[b];
            if (c != -1)
                nodes[a].right = nodes[c];
        }

        // 중위 순회를 반복문(스택 이용)으로 진행하여 마지막 방문 노드의 깊이를 구한다.
        int lastDepth = 0;
        Node current = nodes[1];
        int depth = 0;
        // 스택: 노드와 해당 노드의 깊이를 저장
        Node[] stack = new Node[N];
        int[] dStack = new int[N];
        int top = 0;

        while (current != null || top > 0) {
            // 왼쪽으로 계속 내려감
            while (current != null) {
                stack[top] = current;
                dStack[top] = depth;
                top++;
                current = current.left;
                depth++;
            }
            // 더 이상 왼쪽이 없으면 스택에서 꺼냄
            top--;
            current = stack[top];
            depth = dStack[top];
            // 현재 방문 노드가 중위 순회에서 가장 최근 방문한 노드가 됨
            lastDepth = depth;
            // 오른쪽 서브트리로 이동 (부모의 깊이+1)
            current = current.right;
            depth++;
        }

        // 이동 횟수 = 2 × (N - 1) - (마지막 노드의 깊이)
        int result = (N > 1) ? 2 * (N - 1) - lastDepth : 0;
        System.out.println(result);
    }

    private static int readInt() throws IOException {
        int n = 0;
        int c = System.in.read();
        boolean isNegative = false;
        while (c <= ' ') {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = n * 10 + (c - '0');
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}
