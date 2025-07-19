package BAEKJOON.Gold.Gold_IV.P34071번_첫_번째_문제는_정말_쉬운_문제일까;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] levels = new int[N];
        for (int i = 0; i < N; i++)
            levels[i] = readInt();
        int first = levels[0];
        int min = first;
        int max = first;
        for (int i = 1; i < N; i++) {
            if (levels[i] < min)
                min = levels[i];
            if (levels[i] > max)
                max = levels[i];
        }
        System.out.print(first == min ? "ez" : first == max ? "hard" : "?");
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
