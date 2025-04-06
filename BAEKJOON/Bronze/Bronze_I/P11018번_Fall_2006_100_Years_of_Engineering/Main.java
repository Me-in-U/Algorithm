package BAEKJOON.Bronze.Bronze_I.P11018번_Fall_2006_100_Years_of_Engineering;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int K = readInt();
        for (int testCase = 1; testCase <= K; testCase++) {
            int stagesCount_N = readInt();
            double leftoverWeight_M = readDouble();
            double[] mass = new double[stagesCount_N];
            double[] time = new double[stagesCount_N];
            double[] force = new double[stagesCount_N];
            double currentMass = leftoverWeight_M;
            for (int i = 0; i < stagesCount_N; i++) {
                currentMass += (mass[i] = readDouble());
                time[i] = readDouble();
                force[i] = readDouble();
            }
            double height = 0.0;
            double velocity = 0.0;
            final double g = 9.81;
            for (int i = 0; i < stagesCount_N; i++) {
                // a = (F - Mg) / M
                // a = (F / M) - g
                double acceleration = force[i] / currentMass - g;
                // vt + (1/2)at^2
                height += velocity * time[i] + 0.5 * acceleration * time[i] * time[i];
                // v = v + at
                velocity += acceleration * time[i];
                currentMass -= mass[i];
            }
            sb.append("Data Set ").append(testCase).append(":\n");
            sb.append(String.format("%.2f", height)).append("\n\n");
        }
        System.out.print(sb.toString().trim());
    }

    private static double readDouble() throws IOException {
        int c;
        double n = 0;
        int sign = 1;
        while ((c = System.in.read()) <= 32)
            ;
        if (c == '-') {
            sign = -1;
            c = System.in.read();
        } else if (c == '+') {
            c = System.in.read();
        }
        while (c > 47) {
            n = n * 10 + (c & 15);
            c = System.in.read();
        }
        if (c == '.') {
            double fraction = 0;
            double factor = 1;
            while ((c = System.in.read()) > 47 && c < 58) {
                fraction = fraction * 10 + (c & 15);
                factor *= 10;
            }
            n += fraction / factor;
        }
        if (c == 13)
            System.in.read();
        return sign * n;
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
