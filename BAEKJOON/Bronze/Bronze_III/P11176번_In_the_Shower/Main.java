package P11176번_In_the_Shower;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        while (T-- > 0) {
            int count = 0;
            int E = readInt();
            int N = readInt();
            while (N-- > 0) {
                if (E < readInt()) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb.toString());
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
