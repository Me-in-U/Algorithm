package BAEKJOON.Gold.Gold_IV.P9663번_NQueen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int N;
    public static int count = 0;
    public static boolean[] col;
    public static boolean[] slash; // "/" 대각선
    public static boolean[] backslash; // "\" 대각선

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        col = new boolean[N];
        slash = new boolean[2 * N];
        backslash = new boolean[2 * N];
        solve(0);
        System.out.println(count);
    }

    public static void solve(int x) {
        if (x == N) {
            count++;
            return;
        }

        for (int y = 0; y < N; y++) {
            if (!col[y] && !slash[x + y] && !backslash[x - y + (N - 1)]) {
                col[y] = true;
                slash[x + y] = true;
                backslash[x - y + (N - 1)] = true;
                solve(x + 1);
                col[y] = false;
                slash[x + y] = false;
                backslash[x - y + (N - 1)] = false;
            }
        }
    }
}