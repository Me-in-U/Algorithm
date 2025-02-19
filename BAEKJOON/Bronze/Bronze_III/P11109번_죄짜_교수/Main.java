package P11109번_죄짜_교수;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int T = readInt();
        while (T-- > 0) {
            int d = readInt();
            int n = readInt();
            int s = readInt();
            int p = readInt();
            int serialized = n * s;
            int parallelized = d + n * p;
            if (serialized == parallelized) {
                sb.append("does not matter\n");
                continue;
            }
            sb.append(serialized < parallelized ? "do not parallelize\n" : "parallelize\n");
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