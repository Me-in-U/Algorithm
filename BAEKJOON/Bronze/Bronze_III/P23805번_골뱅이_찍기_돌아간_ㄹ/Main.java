package BAEKJOON.Bronze.Bronze_III.P23805번_골뱅이_찍기_돌아간_ㄹ;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = readInt();
        StringBuilder aaa_a = new StringBuilder().append("@@@".repeat(N)).append(" ".repeat(N)).append("@".repeat(N));
        StringBuilder a_a_a = new StringBuilder().append("@".repeat(N)).append(" ".repeat(N)).append("@".repeat(N))
                .append(" ".repeat(N)).append("@".repeat(N));
        StringBuilder result = new StringBuilder(5 * (N * (N * 5 + 1)));
        for (int i = 0; i < N; i++) {
            result.append(aaa_a).append('\n');
        }
        for (int i = 0; i < 3 * N; i++) {
            result.append(a_a_a).append('\n');
        }
        aaa_a.reverse();
        for (int i = 0; i < N; i++) {
            result.append(aaa_a).append('\n');
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