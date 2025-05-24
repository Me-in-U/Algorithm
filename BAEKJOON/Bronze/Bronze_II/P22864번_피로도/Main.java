package BAEKJOON.Bronze.Bronze_II.P22864번_피로도;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int A = readInt();
        int B = readInt();
        int C = readInt();
        int M = readInt();
        int fatigue = 0;
        int totalWork = 0;
        for (int hour = 0; hour < 24; hour++) {
            if (fatigue + A <= M) {
                fatigue += A;
                totalWork += B;
            } else {
                fatigue -= C;
                if (fatigue < 0) {
                    fatigue = 0;
                }
            }
        }
        System.out.print(totalWork);
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
