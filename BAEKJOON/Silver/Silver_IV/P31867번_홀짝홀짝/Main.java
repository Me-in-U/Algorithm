package BAEKJOON.Silver.Silver_IV.P31867번_홀짝홀짝;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String K = br.readLine();
        int[] evenOdd = new int[2];
        while (--N >= 0)
            evenOdd[(K.charAt(N) - '0') % 2]++;
        System.out.println(evenOdd[0] <= evenOdd[1] ? (evenOdd[0] == evenOdd[1] ? -1 : 1) : 0);
    }
}