package BAEKJOON.Bronze.Bronze_III.P5751번_Head_or_Tail;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int N = readInt();
            if (N == 0)
                break;
            int mary = 0;
            for (int i = 0; i < N; i++) {
                int r = readInt();
                if (r == 0)
                    mary++;
            }
            int john = N - mary;
            sb.append("Mary won ").append(mary).append(" times and John won ").append(john).append(" times\n");
        }
        System.out.print(sb.toString());
    }

    private static int readInt() throws IOException {
        int c = System.in.read(), n = 0;
        while (c <= ' ')
            c = System.in.read();
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
