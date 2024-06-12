package BAEKJOON.Silver.Silver_V.P14490번_백대열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(":");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int gcd = GCD(n, m);
        sb.append(n / gcd).append(':').append(m / gcd);
        System.out.print(sb.toString());
    }

    public static int GCD(int a, int b) {
        if (b % a == 0)
            return a;
        else
            return GCD(b % a, a);
    }
}