package BAEKJOON.Bronze.Bronze_III.P15734번_명장_남정훈;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int L = readInt();
        int R = readInt();
        int A = readInt();

        int diff = Math.abs(L - R);
        if (A >= diff) {
            int min = Math.min(L, R);
            A -= diff;
            int equal = min + diff;
            int extra = (A / 2) * 2;
            System.out.println(equal * 2 + extra);
        } else {
            int equal = Math.min(L, R) + A;
            System.out.println(equal * 2);
        }
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
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
