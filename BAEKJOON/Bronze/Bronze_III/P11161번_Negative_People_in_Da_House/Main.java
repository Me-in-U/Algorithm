package BAEKJOON.Bronze.Bronze_III.P11161번_Negative_People_in_Da_House;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        while (T-- > 0) {
            int M = readInt();
            int min = Integer.MAX_VALUE;
            int accumulation = 0;
            while (M-- > 0) {
                int p1 = readInt();
                int p2 = readInt();
                accumulation += (p1 - p2);
                min = Math.min(min, accumulation);
            }
            sb.append(min < 0 ? min * -1 : "0").append('\n');
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
