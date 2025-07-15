package BAEKJOON.Bronze.Bronze_III.P22938번_백발백준하는_명사수;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long x1 = readLong();
        long y1 = readLong();
        long r1 = readLong();

        long x2 = readLong();
        long y2 = readLong();
        long r2 = readLong();

        long dx = x2 - x1;
        long dy = y2 - y1;
        long distSq = dx * dx + dy * dy;

        long rSum = r1 + r2;
        long rDiff = Math.abs(r1 - r2);

        if (distSq > rDiff * rDiff && distSq < rSum * rSum) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    private static long readLong() throws IOException {
        long c = System.in.read(), n = 0;
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
