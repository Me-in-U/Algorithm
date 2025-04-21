package BAEKJOON.Bronze.Bronze_II.P17293번_맥주_99병;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int N = readInt();
        int remaining = N;
        for (int i = N; i >= 0; i--) {
            // 첫번째 문장
            sb.append(remaining == 0 ? "No more" : remaining).append(remaining == 1 ? " bottle" : " bottles")
                    .append(" of beer on the wall, ");
            sb.append(remaining == 0 ? "no more" : remaining).append(remaining == 1 ? " bottle" : " bottles")
                    .append(" of beer.\n");
            // 두번째 문장
            if (remaining == 0) {
                sb.append("Go to the store and buy some more, ");
                remaining = N;
                sb.append(remaining).append(remaining == 1 ? " bottle" : " bottles").append(" of beer on the wall.\n");
            } else {
                remaining--;
                sb.append("Take one down and pass it around, ").append(remaining == 0 ? "no more" : remaining)
                        .append(remaining == 1 ? " bottle" : " bottles").append(" of beer on the wall.\n");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
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