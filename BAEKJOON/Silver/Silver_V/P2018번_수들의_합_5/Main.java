package BAEKJOON.Silver.Silver_V.P2018번_수들의_합_5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        while (N % 2 == 0) {
            N /= 2;
        }
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (i * i != N) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        return n;
    }
}
