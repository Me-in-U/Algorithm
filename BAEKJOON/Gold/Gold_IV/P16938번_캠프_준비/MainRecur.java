package BAEKJOON.Gold.Gold_IV.P16938번_캠프_준비;

import java.io.IOException;

public class MainRecur {
    private static int N; // N개 문제
    private static int L; // 난이도의 합은 L보다 크거나 같다
    private static int R; // 난이도의 합은 R보다 작거나 같다
    private static int X; // 난이도 차이는 X보다 크거나 같다
    private static int result = 0;
    private static int[] A; // N개 문제 난이도

    public static void main(String[] args) throws IOException {
        N = readInt();
        L = readInt();
        R = readInt();
        X = readInt();
        A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = readInt();
        // Arrays.sort(A);
        recursive(0, 0, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.print(new StringBuilder().append(result));
    }

    private static void recursive(int selectedCount, int index, int tempSum, int tempMin, int tempMax) {
        if ((2 <= selectedCount) && (L <= tempSum && tempSum <= R) && (X <= (tempMax - tempMin))) {
            result++;
        }
        for (int i = index; i < N; i++) {
            recursive(selectedCount + 1, i + 1, tempSum + A[i], Math.min(tempMin, A[i]), Math.max(tempMax, A[i]));
        }
    }

    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
