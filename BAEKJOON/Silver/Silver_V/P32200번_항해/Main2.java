package BAEKJOON.Silver.Silver_V.P32200번_항해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main2 {
    private static class Pair {
        int meals, waste;

        public Pair(int meals, int waste) {
            this.meals = meals;
            this.waste = waste;
        }
    }

    private static Pair better(Pair a, Pair b) {
        if (a.meals != b.meals)
            return a.meals > b.meals ? a : b;
        return a.waste <= b.waste ? a : b;
    }

    private static class SegmentTree {
        Pair[] tree;
        int n;

        public SegmentTree(int size) {
            n = size;
            tree = new Pair[n * 4];
        }

        public void build(Pair[] arr, int idx, int left, int right) {
            if (left == right) {
                tree[idx] = arr[left];
                return;
            }
            int mid = (left + right) >> 1;
            build(arr, idx * 2, left, mid);
            build(arr, idx * 2 + 1, mid + 1, right);
            tree[idx] = better(tree[idx * 2], tree[idx * 2 + 1]);
        }

        public void update(int idx, int left, int right, int pos, Pair val) {
            if (left == right) {
                tree[idx] = val;
                return;
            }
            int mid = (left + right) >> 1;
            if (pos <= mid)
                update(idx * 2, left, mid, pos, val);
            else
                update(idx * 2 + 1, mid + 1, right, pos, val);
            tree[idx] = better(tree[idx * 2], tree[idx * 2 + 1]);
        }

        // query range [ql, qr]
        public Pair query(int idx, int left, int right, int ql, int qr) {
            if (ql > right || qr < left)
                return new Pair(-1, Integer.MAX_VALUE); // 아주 낮은 값
            if (ql <= left && right <= qr)
                return tree[idx];
            int mid = (left + right) >> 1;
            Pair p1 = query(idx * 2, left, mid, ql, qr);
            Pair p2 = query(idx * 2 + 1, mid + 1, right, ql, qr);
            return better(p1, p2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        int maxA = 0;
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            maxA = Math.max(maxA, A[i]);
        }
        maxA = Math.max(maxA, X);

        Pair[] dp = new Pair[maxA + 1];
        for (int a = 0; a < X && a <= maxA; a++) {
            dp[a] = new Pair(0, a);
        }

        // dp 배열을 세그먼트 트리로 관리 (인덱스 0부터 maxA)
        SegmentTree segTree = new SegmentTree(maxA + 1);
        // 초기 dp[0..X-1]만 채워진 상태로 트리 build
        // 나머지는 임의 값; 이후 a>=X에 대해 update 진행
        for (int a = X; a <= maxA; a++) {
            dp[a] = new Pair(-1, Integer.MAX_VALUE); // 초기값 (사용되지 않음)
        }
        segTree.build(dp, 1, 0, maxA);

        // a from X to maxA: dp[a] = 1 + best(dp[d]) for d in [max(0, a-Y), a-X]
        for (int a = X; a <= maxA; a++) {
            int L = Math.max(0, a - Y);
            int R = a - X;
            // 구간에 아무것도 없는 경우(R < L) 는 있을 수 없음(왜냐하면 a>=X이면 R>=0)
            Pair bestCandidate = segTree.query(1, 0, maxA, L, R);
            // bestCandidate가 -1이면 의미없는 값이므로(이 경우는 발생하지 않음) 처리하지 않아도 됨.
            dp[a] = new Pair(bestCandidate.meals + 1, bestCandidate.waste);
            segTree.update(1, 0, maxA, a, dp[a]);
        }

        // 각 샌드위치에 대해 dp[A[i]]가 최적의 (식사 횟수, 낭비 길이)임
        long totalMeals = 0;
        long totalWaste = 0;
        for (int i = 0; i < N; i++) {
            Pair res = dp[A[i]];
            // 만약 A[i] < X, dp[A[i]]는 (0, A[i])
            totalMeals += res.meals;
            totalWaste += res.waste;
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(totalMeals);
        out.println(totalWaste);
        out.flush();
    }
}
