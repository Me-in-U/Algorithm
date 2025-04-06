package BAEKJOON.Gold.Gold_III.P2252번_줄_세우기;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int M = readInt();
        int[] inDegree = new int[N + 1];
        List<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int j = 0; j < M; j++) {
            int A = readInt();
            int B = readInt();
            graph[A].add(B);
            inDegree[B]++;
        }

        // !Topology Sort
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i < N + 1; i++) {
            if (inDegree[i] == 0) {
                queue.addLast(i);
            }
        }
        while (!queue.isEmpty()) {
            int now = queue.pollFirst();
            sb.append(now).append(' ');
            for (int next : graph[now]) {
                if (--inDegree[next] == 0) {
                    queue.addLast(next);
                }
            }
        }
        System.out.println(sb);
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
