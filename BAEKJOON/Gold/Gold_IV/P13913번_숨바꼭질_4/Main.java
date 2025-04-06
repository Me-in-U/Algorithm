package BAEKJOON.Gold.Gold_IV.P13913번_숨바꼭질_4;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    private static int N, K;
    private static int[] parent, time;
    private static final int MAX = 100_001;

    public static void main(String[] args) throws IOException {
        N = readInt();
        K = readInt();
        StringBuilder sb = new StringBuilder();
        if (N == K) {
            sb.append("0\n");
            sb.append(K);
        } else {
            bfs();
            int point = K;
            Deque<Integer> dq = new ArrayDeque<>();
            sb.append(time[K]).append("\n");
            while (point != N) {
                dq.add(point = parent[point]);
            }
            while (!dq.isEmpty()) {
                sb.append(dq.pollLast()).append(" ");
            }
            sb.append(K);
        }
        System.out.print(sb.toString());
    }

    private static void bfs() {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(N);
        parent = new int[MAX];
        time = new int[MAX];
        while (!dq.isEmpty()) {
            int X = dq.poll();
            if (X == K) {
                return;
            }
            // X + 1 위치로 이동
            int next1 = X + 1;
            if (next1 < MAX && time[next1] == 0) {
                time[next1] = time[X] + 1;
                parent[next1] = X;
                dq.add(next1);
            }
            // X - 1 위치로 이동
            int next2 = X - 1;
            if (0 <= next2 && time[next2] == 0) {
                time[next2] = time[X] + 1;
                parent[next2] = X;
                dq.add(next2);
            }
            // X * 2 위치로 이동
            int next3 = X << 1;
            if (next3 < MAX && time[next3] == 0) {
                time[next3] = time[X] + 1;
                parent[next3] = X;
                dq.add(next3);
            }
        }
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
        while (c <= ' ') {
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
