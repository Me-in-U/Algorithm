package P18141번_Are_They_All_Integers;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = readInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if ((i != j) && (j != k) && (i != k)) {
                        double x = (A[i] - A[j]) / (A[k] * 1.0);
                        if ((int) x != x) {
                            System.out.println("no");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("yes");
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
