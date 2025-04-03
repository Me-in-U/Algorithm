package P11213번_Black_Friday;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] dice = new int[7];
        for (int i = 1; i <= n; i++) {
            int num = readInt();
            if (dice[num] == -1) {
                continue;
            }
            if (dice[num] == 0) {
                dice[num] = i;
            } else {
                dice[num] = -1;
            }
        }
        for (int i = 6; i >= 1; i--) {
            if (dice[i] != -1 && dice[i] != 0) {
                System.out.println(dice[i]);
                return;
            }
        }
        System.out.println("none");
    }

    private static int readInt() throws IOException {
        int c, n = 0;
        c = System.in.read();
        while (c <= ' ') {
            c = System.in.read();
        }
        while ('0' <= c && c <= '9') {
            n = (n * 10) + (c & 15);
            c = System.in.read();
        }
        return n;
    }
}
