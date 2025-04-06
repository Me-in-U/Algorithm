package BAEKJOON.Silver.Silver_V.P2018번_수들의_합_5;

import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        int start = 1;
        int end = 1;
        int N = readInt();
        int count = 1;
        int sum = 1;
        while (start < N) {
            if (sum == N)
                count++;
            if (sum > N || end == N)
                sum -= start++;
            else {
                sum += ++end;
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