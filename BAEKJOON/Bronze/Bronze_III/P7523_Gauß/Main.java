package P7523_Gauß;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt3();
        for (int i = 1; i <= T; i++) {
            int n = readInt3();
            int m = readInt3();
            long sum = sumRange(n, m);
            sb.append("Scenario #").append(i).append(":\n").append(sum).append("\n\n");
        }

        System.out.print(sb.toString().trim());
    }

    public static long sumRange(int N1, int N2) {
        long n = (long) (N2 - N1 + 1);
        return n * (N1 + N2) / 2;
    }

    public static int readInt3() throws IOException {
        int n = 0;
        int c = System.in.read();
        boolean isNegative = false;
        while (c <= 32) {
            c = System.in.read();
        }
        if (c == '-') {
            isNegative = true;
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c - '0');
            c = System.in.read();
        }
        return isNegative ? -n : n;
    }
}
