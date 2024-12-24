package P31907번_GIST_찍기;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = readInt();
        StringBuilder dot = new StringBuilder(".".repeat(N));
        StringBuilder g = new StringBuilder().append("G".repeat(N)).append(dot).append(dot).append(dot).append('\n');
        StringBuilder it = new StringBuilder().append(dot).append("I".repeat(N)).append(dot)
                .append("T".repeat(N)).append('\n');
        StringBuilder s = new StringBuilder().append(dot).append(dot).append("S".repeat(N)).append(dot)
                .append('\n');
        StringBuilder result = new StringBuilder(16 * N * N);
        for (int i = 0; i < N; i++) {
            result.append(g);
        }
        for (int i = 0; i < N; i++) {
            result.append(it);
        }
        for (int i = 0; i < N; i++) {
            result.append(s);
        }
        bw.write(result.toString());
        bw.flush();
    }

    public static int readInt() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n << 3) + (n << 1) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}