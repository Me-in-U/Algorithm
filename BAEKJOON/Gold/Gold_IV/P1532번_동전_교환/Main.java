package BAEKJOON.Gold.Gold_IV.P1532번_동전_교환;

import java.io.IOException;

public class Main {
    private static int G1, G2, S1, S2, B1, B2, count;

    public static void main(String[] args) throws IOException {
        G1 = readInt();
        S1 = readInt();
        B1 = readInt();
        G2 = readInt();
        S2 = readInt();
        B2 = readInt();
        while (B1 < B2) {
            if (!StoB()) {
                if (!GtoS()) {
                    System.out.print("-1");
                    return;
                }
            }
        }
        while (S1 < S2) {
            if (!GtoS()) {
                if (!BtoS()) {
                    System.out.print("-1");
                    return;
                }
            }
        }
        while (G1 < G2) {
            if (!StoG()) {
                if (!BtoS()) {
                    System.out.print("-1");
                    return;
                }
            }
        }
        System.out.print(count);
    }

    private static boolean StoG() {
        if (S1 - 11 >= S2) {
            S1 -= 11;
            G1++;
            count++;
            return true;
        }
        return false;
    }

    private static boolean BtoS() {
        if (B1 - 11 >= B2) {
            B1 -= 11;
            S1++;
            count++;
            return true;
        }
        return false;
    }

    private static boolean StoB() {
        if (S1 == 0) {
            return false;
        }
        S1--;
        B1 += 9;
        count++;
        return true;
    }

    private static boolean GtoS() {
        if (G1 - 1 < G2) {
            return false;
        }
        G1--;
        S1 += 9;
        count++;
        return true;
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
