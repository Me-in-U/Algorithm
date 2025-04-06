package BAEKJOON.Gold.Gold_II.P10775번_공항;

import java.io.IOException;

public class Main {
    public static int[] substitutionGate;

    public static void main(String[] args) throws IOException {
        int G = readInt();
        int P = readInt();
        int count = 0;
        substitutionGate = new int[G + 1];
        for (int i = 1; i < G + 1; i++) {
            substitutionGate[i] = i;
        }
        while (P-- > 0) {
            int gi = readInt();
            int openGate = find(gi);
            if (openGate == 0)
                break;
            substitutionGate[openGate] = find(openGate - 1);
            count++;
        }
        System.out.println(count);
    }

    public static int find(int x) {
        if (substitutionGate[x] != x)
            substitutionGate[x] = find(substitutionGate[x]);
        return substitutionGate[x];
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
