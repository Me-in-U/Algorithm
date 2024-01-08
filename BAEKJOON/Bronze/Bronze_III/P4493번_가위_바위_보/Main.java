package BAEKJOON.Bronze.Bronze_III.P4493번_가위_바위_보;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] playerWins = new int[3];
            for (int j = 0; j < N; j++) {
                String RPS = br.readLine();
                playerWins[result(RPS.charAt(0), RPS.charAt(2))]++;
            }
            sb.append(playerWins[1] > playerWins[2] ? "Player 1" : playerWins[1] < playerWins[2] ? "Player 2" : "TIE")
                    .append('\n');
        }
        System.out.print(sb.toString());
    }

    public static int result(char a, char b) {
        if (a == b)
            return 0;
        if ((a == 'R' && b == 'S') ||
                (a == 'P' && b == 'R') ||
                (a == 'S' && b == 'P')) {
            return 1;
        }
        return 2;
    }
}
