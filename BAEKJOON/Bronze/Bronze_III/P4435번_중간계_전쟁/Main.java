package BAEKJOON.Bronze.Bronze_III.P4435번_중간계_전쟁;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int[] GANDALF_SCORE = { 1, 2, 3, 3, 4, 10 };
    private static final int[] SAURON_SCORE = { 1, 2, 2, 2, 3, 5, 10 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int gs = calculateScore(br.readLine().split(" "), GANDALF_SCORE);
            int ss = calculateScore(br.readLine().split(" "), SAURON_SCORE);
            String output = (gs > ss) ? "Good triumphs over Evil"
                    : (gs == ss) ? "No victor on this battle field" : "Evil eradicates all trace of Good";
            sb.append("Battle ").append(i).append(": ").append(output).append('\n');
        }
        System.out.print(sb);
    }

    private static int calculateScore(String[] input, int[] weights) {
        int score = 0;
        for (int i = 0; i < input.length; i++) {
            score += Integer.parseInt(input[i]) * weights[i];
        }
        return score;
    }
}
