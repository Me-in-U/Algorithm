package BAEKJOON.Bronze.Bronze_III.P8932번_7종_경기;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();

        double[] A = { 9.23076, 1.84523, 56.0211, 4.99087, 0.188807, 15.9803, 0.11193 };
        double[] B = { 26.7, 75, 1.5, 42.5, 210, 3.8, 254 };
        double[] C = { 1.835, 1.348, 1.05, 1.81, 1.41, 1.04, 1.88 };
        boolean[] isTrack = { true, false, false, true, false, false, true };

        int T = readInt();
        for (int t = 0; t < T; t++) {
            long total = 0;
            for (int i = 0; i < 7; i++) {
                int P = readInt();
                double x = isTrack[i] ? (B[i] - P) : (P - B[i]);
                double val = A[i] * Math.pow(x, C[i]);
                long score = (long) Math.floor(val);
                total += score;
            }
            sb.append(total).append('\n');
        }

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
