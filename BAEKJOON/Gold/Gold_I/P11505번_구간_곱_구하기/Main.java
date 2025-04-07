package BAEKJOON.Gold.Gold_I.P11505번_구간_곱_구하기;

import java.io.IOException;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static int[] tree;
    private static int[] nums;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        // 입력 및 초기화
        int N = readInt(); // 수의 개수
        int M = readInt(); // 수의 변경 횟수
        int K = readInt(); // 구간의 곱 구하는 횟수
        int height = (int) Math.ceil(Math.log(N) / Math.log(2));
        int treeSize = 1 << (height + 1);
        tree = new int[treeSize];
        nums = new int[N + 1];
        for (int i = 1; i <= N; i++)
            nums[i] = readInt();
        // 트리 생성 및 연산
        buildTree(1, 1, N);
        for (int i = 0; i < M + K; i++) {
            int op = readInt(); // 0 수 변경 || 1 구간 곱
            int b = readInt(); // 바꿀 숫자 인덱스 || 구간 곱 시작 위치
            int c = readInt(); // 바꿀 숫자 || 구간 곱 끝 위치
            if (op == 1) {
                updateTree(1, 1, N, b, c);
            } else {
                sb.append(multiplyTree(1, 1, N, b, c)).append('\n');
            }
        }
        System.out.print(sb.toString());
    }

    private static int buildTree(int node, int start, int end) {
        // 리프 노드에 도달한 경우, 입력 배열의 해당 값을 트리에 저장
        if (start == end) {
            return tree[node] = nums[start];
        }

        // 자식 노드를 재귀적으로 생성
        int mid = (start + end) >> 1;
        int leftProduct = buildTree((node << 1), start, mid);
        int rightProduct = buildTree((node << 1) + 1, mid + 1, end);

        // 현재 노드 값을 자식 노드의 곱으로 갱신
        return tree[node] = multiply(leftProduct, rightProduct);
    }

    private static int updateTree(int node, int start, int end, int index, int newValue) {
        // [start, end]가 index를 포함하지 않으면 현재 노드 값 반환
        if (index < start || end < index)
            return tree[node];
        // 리프 노드에 도달한 경우, 값을 새로 설정
        if (start == end)
            return tree[node] = newValue;

        // 자식 노드를 재귀적으로 갱신
        int mid = (start + end) >> 1;
        int left = updateTree((node << 1), start, mid, index, newValue);
        int right = updateTree((node << 1) + 1, mid + 1, end, index, newValue);

        // 현재 노드 값을 자식 노드의 곱으로 갱신
        return tree[node] = multiply(left, right);
    }

    private static int multiplyTree(int node, int start, int end, int left, int right) {
        // [start, end]와 [left, right]가 겹치지 않는 경우 → 곱셈 항등원 1 반환
        if (right < start || end < left)
            return 1;
        // [start, end]가 [left, right]에 완전히 포함되는 경우 → 이 노드의 값을 그대로 반환
        if (left <= start && end <= right)
            return tree[node];

        // 일부만 겹치는 경우 → 자식 노드로 내려가며 부분 곱을 구함
        int mid = (start + end) >> 1;
        // 왼쪽 자식 노드에서 [left, right]와 겹치는 부분 곱
        int leftProduct = multiplyTree((node << 1), start, mid, left, right);
        // 오른쪽 자식 노드에서 [left, right]와 겹치는 부분 곱
        int rightProduct = multiplyTree((node << 1) + 1, mid + 1, end, left, right);

        // 두 자식 노드의 결과를 곱해서 반환
        return multiply(leftProduct, rightProduct);
    }

    private static int multiply(int a, int b) {
        return (int) ((1L * a * b) % MOD);
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
