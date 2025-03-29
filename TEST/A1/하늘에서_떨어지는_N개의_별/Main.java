package TEST.A1.하늘에서_떨어지는_N개의_별;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int D = readInt();
        int K = readInt();
        int max = 0;
        for (int i = 0; i < N; i++) {
            int temp = readInt();
            if (max < temp)
                max = temp;
        }
        int x = K / max;
        int cleanCount = (D + x - 1) / x - 1;
        if (cleanCount < 0)
            cleanCount = 0;
        System.out.println(cleanCount);
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        while ((c = System.in.read()) > 47)
            n = (n * 10) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}
