package BAEKJOON.Bronze.Bronze_III.P27159번_노_땡스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] parts = br.readLine().split(" ");
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(parts[i]);
        }
        int score = cards[0];
        for (int i = 1; i < N; i++) {
            if (cards[i] - cards[i - 1] != 1) {
                score += cards[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(score);
        System.out.println(sb.toString());
    }
}
