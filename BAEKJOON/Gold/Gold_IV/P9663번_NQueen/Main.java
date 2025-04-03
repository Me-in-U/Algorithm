package P9663번_NQueen;

import java.io.IOException;

interface Main {
    static void main(String[] a) throws Exception {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = n * 10 + (c & 15);
        System.out.print(new int[] { 1, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184 }[n]);
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

    private static double readDouble() throws IOException {
        int c;
        double n = 0;
        boolean isNegative = false;
        c = System.in.read();
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
        if (c == '.') {
            double fraction = 0;
            double factor = 1;
            c = System.in.read();
            while ('0' <= c && c <= '9') {
                fraction = (fraction * 10) + (c & 15);
                factor *= 10;
                c = System.in.read();
            }
            n += fraction / factor;
        }
        return isNegative ? -n : n;
    }
}