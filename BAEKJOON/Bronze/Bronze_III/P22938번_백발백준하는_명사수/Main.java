package BAEKJOON.Bronze.Bronze_III.P22938번_백발백준하는_명사수;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        int x1 = readInt();
        int y1 = readInt();
        int r1 = readInt();
        int x2 = readInt();
        int y2 = readInt();
        int r2 = readInt();

        long dx = (long) x1 - x2;
        long dy = (long) y1 - y2;
        long d2 = dx * dx + dy * dy;

        long sumRadius = (long) r1 + r2;
        long sumRadiusSquared = sumRadius * sumRadius;

        long diffRadius = Math.abs((long) r1 - r2);
        long diffRadiusSquared = diffRadius * diffRadius;

        boolean isOverlapping = (d2 < sumRadiusSquared && d2 > diffRadiusSquared) || (d2 == 0 && r1 == r2);

        StringBuilder sb = new StringBuilder();
        sb.append(isOverlapping ? "YES" : "NO");
        System.out.print(sb.toString());
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
