package BAEKJOON.Bronze.Bronze_V.P34721번_역사를_걸으면_동국이_보이고;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int A = readInt();
        StringBuilder sb = new StringBuilder(A * 11);
        String loveDGU = "I love DGU\n";
        while (A-- > 0)
            sb.append(loveDGU);
        System.out.print(sb);
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
