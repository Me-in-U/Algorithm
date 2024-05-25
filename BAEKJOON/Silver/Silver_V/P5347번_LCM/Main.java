package BAEKJOON.Silver.Silver_V.P5347번_LCM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            long a = Integer.parseInt(st.nextToken());
            long b = Integer.parseInt(st.nextToken());
            System.out.println((a * b) / gcd(a, b));
        }
    }

    public static long gcd(long x, long y) {
        if (x % y == 0)
            return y;
        return gcd(y, x % y);
    }
}