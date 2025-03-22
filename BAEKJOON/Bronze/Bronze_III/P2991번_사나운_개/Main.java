package P2991번_사나운_개;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int A = readInt();
        int B = readInt();
        int C = readInt();
        int D = readInt();
        int[] PMN = new int[] { readInt(), readInt(), readInt() };
        for (int n : PMN) {
            int attacked = 0;
            int mod1 = n % (A + B);
            if (mod1 > 0 && mod1 <= A) {
                attacked++;
            }
            int mod2 = n % (C + D);
            if (mod2 > 0 && mod2 <= C) {
                attacked++;
            }
            sb.append(attacked).append('\n');
        }
        System.out.print(sb.toString());
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
