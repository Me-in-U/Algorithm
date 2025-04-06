package BAEKJOON.Bronze.Bronze_III.P11131번_Balancing_Weights;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        while (T-- > 0) {
            int N = readInt();
            int[] weights = new int[N];
            for (int i = 0; i < N; i++)
                weights[i] = readInt();
            int torque = 0;
            for (int i = 0; i < N; i++) {
                torque += 100 * weights[i];
            }
            String output;
            if (torque == 0) {
                output = "Equilibrium";
            } else {
                output = torque > 0 ? "Right" : "Left";
            }
            sb.append(output).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
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
