package P31789번_모험의_시작;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int X = readInt();
        int S = readInt();
        boolean adventure = false;
        while (N-- > 0) {
            int c = readInt();
            int p = readInt();
            if (X >= c && S < p) {
                adventure = true;
                break;
            }
        }
        System.out.println(adventure ? "YES" : "NO");
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
