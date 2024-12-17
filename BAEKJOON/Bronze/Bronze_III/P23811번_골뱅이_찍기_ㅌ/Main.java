package P23811번_골뱅이_찍기_ㅌ;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = readInt();
        String aaaaa = "@".repeat(N * 5);
        String a = "@".repeat(N);
        StringBuilder result = new StringBuilder((3 * (N * (N * 5 + 1))) + (2 * N * (N + 1)));
        for (int i = 0; i < N; i++) {
            result.append(a).append('\n');
        }
        for (int i = 0; i < N; i++) {
            result.append(aaaaa).append('\n');
        }
        result.append(result);
        for (int i = 0; i < N; i++) {
            result.insert(0, '\n').insert(0, aaaaa);
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