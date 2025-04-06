package BAEKJOON.Bronze.Bronze_III.P1703번_생장점;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int N;
        while ((N = readInt()) != 0) {
            int tree = 1;
            for (int i = 0; i < (N << 1); i++) {
                int M = readInt();
                if (i % 2 == 0) {
                    tree *= M;
                } else {
                    tree -= M;
                }
            }
            sb.append(tree).append('\n');
        }
        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        while ((c = System.in.read()) > 47)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}