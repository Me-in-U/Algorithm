package BAEKJOON.Bronze.Bronze_III.P16504번_종이접기;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        long sum = 0;
        for (int i = 0; i < N * N; i++) {
            sum += readInt();
        }
        System.out.print(new StringBuilder().append(sum));
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
