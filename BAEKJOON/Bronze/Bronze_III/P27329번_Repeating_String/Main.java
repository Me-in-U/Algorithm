package P27329번_Repeating_String;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = readInt();
        char[] str = readString();
        for (int i = 0; i < N / 2; i++) {
            if (str[i] != str[i + (N >> 1)]) {
                bw.write("No");
                bw.flush();
                return;
            }
        }
        bw.write("Yes");
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

    public static char[] readString() throws IOException {
        int c;
        StringBuilder sb = new StringBuilder();
        while ((c = System.in.read()) != -1 && c != '\n' && c != '\r')
            sb.append((char) c);
        if (c == '\r')
            System.in.read();
        return sb.toString().toCharArray();
    }
}