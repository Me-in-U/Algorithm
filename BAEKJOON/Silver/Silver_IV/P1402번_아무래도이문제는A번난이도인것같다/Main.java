package P1402번_아무래도이문제는A번난이도인것같다;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int T = readInt();
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            readInt();
            readInt();
            sb.append("yes\n");
        }
        System.out.print(sb.toString());
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