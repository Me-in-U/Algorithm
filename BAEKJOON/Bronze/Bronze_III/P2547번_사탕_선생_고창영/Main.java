package P2547번_사탕_선생_고창영;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = (int) readInt();
        while (T-- > 0) {
            System.in.read();
            System.in.read();
            long remains = 0;
            long N = readInt();
            for (int i = 0; i < N; i++) {
                remains += readInt();
                remains %= N;
            }
            sb.append(remains == 0 ? "YES" : "NO").append("\n");
        }
        System.out.print(sb.toString());
    }

    private static long readInt() throws IOException {
        int c;
        long n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
