package P15151번_Incomplete_Book;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int k = readInt();
        int d = readInt();
        int count = 0;
        while (true) {
            if (d - k >= 0) {
                count++;
                d -= k;
                k <<= 1;
            } else {
                break;
            }
        }
        System.out.print(count);
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
        while (c <= ' ') {
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
