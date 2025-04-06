package BAEKJOON.Bronze.Bronze_III.P23802번_골뱅이_찍기_뒤집힌_ㄱ;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = readInt();
        StringBuilder aaaaa = new StringBuilder().append("@@@@@".repeat(N)).append('\n');
        StringBuilder aaa = new StringBuilder().append("@".repeat(N)).append('\n');
        StringBuilder result = new StringBuilder(N * ((5 * N + 1) + (3 * N + 1)));
        for (int i = 0; i < N; i++) {
            result.append(aaaaa);
        }
        for (int i = 0; i < 4 * N; i++) {
            result.append(aaa);
        }
        bw.write(result.toString());
        bw.flush();
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n << 3) + (n << 1) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}