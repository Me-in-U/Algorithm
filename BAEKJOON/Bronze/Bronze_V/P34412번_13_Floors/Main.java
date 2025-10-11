package BAEKJOON.Bronze.Bronze_V.P34412번_13_Floors;

import java.io.IOException;

public class Main {
    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = n * 10 + (c & 15);
            c = System.in.read();
        }
        return n;
    }

    public static void main(String[] args) throws IOException {
        int x = readInt();
        StringBuilder sb = new StringBuilder();

        if (x <= 12)
            sb.append(x);
        else
            sb.append(x + 1);

        System.out.print(sb);
    }
}
