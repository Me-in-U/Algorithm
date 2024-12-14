package P23808번_골뱅이_찍기_ㅂ;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = read();
        char[] a_a = new char[N * 5];
        char[] aaa = new char[N * 5];

        for (int i = 0; i < N; i++)
            a_a[i] = '@';
        for (int i = N; i < N * 4; i++)
            a_a[i] = ' ';
        for (int i = N * 4; i < N * 5; i++)
            a_a[i] = '@';

        for (int i = 0; i < N * 5; i++)
            aaa[i] = '@';

        StringBuilder result = new StringBuilder((N * 5) * (N * 6));
        for (int i = 0; i < N * 2; i++)
            result.append(a_a).append('\n');
        for (int i = 0; i < N; i++)
            result.append(aaa).append('\n');
        for (int i = 0; i < N; i++)
            result.append(a_a).append('\n');
        for (int i = 0; i < N; i++)
            result.append(aaa).append('\n');

        bw.write(result.toString());
        bw.flush();
    }

    public static int read() throws IOException {
        int c;
        int n = System.in.read() & 15;
        while ((c = System.in.read()) >= 48)
            n = (n << 3) + (n << 1) + (c & 15);
        if (c == 13)
            System.in.read();
        return n;
    }
}