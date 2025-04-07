package BAEKJOON.Platinum.Platinum_IV.P10999번_구간_합_구하기_2;

import java.io.IOException;

public class Main {
    private static long[] tree, nums, lazy;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // 입력 및 초기화
        int N = (int) readLong(); // 수의 개수
        int M = (int) readLong(); // 수의 변경이 일어나는 횟수
        int K = (int) readLong(); // 구간의 합을 구하는 횟수
        int height = (int) Math.ceil(Math.log(N) / Math.log(2));
        int treeSize = 1 << (height + 1);
        tree = new long[treeSize];
        lazy = new long[treeSize];
        nums = new long[N + 1];
        for (int i = 1; i <= N; i++)
            nums[i] = readLong();
        // 트리 생성 및 연산
        buildTree(1, 1, N);
        for (int i = 0; i < M + K; i++) {
            long op = readLong();
            int b = (int) readLong();
            int c = (int) readLong();
            if (op == 1L) {
                long d = readLong();
                updateRange(1, 1, N, b, c, d);
            } else {
                sb.append(sumTree(1, 1, N, b, c)).append('\n');
            }
        }
        System.out.print(sb.toString());
    }

    private static long buildTree(int node, int start, int end) {
        if (start == end) {
            return tree[node] = nums[start];
        }
        int mid = (start + end) >> 1;
        long leftProduct = buildTree((node << 1), start, mid);
        long rightProduct = buildTree((node << 1) + 1, mid + 1, end);
        return tree[node] = leftProduct + rightProduct;
    }

    private static void propagate(int node, int start, int end) {
        if (lazy[node] != 0) {
            tree[node] += (end - start + 1) * lazy[node];
            if (start != end) {
                lazy[node << 1] += lazy[node];
                lazy[(node << 1) + 1] += lazy[node];
            }
            lazy[node] = 0;
        }
    }

    private static long sumTree(int node, int start, int end, int left, int right) {
        propagate(node, start, end);

        if (right < start || end < left)
            return 0;
        if (left <= start && end <= right)
            return tree[node];

        int mid = (start + end) >> 1;
        long leftSum = sumTree((node << 1), start, mid, left, right);
        long rightSum = sumTree((node << 1) + 1, mid + 1, end, left, right);

        return leftSum + rightSum;
    }

    // 구간 [l, r]에 value를 더하는 함수
    private static void updateRange(int node, int start, int end, int left, int right, long value) {
        propagate(node, start, end);
        if (right < start || end < left)
            return;
        if (left <= start && end <= right) {
            // 값 직접 반영, lazy는 자식에게 전달
            tree[node] += (end - start + 1) * value;
            if (start != end) {
                lazy[node << 1] += value;
                lazy[(node << 1) + 1] += value;
            }
            return;
        }
        int mid = (start + end) >> 1;
        updateRange(node << 1, start, mid, left, right, value);
        updateRange((node << 1) + 1, mid + 1, end, left, right, value);

        tree[node] = tree[node << 1] + tree[(node << 1) + 1];
    }

    private static long readLong() throws IOException {
        int c;
        long n = 0;
        c = System.in.read();
        boolean isNegative = false;
        while (c <= ' ') {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}
