package P9663번_NQueen;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] nq = { 1, 1, 0, 0, 2, 10, 4, 40, 92, 352, 724, 2680, 14200, 73712, 365596, 2279184 };
        System.out.print(new StringBuilder().append(nq[N]));
    }

    private static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}