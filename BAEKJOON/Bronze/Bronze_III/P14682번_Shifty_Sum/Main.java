package BAEKJOON.Bronze.Bronze_III.P14682번_Shifty_Sum;

import java.io.IOException;

public class Main {
    private static int readInt() throws IOException {
        int c = System.in.read();
        int n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }

    public static void main(String[] args) throws Exception {
        int N = readInt();
        int k = readInt();

        int sum = 0;
        int factor = 1;
        for (int i = 0; i <= k; i++) {
            sum += N * factor;
            factor *= 10;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.print(sb);
    }
}
