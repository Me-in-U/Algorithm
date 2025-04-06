package BAEKJOON.Bronze.Bronze_III.P23809번_골뱅이_찍기_돌아간_ㅈ;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = readInt();
        StringBuilder a = new StringBuilder().append("@".repeat(N));
        StringBuilder a__a = new StringBuilder().append(a).append("  ".repeat(N)).append(a).append('\n');
        StringBuilder a___a = new StringBuilder().append(a).append("   ".repeat(N)).append(a).append('\n');
        StringBuilder mid = new StringBuilder().append("@@@".repeat(N)).append('\n');
        StringBuilder result = new StringBuilder((21 * N * N) + (5 * N));
        for (int i = 0; i < N; i++) {
            result.append(a___a);
        }
        for (int i = 0; i < N; i++) {
            result.append(a__a);
        }
        int insert = (9 * N * N) + (2 * N);
        result.append(new StringBuilder(result.toString()).reverse()).delete(insert - 1, insert);
        for (int i = 0; i < N; i++) {
            result.insert(insert, mid);
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