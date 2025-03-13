package P32941번_왜_맘대로_예약하냐고;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int T = readInt();
        int[] attend = new int[T + 1];
        int X = readInt();
        int N = readInt();
        for (int n = 0; n < N; n++) {
            int K = readInt();
            for (int i = 0; i < K; i++) {
                attend[readInt()]++;
            }
        }
        System.out.print(attend[X] == N ? "YES" : "NO");
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
