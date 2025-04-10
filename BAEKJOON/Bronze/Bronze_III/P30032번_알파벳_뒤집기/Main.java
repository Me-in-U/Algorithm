package BAEKJOON.Bronze.Bronze_III.P30032번_알파벳_뒤집기;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        char[] map = new char[114];
        StringBuilder sb = new StringBuilder();
        int N = readInt();
        int D = readInt();
        if (D == 1) {
            map['d'] = 'q';
            map['b'] = 'p';
            map['q'] = 'd';
            map['p'] = 'b';
        } else {
            map['d'] = 'b';
            map['b'] = 'd';
            map['q'] = 'p';
            map['p'] = 'q';
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                sb.append(map[System.in.read()]);
            System.in.read();
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
        while (c <= ' ') {
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
