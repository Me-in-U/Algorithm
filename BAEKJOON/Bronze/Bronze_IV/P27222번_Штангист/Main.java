package BAEKJOON.Bronze.Bronze_IV.P27222번_Штангист;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] days = new int[n];
        for (int i = 0; i < n; i++) {
            days[i] = readInt();
        }
        int sum = 0;
        for (int workout : days) {
            int before = readInt();
            int after = readInt();
            if (workout == 1) {
                int diff = (after - before);
                if (diff > 0) {
                    sum += diff;
                }
            }
        }
        System.out.print(sum);
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