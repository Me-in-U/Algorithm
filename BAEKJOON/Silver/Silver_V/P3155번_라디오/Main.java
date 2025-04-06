package BAEKJOON.Silver.Silver_V.P3155번_라디오;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int N = Integer.parseInt(br.readLine());
        int min = Math.abs(A - B);
        for (int i = 0; i < N; i++) {
            int next = Integer.parseInt(br.readLine());
            min = Math.min(Math.abs(B - next) + 1, min);
        }
        System.out.println(min);
    }
}