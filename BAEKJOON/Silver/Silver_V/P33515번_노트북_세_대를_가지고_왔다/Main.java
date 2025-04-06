package BAEKJOON.Silver.Silver_V.P33515번_노트북_세_대를_가지고_왔다;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print(new StringBuilder().append(Math.min(readInt(), readInt())));
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
