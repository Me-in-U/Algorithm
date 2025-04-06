package BAEKJOON.Bronze.Bronze_I.P2810번_컵홀더;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int s = 0;
        int l = 0;
        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == 'S') {
                s++;
            } else {
                l++;
            }
        }
        System.out.println(Math.min(N, s + (l / 2) + 1));
    }
}