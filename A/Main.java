package A;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int nearest = 601;
        while (N-- > 0) {
            int sum = readInt() + readInt() + readInt();
            if (512 <= sum) {
                nearest = Math.min(nearest, sum);
            }
        }
        System.out.print(nearest == 601 ? "-1" : nearest);
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
