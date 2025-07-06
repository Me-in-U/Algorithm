package BAEKJOON.Bronze.Bronze_III.P15923번_욱제는_건축왕이야;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = readInt();
            y[i] = readInt();
        }
        long perimeter = 0;
        for (int i = 0; i < N; i++) {
            int j = (i + 1) % N;
            perimeter += Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
        }
        System.out.print(perimeter);
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = n * 10 + (c - '0');
            c = System.in.read();
        }
        return n;
    }
}