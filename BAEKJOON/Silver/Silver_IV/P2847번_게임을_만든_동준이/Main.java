package BAEKJOON.Silver.Silver_IV.P2847번_게임을_만든_동준이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] points = new int[N];
        for (int i = 0; i < N; i++) {
            points[i] = Integer.parseInt(br.readLine());
        }
        int max = points[N - 1];
        int result = 0;
        for (int i = N - 2; i >= 0; i--) {
            if (max <= points[i]) {
                int reducePoint = points[i] - max + 1;
                points[i] -= reducePoint;
                result += reducePoint;
            }
            max = points[i];
        }
        System.out.println(result);
    }
}