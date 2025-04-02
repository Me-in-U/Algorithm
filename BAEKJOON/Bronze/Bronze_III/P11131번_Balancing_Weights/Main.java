package P11131번_Balancing_Weights;

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

        }
    }

    private static int readInt() throws IOException {
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
