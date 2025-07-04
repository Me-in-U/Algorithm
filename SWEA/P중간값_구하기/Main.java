package SWEA.P중간값_구하기;

import java.io.IOException;
import java.util.PriorityQueue;

public class Main {
    private static final int MOD = 20171109;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = readInt();
            int A = readInt();
            PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a, b) -> b - a);
            PriorityQueue<Integer> minPQ = new PriorityQueue<>();
            maxPQ.offer(A);
            long sum = 0;
            while (N-- > 0) {
                int X = readInt();
                int Y = readInt();
                addNum(maxPQ, minPQ, X);
                addNum(maxPQ, minPQ, Y);
                sum = (sum + maxPQ.peek()) % MOD;
            }
            sb.append("#").append(tc).append(" ").append(sum).append("\n");
        }
        System.out.print(sb);
    }

    private static void addNum(PriorityQueue<Integer> maxPQ, PriorityQueue<Integer> minPQ, int num) {
        if (maxPQ.isEmpty() || num <= maxPQ.peek()) {
            maxPQ.offer(num);
        } else {
            minPQ.offer(num);
        }

        if (maxPQ.size() < minPQ.size()) {
            maxPQ.offer(minPQ.poll());
        } else if (maxPQ.size() > minPQ.size() + 1) {
            minPQ.offer(maxPQ.poll());
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
