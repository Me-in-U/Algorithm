package BAEKJOON.Bronze.Bronze_I.P20112번_사토르_마방진;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        System.in.read(); // CR
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = System.in.read();
            }
            System.in.read(); // CR
            System.in.read(); // LF
        }
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (arr[i][j] != arr[j][i]) {
                    System.out.print("NO");
                    return;
                }
        System.out.print("YES");
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
