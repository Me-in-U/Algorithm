package BAEKJOON.Bronze.Bronze_III.P10874번_이교수님의_시험;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] pattern = new int[10];
        for (int j = 0; j < 10; j++) {
            pattern[j] = (j % 5) + 1;
        }

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            boolean match = true;

            for (int j = 0; j < 10; j++) {
                int ans = Integer.parseInt(st.nextToken());
                if (ans != pattern[j]) {
                    match = false;
                    for (int k = j + 1; k < 10; k++)
                        st.nextToken();
                    break;
                }
            }

            if (match) {
                sb.append(i).append('\n');
            }
        }
        System.out.print(sb);
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        boolean isNegative = false;
        while (c <= ' ') {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}
