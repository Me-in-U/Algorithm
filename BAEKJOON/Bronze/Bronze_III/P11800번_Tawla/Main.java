package BAEKJOON.Bronze.Bronze_III.P11800번_Tawla;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        String[] same = { "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh" };
        String[] diff = { "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh" };
        String excep = "Sheesh Beesh";
        int T = readInt();
        for (int i = 1; i <= T; i++) {
            int a = readInt();
            int b = readInt();
            sb.append("Case ").append(i).append(": ");
            if (a == b) {
                sb.append(same[a - 1]).append('\n');
            } else if ((a == 5 && b == 6) || (a == 6 && b == 5)) {
                sb.append(excep).append('\n');
            } else {
                if (a > b) {
                    sb.append(diff[a - 1]).append(' ').append(diff[b - 1]).append('\n');
                } else {
                    sb.append(diff[b - 1]).append(' ').append(diff[a - 1]).append('\n');
                }
            }
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