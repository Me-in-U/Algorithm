package BAEKJOON.Bronze.Bronze_III.P9493번_길면_기차_기차는_빨라_빠른_것은_비행기;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            double M = readInt();
            double A = readInt();
            double B = readInt();
            if (M == 0 && A == 0 && B == 0) {
                break;
            }
            double diff = Math.round(((M / A) - (M / B)) * 3600);
            int hour = (int) diff / 3600;
            int minute = (int) (diff % 3600) / 60;
            int second = (int) diff % 60;
            sb.append(hour).append(":").append(String.format("%02d", minute)).append(":")
                    .append(String.format("%02d", (int) Math.round(second))).append('\n');
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
