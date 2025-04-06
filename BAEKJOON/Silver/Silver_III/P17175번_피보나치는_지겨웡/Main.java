package BAEKJOON.Silver.Silver_III.P17175번_피보나치는_지겨웡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n < 2) {
            System.out.println(1);
            return;
        }
        long[] count = new long[n + 1];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i <= n; i++)
            count[i] = (1 + count[i - 1] + count[i - 2]) % 1000000007;
        System.out.print(count[n]);
    }
}